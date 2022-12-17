
// esse programa java imprime a média aritimetica dos numeros 8, 9 e 7; a média dos numeros 4, 5 e 6; a soma das duas médias e a média das médias

import java.util.Scanner;

public class setimoexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero1 = 8;
        int numero2 = 9;
        int numero3 = 7;
        int numero4 = 4;
        int numero5 = 5;
        int numero6 = 6;
        int soma1 = numero1 + numero2 + numero3;
        int soma2 = numero4 + numero5 + numero6;
        int soma3 = soma1 + soma2;
        int media1 = soma1 / 3;
        int media2 = soma2 / 3;
        int media3 = soma3 / 6;
        System.out.println("A média dos números 8, 9 e 7 é: " + media1);
        System.out.println("A média dos números 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + soma3);
        System.out.println("A média das médias é: " + media3);
    }
}



