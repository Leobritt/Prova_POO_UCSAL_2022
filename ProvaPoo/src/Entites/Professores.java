package Entites;

import Resource.Disciplina;

public class Professores {

	private String nome;

	private Disciplina disciplina; 

	public Professores() {
		
	}

	public Professores(String nome, Disciplina disciplina) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Professore: " + nome + " Disciplina: " + disciplina.getSigla();
	}

	

}
