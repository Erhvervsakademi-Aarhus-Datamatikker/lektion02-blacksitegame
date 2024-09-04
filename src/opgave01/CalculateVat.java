package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        //Beskriv din algoritme
        //Fuld pris = prise uden moms + 25%
        //Nu opretter jeg en scanner
        Scanner scanner = new Scanner(System.in);
        double moms = 1.25;

        //Efterfølgende opretter jeg et feldt hvor man kan input sit beløb før moms
        System.out.print("Angiv et beløb her: ");
        double beløb = scanner.nextDouble();
        //Nu laver jeg en ligning der kan udregne beløbet med moms medregnet
        System.out.println("her er beløbet + moms: " + beløb * moms);
        double beløb_moms = beløb * moms - beløb;
        System.out.println("her er moms: " + beløb_moms);
    }
}
