
public class Cinegrafista implements Funcionario {
	

	private Pessoa pessoa;
	private int idCinegrafista;
	
	public Cinegrafista(Pessoa pessoa, int idCinegrafista) {
		this.pessoa = pessoa;
		this.idCinegrafista = idCinegrafista;
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

	public int getIdCinegrafista() {
		return idCinegrafista;
	}

	public void setIdCinegrafista(int idCinegrafista) {
		this.idCinegrafista = idCinegrafista;
	}
	
	@Override
	public String funcao() {
		return "Cinegrafista";
	}

}
