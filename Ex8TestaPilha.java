import java.util.Random;

public class Ex8TestaPilha {
    private static final int TAMANHO = 1000;
    private int[] pilhaP; 
    private int[] pilhaN; 
    private int topoP;
    private int topoN;
    
    public Ex8TestaPilha() {
        pilhaP = new int[TAMANHO];
        pilhaN = new int[TAMANHO];
        topoP = -1;
        topoN = -1;
    }
    
    public void processarNumeros() {
        Random random = new Random();
        
        for (int i = 0; i < TAMANHO; i++) {
            int numero = random.nextInt(201) - 100; 
            
            if (numero > 0) {
                empilharP(numero);
            } else if (numero < 0) {
                empilharN(numero);
            } else {
                desempilharEImprimir();
            }
        }
        
        System.out.println("\nProcessamento concluído!");
        System.out.println("Elementos restantes na pilha P: " + (topoP + 1));
        System.out.println("Elementos restantes na pilha N: " + (topoN + 1));
    }
    
    private void empilharP(int numero) {
        if (topoP < pilhaP.length - 1) {
            pilhaP[++topoP] = numero;
        }
    }
    
    private void empilharN(int numero) {
        if (topoN < pilhaN.length - 1) {
            pilhaN[++topoN] = numero;
        }
    }
    
    private void desempilharEImprimir() {
        if (topoP >= 0 && topoN >= 0) {
            int numP = pilhaP[topoP--];
            int numN = pilhaN[topoN--];
            System.out.println("Zero encontrado! Desempilhados: " + numP + " (P) e " + numN + " (N)");
        } else {
            System.out.println("Zero encontrado, mas uma das pilhas está vazia!");
        }
    }
    
    public static void main(String[] args) {
        Ex8TestaPilha testador = new Ex8TestaPilha();
        testador.processarNumeros();
    }
}