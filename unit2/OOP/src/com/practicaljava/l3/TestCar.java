package com.practicaljava.l3;

public class TestCar {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();
    JamesBondCar car3 = new JamesBondCar();

    car1.color = "blue";
    car2.color = "red";
    car3.color = "rifle-green";

    System.out.println("I've painted the cars!!");
    System.out.println("The color of 1st car is " + car1.color);
    System.out.println("The color of 2nd car is " + car2.color);
    System.out.println("The color of James Bond's car is " + car3.color);

    car1.startEngine();
    car3.startEngine();
    car3.stopEngine();
  }
}
