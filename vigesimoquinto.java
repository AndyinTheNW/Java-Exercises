// ACABOU, SER REPROVADO NOS ACRESCIMOS NAO DA NÉ? PARECENDO JOGO DO BRASIL

// esse programa soma os números digitados até que o usuário digite um número negativo


 import java.util.Scanner;

    public class vigesimoquinto {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int soma = 0;
            while (true) {
                System.out.println("Digite um número: ");
                int numero = input.nextInt();
                if (numero < 0) {
                    break;
                }
                soma += numero;
                System.out.println("A soma é: " + soma);
            }
        }
    }