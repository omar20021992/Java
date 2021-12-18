import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: " );
        a = scanner.nextInt();
        System.out.println("Enter side b : " );
        b = scanner.nextInt();
        c = Math.sqrt((a*a)+(a*a));
        System.out.println("The hypotenuse is: " + c);
        scanner.close();
    }

}
