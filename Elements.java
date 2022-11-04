package Generics;

public class Elements {

  public static <T> void swap(T[] iList, int i, int j) {

    T temp = iList[i];
    iList[i] = iList[j];
    iList[j] = temp;
  }
}