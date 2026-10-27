class Mobile
{
    String brand;
    int price;

    // Default Constructor
    Mobile()
    {
        brand = "Samsung";
        price = 25000;
    }

    // Parameterized Constructor
    Mobile(String b, int p)
    {
        brand = b;
        price = p;
    }

    void display()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple", 70000);

        System.out.println("Mobile 1");
        m1.display();

        System.out.println();

        System.out.println("Mobile 2");
        m2.display();
    }
}