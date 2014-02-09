package com.practicaljava.l3;

public class TestTax {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Tax tax1 = new Tax();
    NJTax tax2 = new NJTax(); // special for NJ

    tax1.grossIncome = 50000;
    tax1.dependents = 2;
    tax1.state = "NY";

    tax2.grossIncome = 50000;
    tax2.dependents = 2;
    tax2.state = "NJ";

    System.out.printf("Your tax is %.2f\n", tax1.calcTax());

    double yourNJTax = tax2.calcTax();
    System.out.printf("Your tax is %.2f in NJ",
        tax2.adjustForStudents(yourNJTax));
  }
}
