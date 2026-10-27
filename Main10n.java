class MobileStore {

    private int stock = 5;
    private double balance = 0;

    private final Object storeLock = new Object();
    private final Object paymentLock = new Object();

    public void purchase(String customer, String mobile, double price) {

        synchronized (storeLock) {

            System.out.println(customer + " is checking " + mobile + "...");

            synchronized (paymentLock) {

                if (stock > 0) {
                    stock--;
                    balance += price;

                    System.out.println(customer + " purchased " + mobile);
                    System.out.println("Price: Rs." + price);
                    System.out.println("Remaining Stock: " + stock);
                    System.out.println();
                } else {
                    System.out.println("Sorry " + customer + ", " + mobile
                            + " is out of stock.");
                }
            }
        }
    }
}

class Customer extends Thread {

    private MobileStore store;
    private String customerName;
    private String mobileName;
    private double price;

    Customer(MobileStore store, String customerName,
             String mobileName, double price) {

        this.store = store;
        this.customerName = customerName;
        this.mobileName = mobileName;
        this.price = price;
    }

    public void run() {

        store.purchase(customerName, mobileName, price);
    }
}

public class Main10n {

    public static void main(String[] args) {

        MobileStore store = new MobileStore();

        Customer c1 = new Customer(
                store, "Arun", "Samsung Galaxy S24", 49000);

        Customer c2 = new Customer(
                store, "Bala", "iPhone 16", 70000);

        Customer c3 = new Customer(
                store, "Karthi", "Redmi Note 14", 18000);

        Customer c4 = new Customer(
                store, "Rahul", "OnePlus 13", 65000);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}