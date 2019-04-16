import java.util.Scanner;

public class SisGloboFilmes {
	private static Repositorio repositorio = new Repositorio();
	public static void main(String[] args) {
	
		menu();
		System.out.println("Programa encerrado.");
	
	}
		

	private static void menu() { // menu principal
			
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("\n\n### Sistema de Controle de Filmes  ###");
			System.out.println("\n         =====================================");
			System.out.println("       |     1 - Cadastrar novo Filme          |");
			System.out.println("       |     2 - Listar Filmes Cadastrados     |");
			System.out.println("       |     3 - Adiciona Ator a filme         |");
			System.out.println("       |     4 - Filmografia de um Funcionari  |");
			System.out.println("       |     0 - Encerrar programa             |");
			System.out.println("         =====================================\n");
			opcao = sc.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				repositorio.addFilme();
				break;
			case 2:
				System.out.println(repositorio.listaFilmes());
				break;
			case 3:
				repositorio.addAtor();
				break;
			case 4:
				repositorio.filmografia();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}	
	
}

