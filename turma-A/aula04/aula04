import java.util.Scanner;

public class aula04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do Vetor:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int numero = 0; numero < tamanho; numero++) {
            System.out.println("Digite um valor inteiro e menor que o tamanho:");
            vetor[numero] = scanner.nextInt();

            // O número digitado não pode ser maior que o tamanho do vetor.
            // Verifique essa condição aqui if needed.
        }

        int valormaior = vetor[0];
        int valormenor = vetor[0];

        for (int numero = 1; numero < tamanho; numero++) {
            // Criamos um for para percorrer o vetor e encontrar os números maiores e menores.
            if (vetor[numero] > valormaior) {
                valormaior = vetor[numero];
            }

            if (vetor[numero] < valormenor) {
                valormenor = vetor[numero];
            }
        }

        System.out.println("O maior é: " + valormaior);
        System.out.println("O menor é: " + valormenor);

        scanner.close();
    }
}
