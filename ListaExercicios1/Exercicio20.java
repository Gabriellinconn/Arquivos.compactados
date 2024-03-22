import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        double autonomia = 12.0;

        System.out.println("~Vamos Calcular quantos litros foram gastos na viagem");
        System.out.print("Digite quantas horas durou a viagem: ");
        double h = num.nextDouble();

        System.out.print("Digite qual foi a velocidade média: ");
        double v = num.nextDouble();

        double distancia = h*v;

        System.out.println("Litros gastos: "+(distancia/autonomia));

        num.close();

    }
}