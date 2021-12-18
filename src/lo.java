import java.util.Scanner;

public class lo {
    public static void main(String[] args) {
        //logical operator = used to connect two or more expressions
        //         && = (and) both conditions must be true
        //         || = (or) either condition must be true
        //         ! = (NOT) reverses boolean value of condition
       /* int temp = 15 ;
        if (temp>=30) {
            System.out.println("Its hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("its worm outside");
        }
        else{
            System.out.println("its cold outside");
        }*/
    Scanner scanner = new Scanner(System.in);

        System.out.println("u r in the game. Press q or Q to quit. ");
        String response = scanner.next();
        if(!response.equals("q") & !response.equals("Q") ) {
            System.out.println("u still in the game!");
        }
        else {
            System.out.println("u quit the game!");

        }
    }

}
