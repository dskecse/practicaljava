package com.practicaljava.l3;

public class NJTax extends Tax {
  public double adjustForStudents(double tax) {
    return tax - 500;
  }
}
