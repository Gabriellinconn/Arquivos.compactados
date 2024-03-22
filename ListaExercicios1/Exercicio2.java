import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {

    
     Scanner soma = new Scanner(System.in);

        System.out.print("Número 1: ");
        int num1 = soma.nextInt();

        System.out.print("Número 2: ");
        int num2 = soma.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        soma.close();

    }
}