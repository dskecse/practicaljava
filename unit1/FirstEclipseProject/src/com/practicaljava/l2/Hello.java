package com.practicaljava.l2;

public class Hello {

  private static final String HELLO = "Hello, World, from inside Eclipse IDE!!!";

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(HELLO);
    int sum = 0;
    sum = calculateSum(sum);
    System.out.println(sum);
  }

  private static int calculateSum(int sum) {
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum;
  }
}
