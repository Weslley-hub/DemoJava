import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        System.out.println("Fim da contagem regressiva!");

        input.close();
    }
} 
