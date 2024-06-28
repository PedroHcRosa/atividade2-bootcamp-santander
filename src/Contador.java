import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o segundo numero: ");
        int numero2 =scanner.nextInt();

        try {

            contador(numero1, numero2);  

        }
        catch (ParametrosInvalidosException pie) {

            System.out.println("O primerio número deve obrigatóriamente ser menor que o segundo!");
        }
        
        scanner.close();
    }

    public static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
        else {
        int acrescentador = 1;

        for(int i = parametro1; i < parametro2; i++) {

            System.out.println("Imprimindo o número: " + acrescentador);
            acrescentador = acrescentador + 1;

        }
    }
    }

    
}
