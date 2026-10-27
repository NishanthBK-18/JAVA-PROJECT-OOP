import java.util.Scanner;

interface MobileDetails
{
    void getDetails();
}

interface Discount
{
    void calculateDiscount();
}

interface Features
{
    void showFeatures();
}

class SmartPhone implements MobileDetails, Discount, Features
{
    String brand, model;
    double price, discountPrice;
    int choice;

    Scanner sc = new Scanner(System.in);

    public void getDetails()
    {
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    public void calculateDiscount()
    {
        if(choice == 1)
            discountPrice = price - 5000;
        else if(choice == 2)
            discountPrice = price - 8000;
        else
            discountPrice = price - 2000;
    }

    public void showFeatures()
    {
        System.out.println("\n----- Mobile Details -----");
        System.out.println("Brand : " + brand);

        if(choice == 1)
        {
            model = "Samsung Galaxy S24";
            System.out.println("Model : " + model);
            System.out.println("Feature : AI Camera + Snapdragon Processor");
        }
        else if(choice == 2)
        {
            model = "iPhone 16";
            System.out.println("Model : " + model);
            System.out.println("Feature : A18 Chip + Apple Intelligence");
        }
        else if(choice == 3)
        {
            model = "Redmi Note 14";
            System.out.println("Model : " + model);
            System.out.println("Feature : AMOLED Display + Fast Charging");
        }

        System.out.println("Price : " + price);
        System.out.println("Discounted Price : " + discountPrice);
    }
}

public class Main6a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SmartPhone s = new SmartPhone();

        System.out.println("===== SMARTPHONE STORE =====");
        System.out.println("1. Samsung Galaxy S24");
        System.out.println("2. iPhone 16");
        System.out.println("3. Redmi Note 14");

        System.out.print("Enter Choice: ");
        s.choice = sc.nextInt();
        sc.nextLine();

        if(s.choice >= 1 && s.choice <= 3)
        {
            s.getDetails();
            s.calculateDiscount();
            s.showFeatures();
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    }
}