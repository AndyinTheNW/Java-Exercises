// esse codigo diz o salário final de um vendedor que recebe um salário fixo mais 15% do total de vendas efetuadas


import java.util.Scanner;

public class decimoprimeiroexercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o salário fixo: ");
        double salarioFixo = leitor.nextDouble();
        System.out.println("Digite o total de vendas efetuadas: ");
        double totalVendas = leitor.nextDouble();
        double salarioFinal = salarioFixo + (totalVendas * 0.15);
        System.out.println("O nome do vendedor é: " + nome);
        System.out.println("O salário fixo é: " + salarioFixo);
        System.out.println("O salário final é: " + salarioFinal);
    }
}
