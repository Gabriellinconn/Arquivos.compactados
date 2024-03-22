import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = num.nextInt();

        System.out.print("Digite um número 2: ");
        int n2 = num.nextInt();

        System.out.println("Valor do primeiro número é "+n1+" e o Valor do número segundo é "+n2);

        int aux = n1;
        n1 = n2;
        n2 = aux;

        System.out.println("Mudança: Valor do primeiro número é " +n1+ " e o alor do segundo número é " +n2);
        num.close();

    }
}