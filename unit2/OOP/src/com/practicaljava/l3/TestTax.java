package com.practicaljava.l3;

public class TestTax {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Tax tax = new Tax();

    tax.grossIncome = 50000;
    tax.dependents = 2;
    tax.state = "NJ";

    double yourTax = tax.calcTax();

    System.out.println("Your tax is " + yourTax);
  }
}
