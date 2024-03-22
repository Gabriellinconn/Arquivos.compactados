import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.println("~Vamos Calcular o n-ésimo~");
        System.out.print("Digite o a1: ");
        int a1 = num.nextInt();

        System.out.print("Digite o n: ");
        int n = num.nextInt();

        System.out.print("Digite o r: ");
        int r = num.nextInt();

        System.out.println("Resultado: "+(a1+(n-1)*r));

        num.close();



    }
}