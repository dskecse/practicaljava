package com.practicaljava.l3;

public class NJTax extends Tax {
  public NJTax(double grossIncome, int dependents, String state) {
    super(grossIncome, dependents, state);
  }

  public double adjustForStudents(double tax) {
    return tax - 500;
  }

  public double calcTax() {
    if (grossIncome < 50000) {
      return grossIncome * 0.1;
    } else {
      return grossIncome * 0.13;
    }
  }
}
