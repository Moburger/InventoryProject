package InventoryProject;

import java.util.ArrayList;
import java.util.Scanner;
// Inventory system
public class MainClass {

    private static Scanner sc;
    public static ArrayList<Customer> cusList;

    ArrayList<InventoryProject.Shop> shopList = new ArrayList<InventoryProject.Shop>() ;
    public ArrayList<Customer> cusList = new ArrayList<Customer>();

    static void menu() {
        System.out.println("1- Add new item: ");
        System.out.println("2- Display all items: ");
        System.out.println("3- Add Customer Details: ");
        System.out.println("0- Exit");
    }

    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);
        ArrayList<InventoryProject.Shop> shopList = new ArrayList<InventoryProject.Shop>() ;
        ArrayList<Customer> cusList = new ArrayList<Customer>();

        do {
            InventoryProject.Shop s = new InventoryProject.Shop();
            menu();
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter item No: ");
                    s.setNo(sc.nextInt());
                    System.out.println("Enter item Name: ");
                    sc = new Scanner(System.in);
                    sc.next();
                    s.setName(sc.nextLine());
                    System.out.println("Enter Item Price: ");
                    s.setPrice(sc.nextInt());
                    s.addNewItem(s);
                    shopList.add(s);

                    break;

                case 2:
                    s.displayItems(shopList);
                    break;
                case 3:
                    sellOutDetails();
                    break;
                default:

                    break;
            }
        } while (opt != 0);
    }

    private static void sellOutDetails() {
        sc = new Scanner(System.in);
        Customer c = new Customer();

        System.out.println("Enter Customer Name: ");
        c.setCustomer_name(sc.nextLine());
        System.out.println("Enter item No: ");
        c.setItem_no(sc.nextInt());
        System.out.println("Enter Item Qty: ");
        c.setPurchase_qty(sc.nextInt());

        c.AddCustomerDetails(c);
        cusList.add(c);

        System.out.println("Do you have More items? (Yes/No)?");
        String choice = "";
        sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            // again input and update data of customer
            sellOutDetails();
        }
        else
        {
            // display bill
            c.DisplayCustomerBill(cusList, c.getCustomer_id());
        }

        c.AddCustomerDetails(c);
        cusList.add(c);
    }

}
