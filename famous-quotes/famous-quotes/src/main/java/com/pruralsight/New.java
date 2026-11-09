package com.pruralsight;

import java.awt.print.Book;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class New {
    public static void main(String[] args) {
        Book b = new Book("Dune", 412);

        System.out.println(b.title + " - " + b.pages);
    }
}



