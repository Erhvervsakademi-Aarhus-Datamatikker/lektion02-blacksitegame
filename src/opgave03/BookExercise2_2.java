package opgave03;

import java.util.Scanner;

public class BookExercise2_2 {
    public static void main(String[] args) {
        //Figure out the area and volume of a triangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of the triangle: ");
        double length = scanner.nextDouble();
        double area = Math.sqrt(3)/4* Math.pow(length, 2);
        System.out.println("The area is "+area);
        double volume=area*length;
        System.out.println("The volume is: "+volume);
    }
}
