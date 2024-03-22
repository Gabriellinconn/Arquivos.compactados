import java.util.Scanner;

public class Exercicio4 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = num.nextInt();

        System.out.print("Digite um número 2: ");
        int n2 = num.nextInt();

        System.out.println("Soma: "+(n1+n2)+ " Subtração: "+ (n1-n2) + " Multiplicacão: "+ (n1*n2)+ " Divisão: "+ (n1/n2));
        num.close();

    }
}