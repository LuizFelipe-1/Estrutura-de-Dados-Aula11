import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Pilha original: " + pilha);

        System.out.print("Digite a chave a ser removida: ");
        int chave = scanner.nextInt();

        removerChave(pilha, chave);

        System.out.println("Pilha após remoção: " + pilha);
    }

    public static void removerChave(Stack<Integer> pilha, int chave) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        while (!pilha.isEmpty()) {
            int elemento = pilha.pop();
            if (elemento == chave) {
                break; 
            }
            pilhaAuxiliar.push(elemento);
        }

        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
