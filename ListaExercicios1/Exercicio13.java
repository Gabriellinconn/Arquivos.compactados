import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        System.out.print("Digite o um valor real: ");
        double n1 = num.nextDouble();


        System.out.print("Digite outro valor real: ");
        double n2 = num.nextDouble();

        num.nextLine();

        System.out.print("Digite uma operação: ");
        String op = num.nextLine();
    
        switch (op) {
            case "+":

            System.out.println("Resultado: "+ n1 +" "+ op +" "+ n2+ " = "+(n1+n2));
            break;

            case "-":

            System.out.println("Resultado: "+ n1 +" "+ op +" "+ n2+ " = "+(n1-n2));
            break;


            case "*":

            System.out.println("Resultado: "+ n1 +" "+ op +" "+ n2+ " = "+(n1*n2));
            break;


            case "/":
            if(n1==0||n2==0){
                System.out.println("Número não pode ser dividido por zero");
            }else

            System.out.println("Resultado: "+ n1 +" "+ op +" "+ n2+ " = "+(n1/n2));
                
                break;
        
            default:
            System.out.println("Operação inválida");

                break;
        }

        num.close();


    
    }
}