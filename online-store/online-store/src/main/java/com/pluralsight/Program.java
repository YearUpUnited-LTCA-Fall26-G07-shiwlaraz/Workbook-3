package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Program {


    public static HashMap<String, Product> products;
    public static ArrayList<Product> cart;

    public static void main(String[] args){
        products = loadProducts();

        showScreenHome();

        //  displayItems(products);




    }

    public static HashMap<String, Product> loadProducts(){
        //this will eventually load from a file.

        HashMap<String, Product> result = new HashMap<>();

        try {

            FileReader fr = new FileReader("products.csv");
            BufferedReader br = new BufferedReader(fr);

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                Product p = getProductFromDataLine(line);
                if( p != null){
                    result.put(p.getSku(), p);
                }

            }

            br.close();

        }
        catch(Exception e) {

            System.out.println("There was an error with the message of: " + e.getMessage());
        }

        return result;

    }

    private static Product getProductFromDataLine(String line) {

//        SKU|Product Name|Price|Department
//        AV1051|JBL Bluetooth Speaker|89.95|Audio Video
//        AV1312|Mini 1000 Lumens Projector|149.95|Audio Video
//        AV1412|XLR Podcast Cardiod Mic|44.99|Audio Video

        try{
            String[] parts = line.split("\\|");

            String sku = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            String department = parts[3];

            return new Product(sku, name, price, department);

        } catch (Exception e) {
            System.out.println("Encountered an error processing data line: " + line);
            return null;
        }


    }

    public static void showScreenHome(){


        String mainMenuText = """
                
                
                === MAIN MENU ===
                
                What do you want to do?
                1 - Display Products
                2 - Display Cart
                0 - Quit
                Enter your command:""";

        int choice;
        do{
            choice = Console.promptForInt(mainMenuText);
            switch(choice){
                case 1 -> showScreenDisplayProducts();
                case 2 -> showScreenDisplayCart();
                default -> System.out.println("Invalid command, please try again...");
            }
        }  while (choice != 0);

    }


    public static void showScreenDisplayProducts(){

        System.out.println("show display products menu");



        String menuText = """
                
                
                === DISPLAY PRODUCTS ===
                
                What do you want to do?
                1 - Display all products
                2 - Search for Products
                3 - Add Product to Cart
                0 - Exit to Main
                Enter your command:""";

        int choice;
        do{
            choice = Console.promptForInt(menuText);
            switch(choice){
                case 1 -> doDisplayAllProducts();
                case 2 -> doSearchForProducts();
                case 3 -> doAddProductToCart();
                default -> System.out.println("Invalid command, please try again...");
            }
        }  while (choice != 0);




        // Display All, or Search

        // Add To Cart

        // Go Back


    }

    private static void doDisplayAllProducts() {
        System.out.println("All Products:");
        displayItems(products);

    }

    private static void doSearchForProducts() {
    }

    private static void doAddProductToCart() {
    }

    public static void showScreenDisplayCart(){
        System.out.println("show display cart menu");
        //Display items in cart.

        //Display Total Sales Amount

        //Check Out (not functional yet)

        //Remove Product

        // Go back to home screen.

    }

    public static void displayItems(HashMap<String, Product> products){
        // display products in a nicely formatted table.
        System.out.println("SKU       | NAME                                              | DEPT           | PRICE");
        for(Product p : products.values()){
            System.out.printf("%-9s | %49s | %-14s | %10.2f\n", p.getSku(), p.getName(), p.getDepartment(), p.getPrice());
        }

    }





}