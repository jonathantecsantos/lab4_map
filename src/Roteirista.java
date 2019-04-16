
public class Roteirista implements Funcionario{
	

	private Pessoa pessoa;
	private int idRoteirista;
	
	public Roteirista(Pessoa pessoa, int idRoteirista) {
		this.pessoa = pessoa;
		this.idRoteirista = idRoteirista;
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

	public int getIdRoteirista() {
		return idRoteirista;
	}

	public void setIdRoteirista(int idRoteirista) {
		this.idRoteirista = idRoteirista;
	}
	
	@Override
	public String funcao() {
		return "Roteirista";
	}
	

}
