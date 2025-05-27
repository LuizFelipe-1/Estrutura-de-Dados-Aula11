import java.util.Random;

public class Ex6{
    private static final int TOTAL_NUMEROS = 2000;
    private static final int MAX_VALOR = 10000;

    public static void main(String[] args) {
        int[] fila = new int[TOTAL_NUMEROS];
        int[] pilha = new int[TOTAL_NUMEROS];
        int inicioFila = 0;
        int fimFila = 0;
        int topoPilha = -1;

        Random random = new Random();
        for (int i = 0; i < TOTAL_NUMEROS/2; i++) {
            fila[fimFila++] = random.nextInt(MAX_VALOR) + 1;    
            fila[fimFila++] = - (random.nextInt(MAX_VALOR) + 1); 
        }

        while (inicioFila < fimFila) {
            if (fila[inicioFila] > 0) {
                if (topoPilha < pilha.length - 1) {
                    pilha[++topoPilha] = fila[inicioFila];
                    System.out.println("Empilhado: " + fila[inicioFila]);
                } else {
                    System.out.println("Pilha cheia! Não foi possível empilhar: " + fila[inicioFila]);
                }
                inicioFila++;
            } else {
                if (topoPilha >= 0) {
                    System.out.println("Desempilhado e impresso: " + pilha[topoPilha--]);
                } else {
                    System.out.println("Pilha vazia! Nada para desempilhar.");
                }
                inicioFila++;
            }
        }

        System.out.println("\nProcessamento concluído!");
        System.out.println("Elementos restantes na pilha: " + (topoPilha + 1));
    }
}