package com.pluralsight;

public class Product {
    private String sku;
    private String name;
    private double price;
    private String department;

    public Product(String sko, String name, double price,String department) {
        this.sku = sko;
        this.name = name;
        this.price = price;
        this.department = sko;
    }
    public void setSko(String sko){
        this.sku = sko;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartment() {
        return department;
    }
}
