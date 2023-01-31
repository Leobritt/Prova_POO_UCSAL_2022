package Entites;

public class Aluno {

	private String nome;

	private String matricula;

	public Aluno() {
		super();
	}

	public Aluno(String matricula,String nome) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "("+matricula+")" +  "\nNome " + nome;
	}
	

}
