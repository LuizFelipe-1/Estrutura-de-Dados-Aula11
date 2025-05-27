import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite uma frase:");
        String texto = scanner.nextLine();

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i< texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }

        System.out.print("Texto invertido: ");
        
        while(!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

        String textoformatado = texto.replaceAll("[ .]", "").toLowerCase();

        Stack<Character> pilhainvertida = new Stack<>();
        for(int i = 0; i < textoformatado.length(); i++) {
            pilhainvertida.push(textoformatado.charAt(i));
        }

        StringBuilder invertido = new StringBuilder();

        while (!pilhainvertida.isEmpty()) {
            invertido.append(pilhainvertida.pop());
        }

        boolean palindromo = textoformatado.equals(invertido.toString());

        System.out.println("\nE palíndromo? " + (palindromo ? "Sim" : "Não"));

        scanner.close();
    }
}
