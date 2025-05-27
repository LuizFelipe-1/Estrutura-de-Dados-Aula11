public class Ex7 {
    private static final int TAMANHO = 20;
    
    public static void main(String[] args) {

        int[] filaOriginal = new int[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            filaOriginal[i] = i + 1; 
        }
        
        System.out.println("Fila original:");
        imprimirFila(filaOriginal);

        int[] filaInvertida = inverterFila(filaOriginal);
        
        System.out.println("\nFila invertida:");
        imprimirFila(filaInvertida);
    }

    public static int[] inverterFila(int[] fila) {
        int[] pilha = new int[TAMANHO];
        int topo = -1;
        int[] filaInvertida = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            pilha[++topo] = fila[i]; 
        }

        for (int i = 0; i < TAMANHO; i++) {
            filaInvertida[i] = pilha[topo--];
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