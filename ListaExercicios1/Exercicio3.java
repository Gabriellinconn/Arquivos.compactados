import java.util.Scanner;

public class Exercicio3 {
    public static void executar() {

    
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = num.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = num.nextInt();


        if(n1>n2){
        System.out.println("O número " +n1+ " é maior que "+ n2);
        }
        if(n1<n2){
        System.out.println("O número " +n2+ " é maior que "+ n1);
        }
        if(n1==n2) {
        System.out.println("A sequência dos números é inválida ");
        }
        num.close();

           
    }
}