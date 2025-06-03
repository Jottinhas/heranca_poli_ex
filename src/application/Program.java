package application;

import entities.Company;
import entities.TaxPay;
import entities.individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPay> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Health expeditures: ");
                double health = sc.nextDouble();
                list.add(new individual(name, income, health));
            }else {
                System.out.print("Number of employees: ");
                int number = sc.nextInt();
                list.add(new Company(name, income, number));
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPay tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }



        sc.close();
    }
}
