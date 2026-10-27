class MobileStoreRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is checking available mobile phones...");

        System.out.println("Samsung Galaxy S24");
        System.out.println("iPhone 16");
        System.out.println("Redmi Note 14");

        System.out.println("Mobile phone details displayed successfully.");
    }
}

public class Main8b {
    public static void main(String[] args) {

        System.out.println("Starting mobile inventory process...");

        MobileStoreRunnable obj = new MobileStoreRunnable();
        Thread t1 = new Thread(obj);
        t1.start();

        System.out.println("Main thread completed.");
    }
}