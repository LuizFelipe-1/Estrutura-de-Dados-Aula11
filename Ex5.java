import java.util.Random;

public class Ex5{
    private static final int TAMANHO_FILA = 1000;
    private static final int MAX_NUMERO = 10000; 

    public static void main(String[] args) {
        int[] filaF = new int[TAMANHO_FILA];
        int[] pilhaP = new int[TAMANHO_FILA];
        int topoFila = 0;
        int topoPilha = 0;
        Random random = new Random();

        for (int i = 0; i < TAMANHO_FILA; i++) {
            int numero = random.nextInt(MAX_NUMERO);

            boolean existeNaFila = false;
            for (int j = 0; j < topoFila; j++) {
                if (filaF[j] == numero) {
                    existeNaFila = true;
                    break;
                }
            }

            if (!existeNaFila && topoFila < filaF.length) {
                filaF[topoFila++] = numero; 
            } else {
                pilhaP[topoPilha++] = numero; 
            }
        }

        System.out.println("Fila F (números distintos):");
        imprimirVetor(filaF, topoFila);

        System.out.println("\nPilha P (números repetidos):");
        imprimirVetor(pilhaP, topoPilha);

        System.out.println("\nEstatísticas:");
        System.out.println("Total de números distintos na Fila F: " + topoFila);
        System.out.println("Total de números repetidos na Pilha P: " + topoPilha);
    }

    private static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
            if ((i + 1) % 10 == 0) { 
                System.out.println();
            }
        }
    }
}
