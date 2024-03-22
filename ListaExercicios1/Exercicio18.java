import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio18 {
    public static void executar() {
        Scanner num = new Scanner(System.in);

        double[] nota = new double[3];

        System.out.println("~Vamos Clacular sua média Harmônica~");

        double soma=0;

        for(int i = 0; i<Array.getLength(nota); i++){
            System.out.print("Informe nota ["+(i+1)+"]: ");
            nota[i] = num.nextDouble();
            soma+= 1/nota[i];
        }

        System.out.println("A média Harmônica é: "+ (Array.getLength(nota)/soma));

        num.close();


    }
}
