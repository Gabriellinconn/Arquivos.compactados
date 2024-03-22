import java.util.Scanner;

public class Exercicio19 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.println("~Vamos Calcular o volume do cilindro");
        System.out.print("Digite o Raio do cilindro: ");
        double r = num.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double a = num.nextDouble();


        System.out.println("Volume do cilindro: "+Math.round(Math.PI*Math.pow(r, 2)*a));

        num.close();

    }
}