package com.practicaljava.l3;

public class Tax {
  double grossIncome;
  int dependents;
  String state;

  public double calcTax() {
    if (grossIncome < 50000) {
      return grossIncome * 0.06;
    } else {
      return grossIncome * 0.08;
    }
  }
}
