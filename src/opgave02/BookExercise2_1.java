package opgave02;

import java.util.Scanner;

public class BookExercise2_1 {
    public static void main(String[] args) {
        //First i set the variable for kilometeres
        double kilometers = 1.6;
        //Then i create the scanner syntax
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Miles: ");
        double miles = scanner.nextDouble();
        double result = kilometers * miles;
        System.out.println(miles + " miles is " + result + " kilometeres");
    }
}
