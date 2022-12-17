// to cansado já

// Esse código lê 20 numeros e exibe quais são maiores que 8, e informa se todos são maiores que 8 ou se nenhum é maior que 8

// mandei bem nessa

import java.util.Scanner;

public class vigesimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maiores = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = input.nextInt();
            if (numero > 8) {
                maiores++;
            }
        }
        if (maiores == 20) {
            System.out.println("Todos os números são maiores que 8");
        } else if (maiores == 0) {
            System.out.println("Nenhum número é maior que 8");
        } else {
            System.out.println("A quantidade de números maiores que 8 é: " + maiores);
        }
    }
}
