import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Cria um array para armazenar os resultados da tabuada
        int[] tabuada = new int[10];

        // Preenche o vetor com os resultados da tabuada
        for (int i = 0; i < 10; i++) {
            tabuada[i] = numero * (i + 1);
        }

        // Exibe a tabuada usando o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " x " + (i + 1) + " = " + tabuada[i]);
        }
    }
}