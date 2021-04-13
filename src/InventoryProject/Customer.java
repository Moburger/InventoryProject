package InventoryProject;

import java.util.ArrayList;

public class Customer {

    private int customer_id;
    private String customer_name;
    private int purchase_qty;
    private int item_no;
    private double total_Bill;
    int total;
    private Shop[] shopList;

    // functions

    public void AddCustomerDetails(Customer c) {
        this.customer_name = c.customer_name;
        this.item_no = c.item_no;
        this.purchase_qty = c.purchase_qty;
    }

    public Object DisplayCustomerBill(ArrayList<Customer> arr , String cus_name) {
        for (Customer c : arr)
            if (c.customer_name.equals(cus_name)) {
            System.out.println("Item No\t\t Item Name\t\t\t\t Total Price" );
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println(c.item_no+"\t\t"+c.customer_name+"\t\t\t"+c.purchase_qty+"\t\t\t"+c.total_Bill);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

            for (Shop shop : shopList) {
                if (shop.getNo() == c.item_no) {
                    total = c.purchase_qty * 1;
                }
            }

    }
        System.out.println("Total bill before discount = " + total);
            float dis = 0;
            if (total < 200) {
                dis = total*15/100;
            }
            else
                if (total >= 200 && total < 700) {
                    dis = (total*25) / 100;
                }
                else
                    if(total > 700) {
                        dis = (total*50) / 100;
                    }

        System.out.println("Total bill after discount = " + (total - dis));


    // getter and setter

    public void double getTotal_Bill;
        return null;

    public void setTotal_Bill(double bill) {
        this.total_Bill = bill;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id() {
        this.customer_id = customer_id;
    }
        public int getCustomer_name() {
        return Integer.parseInt(customer_name);
    }
        public void setCustomer_name() {
        this.customer_name = customer_name;
    }
    public int getPurchase_qty() {
        return purchase_qty;
    }
    public void setPurchase_qty(int purchase_qty) {
        this.purchase_qty = purchase_qty;
    }
}

