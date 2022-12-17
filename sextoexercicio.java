// Esse programa java lê um numero e imprime o seu antececessor e o seu sucessor

import java.util.Scanner;

public class sextoexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        System.out.println("O antecessor é: " + (numero - 1));
        System.out.println("O sucessor é: " + (numero + 1));
    }
}
