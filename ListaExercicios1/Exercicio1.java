import java.util.Scanner;

public class Exercicio1 {

    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = num.nextInt();

        
        if(n>=10){
            System.out.println("O número é maior ou igual a 10");
        }else{
            System.out.println("O número é menor que 10");

        }
        num.close();


    }
    
}