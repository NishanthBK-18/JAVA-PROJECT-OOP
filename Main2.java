import java.util.Scanner;

class Mobile
{
    private String brand;

    public int price;

    static String storeName = "KING MOBILES";

    Mobile(String b, int p)
    {
        brand = b;
        price = p;
    }

    public void display()
    {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }

    public void display(String color)
    {
        System.out.println("Color : " + color);
    }

    static void showStore()
    {
        System.out.println("Store : " + storeName);
    }

    private void message()
    {
        System.out.println("Thank You for Visiting!");
    }

    public void showMessage()
    {
        message();
    }
}

public class Main2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Brand : ");
        String brand = sc.nextLine();

        System.out.print("Enter Mobile Price : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Mobile Color : ");
        String color = sc.nextLine();

        Mobile m = new Mobile(brand, price);

        System.out.println("\nMobile Details");
        m.display();
        m.display(color);
        m.showMessage();

        System.out.println();
        Mobile.showStore();

        sc.close();
    }
}