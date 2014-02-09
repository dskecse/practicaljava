package com.practicaljava.l2;

public class Car {
  String color;
  int numberOfDoors;

  private boolean isStarted = false;

  void startEngine() {
    if (!isStarted) {
      this.isStarted = true;
      System.out.println("Engine was successfully started");
    } else {
      System.out.println("Cannot start engine. It's already been running");
    }
  }

  void stopEngine() {
    if (isStarted) {
      this.isStarted = false;
      System.out.println("Engine was successfully stopped");
    } else {
      System.out.println("Cannot stop engine. It's already been stopped");
    }
  }
}
