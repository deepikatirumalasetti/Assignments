
public class ArthimeticException {
    public static void main(String args[]) {
        int a, b, c;
        a = 10;
        b = 0;
        try {
            c = a / 10;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("not possible of divided by zero");
        }
    }

}
