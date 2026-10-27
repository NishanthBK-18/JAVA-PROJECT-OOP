import java.util.Scanner;

class Mobile
{
    String brand;
    double price;

    void getDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
}

class Samsung extends Mobile
{
    void display()
    {
        System.out.println("\n----- Mobile Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : Samsung Galaxy S24");
        System.out.println("Price : " + price);

        if(price >= 50000)
            System.out.println("Discounted Price : " + (price - 5000));
        else
            System.out.println("Discounted Price : " + price);
    }
}

class iPhone extends Mobile
{
    void display()
    {
        System.out.println("\n----- Mobile Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : iPhone 16");
        System.out.println("Price : " + price);

        if(price >= 80000)
            System.out.println("Discounted Price : " + (price - 8000));
        else
            System.out.println("Discounted Price : " + price);
    }
}

class Redmi extends Mobile
{
    void display()
    {
        System.out.println("\n----- Mobile Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : Redmi Note 14");
        System.out.println("Price : " + price);

        if(price >= 25000)
            System.out.println("Discounted Price : " + (price - 2000));
        else
            System.out.println("Discounted Price : " + price);
    }
}

public class Main4b
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Samsung Galaxy S24");
        System.out.println("2. iPhone 16");
        System.out.println("3. Redmi Note 14");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        if(ch == 1)
        {
            Samsung s = new Samsung();
            s.getDetails();
            s.display();
        }
        else if(ch == 2)
        {
            iPhone i = new iPhone();
            i.getDetails();
            i.display();
        }
        else if(ch == 3)
        {
            Redmi r = new Redmi();
            r.getDetails();
            r.display();
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}