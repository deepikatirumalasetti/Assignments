import java.util.Scanner;
class Supply {
    public static void main(String args[]) {
        float a, b, c, avg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark of three subs");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        avg = a + b + c / 3;
        if (avg >= 80) {
            System.out.println("You are in A grade ");
        } else if (avg >= 60 && avg <= 80) {
            System.out.println("You are in B grade ");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("You are in C grade ");
        } else {
            System.out.println("Fail ");
        }
    }
}