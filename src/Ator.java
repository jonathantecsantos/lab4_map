
public class Ator implements Funcionario {
	

	private Pessoa pessoa;
	private int idAtor;
	
	public Ator(Pessoa pessoa, int idAtor) {
		this.pessoa = pessoa;
		this.idAtor = idAtor;
	}
	
	public String getNome() {
		return this.pessoa.getNome();
	}
	
	public void setNome(String nome) {
		this.pessoa.setNome(nome);
	}
	
	public String getEndereco() {
		return this.pessoa.getEndereco();
	}
	
	public void setEndereco(String endereco) {
		this.pessoa.setEndereco(endereco);
	}

	public int getIdAtor() {
		return idAtor;
	}

	public void setIdAtor(int idAtor) {
		this.idAtor = idAtor;
	}
	@Override
	public String funcao() {
		return "Ator";
	}

}
