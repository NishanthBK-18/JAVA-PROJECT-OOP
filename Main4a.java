import java.util.Scanner;

class MobilePhone
{
    String brand;
    String model;
    double price;

    void getDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Model: ");
        model = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayDetails()
    {
        System.out.println("\n----- Mobile Details -----");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

class Store extends MobilePhone
{
    int quantity;

    void getStoreDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    void displayStoreDetails()
    {
        displayDetails();

        System.out.println("Quantity : " + quantity);

        double total = price * quantity;
        System.out.println("Total Amount : " + total);

        if(total >= 100000)
        {
            System.out.println("Congratulations! You got 10% Discount.");
        }
        else
        {
            System.out.println("No Discount.");
        }
    }
}

public class Main4a
{
    public static void main(String[] args)
    {
        Store s = new Store();

        s.getDetails();
        s.getStoreDetails();

        System.out.println();
        s.displayStoreDetails();
    }
}