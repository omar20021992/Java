import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) { 
        Scanner scanner= new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = scanner.nextInt();
        System.out.println("enter # of columns:");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol");
        symbol = scanner.next();

         for(int i=1; i<=rows; i++){
             System.out.println();
             for(int s=1; s<=columns; s++){
                 System.out.print (symbol);
             }
         }

    }
}
