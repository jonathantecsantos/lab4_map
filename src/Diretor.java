
public class Diretor implements Funcionario{
	
	private Pessoa pessoa;
	private int idDiretor;
	
	public Diretor(Pessoa pessoa, int idDiretor) {
		this.pessoa = pessoa;
		this.idDiretor = idDiretor;
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

	public int getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(int idDiretor) {
		this.idDiretor = idDiretor;
	}
	
	@Override
	public String funcao() {
		return "Diretor";
	}
	
	

}
