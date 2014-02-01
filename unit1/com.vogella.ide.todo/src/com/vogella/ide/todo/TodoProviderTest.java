package com.vogella.ide.todo;

import java.util.List;

public class TodoProviderTest {

  /**
   * @param args
   */
  public static void main(String[] args)
      throws RuntimeException {
    List<Todo> items = TodoProvider.createInitialModel();
    if (items.size() == 5) {
      System.out.println("Correct");
    } else {
      throw new RuntimeException();
    }
  }
}
