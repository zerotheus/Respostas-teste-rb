import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para verificar se está na sequencia");
        int numero = scanner.nextInt();
        if (estaNaSequenciaDeFibonacci(numero)) {
            System.out.println("Está na sequencia");
            return;
        }
        System.out.println("Não está sequencia");
    }

    public static boolean estaNaSequenciaDeFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }
        if (numero == 0 || numero == 1) {
            return true;
        }
        int[] numerosDeFibonaci = { 0, 1 };
        int proximoDaSequencia = numerosDeFibonaci[1] + numerosDeFibonaci[0];
        while (proximoDaSequencia <= numero) {
            if (proximoDaSequencia == numero) {
                return true;
            }
            numerosDeFibonaci[0] = numerosDeFibonaci[1];
            numerosDeFibonaci[1] = proximoDaSequencia;
            proximoDaSequencia = numerosDeFibonaci[1] + numerosDeFibonaci[0];
        }
        return false;
    }

}
