    
    import java.util.Scanner;

    public class Exercicio11 {
        public static void executar() {
    Scanner num = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = num.nextInt();

        int maior = n1;

        System.out.print("Digite o segundo número: ");
        int n2 = num.nextInt();

        int menor = 0;

        if(maior<n2){
            maior = n2;
            menor = n1;
        }
        else{
            menor = n2;
        }

        System.out.print("Digite o terceiro número: ");
        int n3 = num.nextInt();

        int meio = 0;

        if(maior>n3 && n3> menor){

            meio = n3;
        }

        else if(n3>maior){
            meio = maior;
            maior=n3;
        }
        else{
            meio = menor;
            menor = n3;
            }
            num.close();

        }
    }