// Esse código converte graus Celsius em Fahrenheit


import java.util.Scanner;

public class decimoterceiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}

