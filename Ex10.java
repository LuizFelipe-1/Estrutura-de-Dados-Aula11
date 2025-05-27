import java.util.Scanner;

public class Ex10 {

    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        else if (expoente == 1) {
            return base;
        }
        else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Potência Recursiva");
        System.out.print("Digite a base (número inteiro positivo): ");
        int base = scanner.nextInt();
        
        System.out.print("Digite o expoente (número inteiro positivo): ");
        int expoente = scanner.nextInt();

        if (base < 0 || expoente < 0) {
            System.out.println("Erro: A base e o expoente devem ser positivos!");
        } else {
            int resultado = calcularPotencia(base, expoente);
            System.out.println("\nResultado: " + base + " elevado a " + expoente + " = " + resultado);
        }
        
        scanner.close();
    }
}