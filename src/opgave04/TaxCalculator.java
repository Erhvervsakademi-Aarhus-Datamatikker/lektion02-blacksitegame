package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        //Here is my scanner

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. Input your monthly salary here: ");
        double salary_monthly = scanner.nextDouble();

        //Here are my variables

        double salary_yearly = salary_monthly*12;
        double deduction = 48000;
        double tax = 37;
        double tax_top = 15;
        double tax_top_bracket = 568900;
        double tax_top_bracket_per_month = tax_top_bracket/12;

        //Here are my ecautions

        double taxes_yearly = (salary_yearly-deduction)*tax/100;
        double Taxes_top_yearly = taxes_yearly+(salary_yearly-tax_top_bracket-deduction)*tax_top/100;

        //Here are my if statements

        if (salary_yearly>=tax_top_bracket) {
            System.out.println("Your Top tax is: "+Taxes_top_yearly);
        }

        else if (salary_yearly>=48000) {
            System.out.println("Your tax is: "+taxes_yearly);
        }

        else {
            System.out.println("No tax for you my friend");
        }



    }

    public static int calculateTax(int monthlyIncome) {
        return -1;
    }
}
