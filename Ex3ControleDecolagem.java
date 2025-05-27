import java.util.Scanner;

class Aviao {
    String nome;
    int identificador;
    
    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }
    
    public String toString() {
        return "Avião: " + nome + " (ID: " + identificador + ")";
    }
}

public class  Ex3ControleDecolagem {
    private static final int TAMANHO_MAXIMO = 100;
    private static Aviao[] filaDecolagem = new Aviao[TAMANHO_MAXIMO];
    private static int inicio = 0;
    private static int fim = 0;
    private static int tamanho = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\nControle de Decolagem");
            System.out.println("1. Listar número de aviões na fila");
            System.out.println("2. Autorizar decolagem do primeiro avião");
            System.out.println("3. Adicionar avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila");
            System.out.println("5. Mostrar características do primeiro avião");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(opcao) {
                case 1:
                    listarNumeroAvoes();
                    break;
                case 2:
                    autorizarDecolagem();
                    break;
                case 3:
                    adicionarAviao(scanner);
                    break;
                case 4:
                    listarTodosAvoes();
                    break;
                case 5:
                    mostrarPrimeiroAviao();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
        
        scanner.close();
    }
    
    private static void listarNumeroAvoes() {
        System.out.println("\nNúmero de aviões aguardando decolagem: " + tamanho);
    }
    
    private static void autorizarDecolagem() {
        if(tamanho == 0) {
            System.out.println("\nNão há aviões na fila de decolagem!");
            return;
        }
        
        Aviao aviao = filaDecolagem[inicio];
        inicio = (inicio + 1) % TAMANHO_MAXIMO;
        tamanho--;
        System.out.println("\nDecolagem autorizada para: " + aviao);
    }
    
    private static void adicionarAviao(Scanner scanner) {
        if(tamanho == TAMANHO_MAXIMO) {
            System.out.println("\nFila de decolagem cheia! Não é possível adicionar mais aviões.");
            return;
        }
        
        System.out.print("\nDigite o nome do avião: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o número identificador: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        Aviao novoAviao = new Aviao(nome, id);
        filaDecolagem[fim] = novoAviao;
        fim = (fim + 1) % TAMANHO_MAXIMO;
        tamanho++;
        System.out.println("Avião adicionado à fila de espera!");
    }
    
    private static void listarTodosAvoes() {
        if(tamanho == 0) {
            System.out.println("\nNão há aviões na fila de decolagem!");
            return;
        }
        
        System.out.println("\nAviões na fila de decolagem:");
        for(int i = 0; i < tamanho; i++) {
            int posicao = (inicio + i) % TAMANHO_MAXIMO;
            System.out.println((i+1) + ". " + filaDecolagem[posicao]);
        }
    }
    
    private static void mostrarPrimeiroAviao() {
        if(tamanho == 0) {
            System.out.println("\nNão há aviões na fila de decolagem!");
            return;
        }
        
        System.out.println("\nPrimeiro avião na fila:");
        System.out.println(filaDecolagem[inicio]);
    }
}