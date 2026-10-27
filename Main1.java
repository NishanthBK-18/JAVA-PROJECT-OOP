class Mobile
{
    String brand;
    int price;

    static String storeName = "KING MOBILES";

    Mobile()
    {
        brand = "Samsung";
        price = 25000;
    }

    Mobile(String b, int p)
    {
        brand = b;
        price = p;
    }

    // Method Overloading
    void display()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }

    void display(String color)
    {
        System.out.println("Color : " + color);
    }

    // Static Method
    static void showStore()
    {
        System.out.println("Store : " + storeName);
    }
}

public class Main1
{
    public static void main(String args[])
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple", 70000);

        m1.display();
        m1.display("Black");

        System.out.println();

        m2.display();
        m2.display("Blue");

        System.out.println();

        Mobile.showStore();
    }
}