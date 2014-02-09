package com.practicaljava.l3;

public class TestCar {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    car1.color = "blue";
    car2.color = "red";

    System.out.println("I've painted the cars!!");
    System.out.println("The color of 1st car is " + car1.color);
    System.out.println("The color of 2nd car is " + car2.color);

    car1.startEngine();
  }
}
