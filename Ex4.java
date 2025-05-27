import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {

        int[] F1 = new int[100];
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) {
            F1[i] = random.nextInt(1000); 
        }
        
        System.out.println("Fila original F1:");
        imprimirFila(F1);
        
        int[] F2 = inverterFila(F1);
        
        System.out.println("\nFila invertida F2:");
        imprimirFila(F2);
    }
    
    public static int[] inverterFila(int[] fila) {
        int tamanho = fila.length;
        int[] filaInvertida = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            filaInvertida[i] = fila[tamanho - 1 - i];
        }
        
        return filaInvertida;
    }
    

    public static void imprimirFila(int[] fila) {
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}