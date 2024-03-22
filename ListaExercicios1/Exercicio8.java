import java.util.Scanner;

public class Exercicio8 {
    public static void executar() {
Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = num.nextInt();

        if(n>=50){
        System.out.println("O seu número é maior ou igual a 50");

        }else{
        System.out.println("O seu número é menor que 50");

        }
        num.close();

    }
}