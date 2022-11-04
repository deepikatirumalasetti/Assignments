package Generics;

import static java.util.Collections.swap;

import java.util.Collections;

public class Exchange {

  public static void main(String[] args) {

    int[] iList = { 1, 2, 3, 4, 5 };
    swap(Collections.singletonList(iList), 1, 2);
    for (int i : iList)
      System.out.println(i + ",");
  }

}
