package entidades;

public class Aluno {

	private String nome, email;
	
	

	public Aluno() {
	}

	public Aluno(String nome, String email) {

		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}