package javaprojects;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Elements implements UnaryOperator<String> {
  @Override
  public String apply(String str) {

    return str.toUpperCase();
  }
}

public class ReplaceAll {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("elements");
    list.add("java");
    list.add("unary");
    list.add("operators");
    list.replaceAll(new Elements());
    System.out.println(list);
  }
}
