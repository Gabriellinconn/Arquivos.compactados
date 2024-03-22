import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner num = new Scanner(System.in);

        double[] nota = new double[3];

        System.out.println("~Vamos Clacular sua média aritmética~");

        double soma=0;

        for(int i = 0; i<Array.getLength(nota); i++){
            System.out.print("Informe nota ["+(i+1)+"]: ");
            nota[i] = num.nextDouble();
            soma+= nota[i];
        }

        System.out.println("A média aritmética é: "+ (soma/Array.getLength(nota)));

        num.close();


    }
}
