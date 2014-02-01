package com.practicaljava.l2;

import java.util.Scanner;

public class FriendsAndFamily {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("Enter list price:");
      double listPrice = input.nextDouble();
 
      System.out.println("Enter discount %:");
      int discount = input.nextInt();
      
      System.out.printf("You'll pay only %2.2f\n\n",
          listPrice * (1 - discount / 100.0));
    } while (true);
  }
}
