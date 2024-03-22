import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner num = new Scanner(System.in);

        System.out.println("~Vamos Calcular a distância entre dois pontos~");
        System.out.print("Digite o x1: ");
        double x1 = num.nextDouble();

        System.out.print("Digite o y1: ");
        double y1 = num.nextDouble();

        System.out.print("Digite o x2: ");
        double x2 = num.nextDouble();

        System.out.print("Digite o y2: ");
        double y2 = num.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("A distância entre os pontos é: " + (distancia) );
        num.close();

    }
}
