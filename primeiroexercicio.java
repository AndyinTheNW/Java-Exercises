// esse programa é um cardápio de restaurante, onde o usuário escolhe o prato, a sobremesa e o suco e o programa retorna o total de calorias


import java.util.Scanner;

public class primeiroexercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calorias = 0;
        int prato = 0;
        int sobremesa = 0;
        int suco = 0;
        System.out.println("Informe o de prato: \n1)Vegetariano 2)Peixe 3)Frango 4)Carne");
        prato = sc.nextInt();
        System.out
                .println("Informe a sobremesa: \n1)Abacaxi 2)Sorvete diet 3)Mousse diet 4)Mousse de Cholate");
        sobremesa = sc.nextInt();
        System.out.println("Informe o suco: \n1)Ch� 2)Suco de laranja 3)Suco de mel�o 4)Refrigerante diet");
        suco = sc.nextInt();
        if (prato == 1) {
            calorias += 180;
        } else if (prato == 2) {
            calorias += 230;
        } else if (prato == 3) {
            calorias += 250;
        } else if (prato == 4) {
            calorias += 350;
        } else {
            System.out.println("Invalido!");
        }
        if (sobremesa == 1) {
            calorias += 75;
        } else if (sobremesa == 2) {
            calorias += 110;
        } else if (sobremesa == 3) {
            calorias += 170;
        } else if (sobremesa == 4) {
            calorias += 200;
        } else {
            System.out.println("invalido!");
        }
        if (suco == 1) {
            calorias += 20;
        } else if (suco == 2) {
            calorias += 70;
        } else if (suco == 3) {
            calorias += 100;
        } else if (suco == 4) {
            calorias += 65;
        } else {
            System.out.println("invalido!");
        }
        System.out.println("\nTotal de calorias: " + calorias);
        sc.close();
    }
}
