class MobileStore {

    int availablePhones = 2;

    synchronized void buyPhone(String name, int phones) {

        System.out.println(name + " wants to buy " + phones + " phone(s).");

        while (availablePhones < phones) {

            System.out.println(name + " is waiting for phones...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        availablePhones -= phones;

        System.out.println(name + " bought " + phones + " phone(s).");
        System.out.println("Available Phones: " + availablePhones);
    }

    synchronized void returnPhone(String name, int phones) {

        availablePhones += phones;

        System.out.println(name + " returned " + phones + " phone(s).");
        System.out.println("Available Phones: " + availablePhones);

        notify();
    }
}

class PurchaseThread extends Thread {

    MobileStore store;
    String name;
    int phones;

    PurchaseThread(MobileStore store, String name, int phones) {
        this.store = store;
        this.name = name;
        this.phones = phones;
    }

    public void run() {
        store.buyPhone(name, phones);
    }
}

class ReturnThread extends Thread {

    MobileStore store;
    String name;
    int phones;

    ReturnThread(MobileStore store, String name, int phones) {
        this.store = store;
        this.name = name;
        this.phones = phones;
    }

    public void run() {
        store.returnPhone(name, phones);
    }
}

public class Main9n {

    public static void main(String[] args) {

        System.out.println("Starting Mobile Phone Store Management System...");

        MobileStore store = new MobileStore();

        PurchaseThread t1 =
            new PurchaseThread(store, "Customer 1", 2);

        PurchaseThread t2 =
            new PurchaseThread(store, "Customer 2", 1);

        ReturnThread t3 =
            new ReturnThread(store, "Customer 1", 1);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Store operations started successfully.");
    }
}