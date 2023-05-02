import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Selecione uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
            
                    System.out.print("Digite a segundo número: ");
                    num2 = scanner.nextInt();
            
                    int soma = (num1 + num2 );
            
                    System.out.println("A soma dos números é: " + soma);
                break;
            case 2: 

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
            
                    System.out.print("Digite a segundo número: ");
                    num2 = scanner.nextInt();
            
                    int subtracao = (num1 - num2 );
            
                    System.out.println("A subtração dos números é: " + subtracao);
                break;
            case 3:

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
            
                    System.out.print("Digite a segundo número: ");
                    num2 = scanner.nextInt();
            
                    int mult = (num1 * num2 );
            
                    System.out.println("A multiplicação dos números é: " + mult);
                break;
            case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
            
                    System.out.print("Digite a segundo número: ");
                    num2 = scanner.nextInt();
            
                    int div = (num1 / num2 );
            
                    System.out.println("A multiplicação dos números é: " + div);
            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}
