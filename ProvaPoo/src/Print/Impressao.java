package Print;

import java.util.ArrayList;

import Entites.Aluno;
import Entites.Professores;
import Resource.Curso;
import Resource.Disciplina;
import Resource.Lab;

public class Impressao {
	
	public void imprimirListaLab(ArrayList<Lab> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public void imprimirListaAluno(ArrayList<ArrayList<Aluno>> List) {
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).toString());
		}
	}
	public void imprimirListaProfessores(ArrayList<Professores> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public void imprimirListaCurso(ArrayList<Curso> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public void imprimirListaDisciplina(ArrayList<Disciplina> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
