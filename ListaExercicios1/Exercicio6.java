import java.util.Scanner;

public class Exercicio6 {
    public static void executar() {

        Scanner temp = new Scanner(System.in);

        System.out.print("Digite uma temperatura em °C para ser convertida: ");
        int num = temp.nextInt();

        System.out.println("Temperatura em °C convertida em Fahrenheit é: "+((9 * num
        + 160) / 5)+"°F");
        temp.close();

    }
}