package com.practicaljava.l3;

public class TestTax {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Tax tax1 = new Tax(50000, 2, "NY");
    NJTax tax2 = new NJTax(50000, 2, "NJ"); // special for NJ

    System.out.printf("Your tax is %.2f\n", tax1.calcTax());

    double yourNJTax = tax2.calcTax();
    System.out.printf("Your tax is %.2f in NJ",
        tax2.adjustForStudents(yourNJTax));
  }
}
