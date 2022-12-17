// Esse programa java lê o valor de um salário e imprime a quantidade de salários mínimos que ele equivale

import java.util.Locale;
import java.util.Scanner;

public class nonoexercicio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = sc.nextDouble();

        double qtdSalario = salario / 1212;

        System.out.printf("A quantidade de salários mínimos é de: %.2f", qtdSalario);
        sc.close();

    }

}
