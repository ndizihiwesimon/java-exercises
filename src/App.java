import java.util.Scanner;

import static java.lang.Math.pow;

public class App {

// First method to calculate the Sum of positive numbers less or equal to n
 static void first(){
        // For input
        Scanner sc = new Scanner(System.in);

        System.out.println("First Method \nPlease enter a number!");

        // Inputting data
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                sum = sum + i;
            }
            System.out.println("Sum of positive numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }

// Second method to calculate Sum of positive odd numbers less or equal to n
    static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Second Method \nPlease enter a number!");
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                if (i%2==0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum of positive odd numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }


// Third method to calculate Sum of square positive numbers less or equal to n
    static void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Third Method \nPlease enter a number!");
        int n = sc.nextInt();
        int sum = 0;

        if(n<0){
            System.out.println("Please enter positive number");
        }
        else {
            for(int i = 0; i <= n; i++){
                sum += pow(i,2);
            }
            System.out.println("Sum of square positive numbers less or equal to " + n +" is "+ sum);
            System.out.println("--------------------------------------------------------\n");
        }
    }


// Method to calculate the sum of two matrices
    static void matrixSum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];

//        First matrix
        System.out.println("\nFill in first matrix\n");
        for (int i=0; i<rows; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }

//        First matrix preview
        System.out.println("\nFirst Matrix Preview");
        for(int[] a : firstMatrix){
            for (int b : a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }


//        Second matrix
        System.out.println("\nFill in second matrix\n");
        for (int i=0; i<rows; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        //        Second matrix preview
        System.out.println("\nSecond Matrix Preview");
        for(int[] x : secondMatrix){
            for (int y : x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }


// Method to calculate the product of two matrices
    static void matrixProduct(){

        Scanner sc = new Scanner(System.in);

//        First matrix
        System.out.println("\nFill in first matrix\n");

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] firstMatrix = new int[rows][columns];

        for (int i=0; i<rows; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }

//        First matrix preview
        System.out.println("\nFirst Matrix Preview");
        for(int[] a : firstMatrix){
            for (int b : a){
                System.out.print(b+ " ");
            }
            System.out.println();
        }


//        Second matrix
        System.out.println("\nFill in second matrix\n");


        System.out.println("Enter number of rows");
        int rows2 = sc.nextInt();

        while(columns != rows2){
            System.out.println("Rows o must be equal to columns of first matrix");
            rows2 = sc.nextInt();
        }

        System.out.println("Enter number of columns");
        int columns2 = sc.nextInt();

        int[][] secondMatrix = new int[rows2][columns2];

        for (int i=0; i<rows2; i++){
            System.out.println("Row "+ (i+1));
            for (int j = 0; j < columns2; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        //        Second matrix preview
        System.out.println("\nSecond Matrix Preview");
        for(int[] x : secondMatrix){
            for (int y : x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }
        // Multiplying Two matrices
        int[][] product = new int[rows][columns2];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < rows2; k++) {
                    product[i][j] +=  firstMatrix[i][k] * secondMatrix[k][j];

                }

            }
        }

        // Displaying the result
        System.out.println("Product of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        first();
        second();
        third();
        matrixSum();
        matrixProduct();
    }
}