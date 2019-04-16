
public class Camera implements Funcionario {


	private Pessoa pessoa;
	private int idCamera;
	
	public Camera(Pessoa pessoa, int idCamera) {
		this.pessoa = pessoa;
		this.idCamera = idCamera;
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

	public int getIdCamera() {
		return idCamera;
	}

	public void setIdCamera(int idCamera) {
		this.idCamera = idCamera;
	}
	
	@Override
	public String funcao() {
		return "Camera";
	}
	
}
