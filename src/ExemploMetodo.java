public class ExemploMetodo {
    public static void main(String[] args) {
        int resultado = somar(2, 3);
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
}
