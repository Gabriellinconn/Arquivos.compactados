import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio17 {
    public static void executar() {
        Scanner num = new Scanner(System.in);

        double[] nota = new double[3];
        double[] peso = new double[3];
      



        System.out.println("~Vamos Clacular sua média Ponderada~");

        double pesoEnota=0;
        double somaPeso=0;


        for(int i = 0; i<Array.getLength(nota); i++){
            System.out.print("Informe nota ["+(i+1)+"]: ");
            nota[i] = num.nextDouble();
        }

        for(int j = 0; j<Array.getLength(peso); j++){
            System.out.print("Informe peso da prova ["+(j+1)+"]: ");
            peso[j] = num.nextDouble();
            somaPeso+=peso[j];
            }
            for(int i = 0; i<Array.getLength(nota); i++){
                pesoEnota += nota[i]*peso[i];
                }
            

        System.out.println("A média Ponderada é: "+ (pesoEnota/somaPeso));

        num.close();

    }
}
