package com.practicaljava.l3;

public class TestTax {

  /**
   * @param args
   */
  public static void main(String[] args) {
    NJTax tax = new NJTax(); // special for NJ

    tax.grossIncome = 50000.45;
    tax.dependents = 2;
    tax.state = "NJ";

    double yourTax = tax.calcTax();

    System.out.printf("Your tax is %.2f", tax.adjustForStudents(yourTax));
  }
}
