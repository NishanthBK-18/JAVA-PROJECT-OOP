import java.util.Scanner;

abstract class Mobile
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

    abstract void display();
}

class Samsung extends Mobile
{
    void display()
    {
        System.out.println("\n----- Samsung Mobile -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : Samsung Galaxy S24");
        System.out.println("Price : " + price);

        if(price >= 50000)
            System.out.println("Discounted Price : " + (price - 5000));
        else
            System.out.println("Discounted Price : " + price);

        System.out.println("Feature : AI Camera + Snapdragon Processor");
    }
}

class iPhone extends Mobile
{
    void display()
    {
        System.out.println("\n----- iPhone Mobile -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : iPhone 16");
        System.out.println("Price : " + price);

        if(price >= 80000)
            System.out.println("Discounted Price : " + (price - 8000));
        else
            System.out.println("Discounted Price : " + price);

        System.out.println("Feature : A18 Chip + Apple Intelligence");
    }
}

class Redmi extends Mobile
{
    void display()
    {
        System.out.println("\n----- Redmi Mobile -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : Redmi Note 14");
        System.out.println("Price : " + price);

        if(price >= 25000)
            System.out.println("Discounted Price : " + (price - 2000));
        else
            System.out.println("Discounted Price : " + price);

        System.out.println("Feature : AMOLED Display + Fast Charging");
    }
}

public class Main6b
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SMARTPHONE STORE =====");
        System.out.println("1. Samsung Galaxy S24");
        System.out.println("2. iPhone 16");
        System.out.println("3. Redmi Note 14");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            Samsung s = new Samsung();
            s.getDetails();
            s.display();
        }
        else if(choice == 2)
        {
            iPhone i = new iPhone();
            i.getDetails();
            i.display();
        }
        else if(choice == 3)
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