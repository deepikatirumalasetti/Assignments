package lambda;

@FunctionalInterface
interface Arithmetic {
  int operations(int a, int b);
}

public class lambda_add {

  public static void main(String[] args) {

    // addition operation
    Arithmetic addition = (a, b) -> (a + b);

    System.out.println("Addition=>" + addition.operations(10, 20));
  }
}
