//Import the Scanner utility
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a scanner
        //Scanner input = new Scanner(System.in);



        //Create a 2-Dimensional Array to read in the integer values for the program to read and check
        int[][] tableValues1 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 6, 2, 1, 8, 2, 9 },
                { 6, 5, 6, 1, 1, 9, 1 },
                { 1, 3, 6, 1, 4, 0, 7 },
                { 3, 3, 3, 3, 4, 0, 7 }};

        System.out.println("\n");
        System.out.println("Table 1:");
        for (int i = 0; i < tableValues1.length; i++) {
            for (int j = 0; j < tableValues1[i].length; j++) {
                System.out.print(tableValues1[i][j] + " ");
            }
            System.out.println();
        }

        boolean trueOrFalse = isConsecutiveFour(tableValues1);

        if(trueOrFalse == true) {
            System.out.println("The table is true.");
        }
        else {
            System.out.println("The table is false.");
        }
        /*int[][] tableValues2 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 5, 2, 1, 8, 2, 9 },
                { 6, 5, 6, 1, 1, 9, 1 },
                { 1, 5, 6, 1, 4, 0, 7 },
                { 3, 5, 3, 3, 4, 0, 7 }};

        System.out.println("\n");
        System.out.println("Table 2:");
        for (int i = 0; i < tableValues2.length; i++) {
            for (int j = 0; j < tableValues2[i].length; j++) {
                System.out.print(tableValues2[i][j] + " ");
            }
            System.out.println();
        }

        isConsecutiveFour(tableValues2);

        int[][] tableValues3 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 6, 2, 1, 6, 2, 9 },
                { 6, 5, 6, 6, 1, 9, 1 },
                { 1, 3, 6, 1, 4, 0, 7 },
                { 3, 6, 3, 3, 4, 0, 7 }};

        System.out.println("\n");
        System.out.println("Table 3:");
        for (int i = 0; i < tableValues3.length; i++) {
            for (int j = 0; j < tableValues3[i].length; j++) {
                System.out.print(tableValues3[i][j] + " ");
            }
            System.out.println();
        }

        isConsecutiveFour(tableValues3);

        int[][] tableValues4 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 9, 6, 2, 1, 8, 2, 9 },
                { 6, 9, 6, 1, 1, 9, 1 },
                { 1, 3, 9, 1, 4, 0, 7 },
                { 3, 3, 3, 9, 4, 0, 7 }};

        System.out.println("\n");
        System.out.println("Table 4:");
        for (int i = 0; i < tableValues4.length; i++) {
            for (int j = 0; j < tableValues4[i].length; j++) {
                System.out.print(tableValues4[i][j] + " ");
            }
            System.out.println();
        }

        isConsecutiveFour(tableValues4);

        int[][] tableValues5 = {
                { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 9, 6, 2, 1, 8, 2, 9 },
                { 6, 9, 6, 1, 1, 9, 1 },
                { 1, 3, 9, 1, 4, 0, 7 },
                { 3, 8, 3, 9, 4, 0, 7 }};

        System.out.println("\n");
        System.out.println("Table 5:");
        for (int i = 0; i < tableValues5.length; i++) {
            for (int j = 0; j < tableValues5[i].length; j++) {
                System.out.print(tableValues5[i][j] + " ");
            }
            System.out.println();
        }

        isConsecutiveFour(tableValues5);*/
    }

    public static boolean isConsecutiveFour(int[][] values){
        int valueInt;
        System.out.println("Hello again inside the method");

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if( i < 0 || j < 0){
                    i++;
                    j++;
                    valueInt = values[i][j];
                    //System.out.print("This is i: " + i + "This is j: " + j);
                    System.out.println("hello from for loop");
                }
                System.out.println("This is i: " + i + " This is j: " + j);
                //System.out.print(values[i][j] + " ");
            }
            //System.out.println();
        }
        System.out.println("from after the for loop!");
        //System.out.print(valueInt + " ");
        return true;
    }
}

/*import java.util.*;
public class FourConsecutiveNumbers {
static boolean check_vertical(int[][] randomTable){
    for (int i =0; i<randomTable.length; i++){
        for(int t=0; t<randomTable[0].length-3;t++){
            if (randomTable[i][t]==randomTable[i][t+1] && randomTable[i][t+1]==randomTable[i][t+2] && randomTable[i][t+2]==randomTable[i][t+3]){
                return true;
            }
        }

    }
return false;
}
static boolean check_horizontal(int[][] randomTable){
    for (int i =0; i<randomTable.length; i++){
        for(int t=0; t<randomTable[0].length-3;t++){
            if (randomTable[t][i]==randomTable[t+1][i] && randomTable[t+1][i]==randomTable[t+2][i] && randomTable[t+2][i]==randomTable[t+3][i]){
                return true;
            }
        }

    }
return false;
}
static boolean check_diagonal(int[][] randomTable){
//check down
    for (int t =0; t<randomTable.length-3; t++){
        for(int i=0; i<randomTable[0].length-3;i++){
            if (randomTable[i][t]==randomTable[i+1][t+1] && randomTable[i+1][t+1]==randomTable[i+2][t+2] && randomTable[i+2][t+2]==randomTable[i+3][t+3]){
                return true;
            }

        }



    }
//check up
    for (int t =randomTable.length; t>2; t--){
    for(int i=0; i<randomTable[0].length-3;i++){
        if (randomTable[t][i]==randomTable[t-1][i+1] && randomTable[t-1][i+1]==randomTable[t-2][i+2] && randomTable[t-2][i+2]==randomTable[t-3][i+3]){
            return true;
        }

    }
}
return false;
 }


public static void main(String[] args) {

    Scanner rowDimension = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int firstInput = rowDimension.nextInt();

    Scanner columnDimension = new Scanner(System.in);
    System.out.print("Enter the number of columns: ");
    int secondInput = columnDimension.nextInt();

    int[][] randomTable = new int[firstInput][secondInput];
    for (int row = 0; row < firstInput; row++) {
        for (int column = 0; column < secondInput; column++) {
            randomTable[row][column] = (int)(Math.random() * 10 + 0);
            System.out.print(randomTable[row][column] + " ");
        }
        System.out.println();
    }
   if(check_horizontal(randomTable) || check_vertical(randomTable) || check_diagonal(randomTable)){
       System.out.println("There are 4 in a row, in some way");
   }
   else{
       System.out.println("No luck");

   }
}}*/