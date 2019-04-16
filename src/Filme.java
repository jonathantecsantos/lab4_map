import java.util.ArrayList;
import java.util.List;

public class Filme {
	private int id;
	private String nome;
	private String ano;
	private String trilhaSonora;
	private Diretor diretor;
	private Roteirista roteirista;
	private List<Ator> elenco;
	
	
	public Filme(String nome, String ano, String trilhaSonora, Diretor diretor, Roteirista roteirista, Ator ator,int id) {
		this.nome = nome;
		this.ano = ano;
		this.trilhaSonora = trilhaSonora;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = new ArrayList<Ator>();
		this.elenco.add(ator);
		this.id = id;
		
	}
	
	public void addAtor(Ator ator) {
		this.elenco.add(ator);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTrilhaSonora() {
		return trilhaSonora;
	}

	public void setTrilhaSonora(String trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public Roteirista getRoteirista() {
		return roteirista;
	}

	public void setRoteirista(Roteirista roteirista) {
		this.roteirista = roteirista;
	}

	public List<Ator> getElenco() {
		return elenco;
	}

	public void setElenco(List<Ator> elenco) {
		this.elenco = elenco;
	}
	
	public String listaAtores() {
		String saida= "";
		for (Ator ator : elenco) {
			saida = saida+ator.getNome()+System.lineSeparator();
		}
		return saida;
	}
	
	public int getId() {
		return this.id;	
	}
	
	@Override
	public String toString() {
		return "ID do Filme: "+ this.id+ System.lineSeparator()+"Filme: "+ this.nome+ System.lineSeparator()+ "Ano: "+ this.ano +System.lineSeparator()+"Trilha Sonora: "+this.trilhaSonora +System.lineSeparator()+"Diretor: "+this.diretor.getNome()+System.lineSeparator()+"Roteirista: "+ this.roteirista.getNome()+System.lineSeparator()+ "Elenco: "+listaAtores();
	}

}
