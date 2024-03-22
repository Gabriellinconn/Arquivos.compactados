import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {

       Scanner num = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5: ");
        int n = num.nextInt();

        switch (n) {
        case 1:
        System.out.println("Número um");

        break;

        case 2:
        System.out.println("Número dois");

        break;

        case 3:
        System.out.println("Número três");

        break;

        case 4:
        System.out.println("Número quatro");

        break;

        case 5:
        System.out.println("Número cinco");

        break;

        default:
        System.out.println("Número Inválido");
        break;
        } 
        num.close();

           
    }
}