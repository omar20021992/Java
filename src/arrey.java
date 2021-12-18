public class arrey {
    public static void main(String[] args) {
        //array= used to store multiple values in single variable
        /*String[] cars ={"Camry", "Corolla", "Honda"};
        System.out.println(cars[2]);*/
         /*String[] cars = new String [10];

         cars[0]="Camry";
         cars[1]= "Corolla";
         cars[2]= "Honda";
         cars[3]= "tesla";
        System.out.println(cars[3]);*/


        //2D array = array of arrays
        String[][] chests = new String[2][8];
        chests [1][0] = "castle ";
        chests [1][1] = "knight ";
        chests [1][2] = "bishop ";
        chests [1][3] = "king ";
        chests [1][4] = "queen ";
        chests [1][5] = "bishop ";
        chests [1][6] = "knight ";
        chests [1][7] = "castle ";
        chests [0][0] = "pawn ";
        chests [0][1] = "pawn ";
        chests [0][2] = "pawn ";
        chests [0][3] = "pawn ";
        chests [0][4] = "pawn ";
        chests [0][5] = "pawn ";
        chests [0][6] = "pawn ";
        chests [0][7] = "pawn ";

        for(int i = 0; i<chests.length; i++) {
            System.out.println();
            for(int j=0; j<chests[i].length; j++) {
                System.out.print(chests[i][j]+ "");
            }
        }


    }
}
