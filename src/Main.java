

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        List<Cartela> cartelas = new ArrayList<>();
        Bingo bingo = new Bingo(6);
        SortearNumero sorteio = new SortearNumero();
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        do {
            menu();
            op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1:
                System.out.println("Digite o nome da cartela:");
                String nomeCartela = scanner.nextLine();
                Cartela novaCartela = new Cartela(nomeCartela);
                novaCartela.gerarNumerosDaCartela(); 
                bingo.incluirCartela(novaCartela); 
                break;
                case 2:
                    sorteio.sortearNumero();
                    System.out.println("Número sorteado: " + sorteio.getNumero());
                    bingo.sortear(sorteio); 
                    break;
                case 3:
                    bingo.consultarJogadores();
                    break;
                case 4:
                    bingo.consultarNumSorteados(sorteio);
                    break;
                case 5:
                    bingo.consultarNumNaoSorteados(sorteio);
                    break;
                case 6:
                    bingo.consultarNumOrdemCrescente(sorteio);
                    break;
                case 7:
                    bingo.consultarQtdNumSorteados();
                    break;
                case 8:
                    System.out.println("Digite o nome da cartela a ser excluída:");
                    String nomeExcluir = scanner.nextLine();
                    bingo.excluirCartela(nomeExcluir);
                    System.out.println("Cartela excluída.");
                    break;
                    case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 9);

        scanner.close();
    }

    public static void menu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Criar nova cartela");
        System.out.println("2. Sortear um novo número");
        System.out.println("3. Listar jogadores e suas cartelas");
        System.out.println("4. Consultar números sorteados");
        System.out.println("5. Consultar números não sorteados");
        System.out.println("6. Consultar números em ordem crescente");
        System.out.println("7. Consultar quantidade de números sorteados");
        System.out.println("8. Excluir cartela");
        System.out.println("9. sair");
    }
}
