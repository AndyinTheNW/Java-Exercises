
// esse programa lê o código, o valor unitário e a quantidade de duas peças e calcula o valor total a ser pago, acrescido de um IPI

import java.util.Scanner;

public class oitavoexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
        double ipi = leitor.nextDouble();
        System.out.println("Digite o código da peça 1: ");
        int codigo1 = leitor.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        double valor1 = leitor.nextDouble();
        System.out.println("Digite a quantidade de peças 1: ");
        int quantidade1 = leitor.nextInt();
        System.out.println("Digite o código da peça 2: ");
        int codigo2 = leitor.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        double valor2 = leitor.nextDouble();
        System.out.println("Digite a quantidade de peças 2: ");
        int quantidade2 = leitor.nextInt();
        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);
        System.out.println("O valor total a ser pago é: " + total);
    }
}