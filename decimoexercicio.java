// Escreva um programa que leia o saldo de uma conta corrente e imprima o saldo com reajuste de 1,5%.

import java.util.Scanner;
import java.util.Locale;

public class decimoexercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        double saldo = leitor.nextDouble();
        double saldoAtualizado = saldo * 1.015;
        System.out.println("O saldo atualizado é: " + saldoAtualizado);
    }
}


