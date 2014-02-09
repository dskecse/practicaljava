package com.practicaljava.l3;

public class JamesBondCar extends Car {
  int currentSubmergeDepth;
  boolean isGunOnBoard = true;
  final String MANUFACTURER = "GAZ";

  void submerge() {
    currentSubmergeDepth = 50;
  }

  void surface() {
    currentSubmergeDepth = 0;
  }
}
