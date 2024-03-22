import java.util.Scanner;

public class Exercicio7 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele está entre 100 e 200:");
        int n = num.nextInt();

        if(n>=100 && n<=200){
        System.out.println("O seu número está entre 100 e 200");

        }else{
        System.out.println("O seu número não está entre 100 e 200");

        }
        num.close();

    }
}