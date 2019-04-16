import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repositorio {
	private List<Filme> filmes;
	
	private int id;
	
	
	public Repositorio() {
		this.filmes = new ArrayList<Filme>();
		this.id=0;
	}
	
	
	public void addFilme() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do filme: ");
		String nome = sc.nextLine();
		System.out.println("Digite o ano do filme: ");
		String ano = sc.nextLine();
		System.out.println("Digite a trilha sonora do filme: ");
		String trilha = sc.nextLine();
		System.out.println("Digite o nome do Diretor do filme: ");
		String nomeDiretor = sc.nextLine();
		Pessoa dir = new Pessoa(nomeDiretor,"");
		Diretor diretor = new Diretor (dir,id);
		this.id++;
		System.out.println("Digite o nome do Roteirista do filme: ");
		String nomeRoteirista = sc.nextLine();
		Pessoa rot = new Pessoa(nomeRoteirista,"");
		Roteirista roteirista = new Roteirista (rot,id);
		this.id++;
		System.out.println("Digite o nome do Ator do filme: ");
		String nomeAtor = sc.nextLine();
		Pessoa at = new Pessoa(nomeAtor,"");
		Ator ator = new Ator(at,id);
		this.id++;
		Filme novoFilme = new Filme(nome, ano, trilha,
				diretor, roteirista, ator,id);
		this.id++;
		this.filmes.add(novoFilme);
		System.out.println("Novo Filme cadastrado com sucesso!");
	}
	
	public String listaFilmes() {
		String saida = "";
		for (Filme filme : filmes) {
			saida = saida+ filme.toString()+System.lineSeparator();		
		}
		return saida;	
	}
	
	public Filme procuraFilme(int id) {
		Filme procurado=null;
		for (Filme filme : filmes) {
			if(filme.getId()==id) {
				procurado = filme;
			}
		}
		return procurado;
	}
	
	public void addAtor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do filme que deseja adicionar um ator novo ");
		int id = sc.nextInt();
		Filme procurado = procuraFilme(id);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o nome do novo ator: ");
		String nomeAtor = sc2.nextLine();
		Pessoa ator = new Pessoa(nomeAtor,"");
		Ator atornovo = new Ator(ator,this.id);
		this.id++;
		procurado.addAtor(atornovo);
		System.out.println("Novo Ator Adicionado com sucesso!");
		
	}
	
	public void  filmografia() {
		String saida ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionario que deseja ver a filmografia ");
		String nome = sc.nextLine();
	    for (Filme filme : filmes) {
	    	if(filme.getDiretor().getNome().equalsIgnoreCase(nome)) {
	    		saida = saida + "O funcionario "+nome+" participou como "+ filme.getDiretor().funcao()+" no filme "+ filme.getNome()+System.lineSeparator();
	    	}else if(filme.getRoteirista().getNome().equalsIgnoreCase(nome)) {
	    		saida = saida + "O funcionario "+nome+" participou como "+ filme.getRoteirista().funcao()+" no filme "+ filme.getNome()+System.lineSeparator();
	    	}
	    	
	    	for (Ator ator : filme.getElenco()) {
	    		if(ator.getNome().equalsIgnoreCase(nome)) {
	    			saida = saida + "O funcionario "+nome+" participou como "+ ator.funcao()+" no filme "+ filme.getNome()+System.lineSeparator();
	    			
	    		}
	    	}
		}
	    
	    System.out.println(saida);
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
	

}
