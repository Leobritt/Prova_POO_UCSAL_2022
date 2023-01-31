package Services;

import Entites.Professores;
import Resource.Lab;

public class Solicitacao {

	private Professores professores;

	private Lab lab;

	private String data;

	private String hora;

	public Solicitacao() {
		super();
	}

	public Solicitacao(Professores professores, Lab lab, String data, String hora) {
		super();
		this.professores = professores;
		this.lab = lab;
		this.data = data;
		this.hora = hora;
	}

	public Professores getProfessores() {
		return professores;
	}

	public void setProfessores(Professores professores) {
		this.professores = professores;
	}

	public Lab getLab() {
		return lab;
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "----------Solicitando Laboratorio---------- \nProfessores: " + professores + " Lab:" + lab + " data: " + data + "hora: " + hora;
	}

}
