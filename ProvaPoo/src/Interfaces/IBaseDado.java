package Interfaces;

import java.util.ArrayList;
import java.util.List;

import Entites.Aluno;
import Entites.Professores;
import Resource.Curso;
import Resource.Disciplina;
import Resource.Lab;

public interface IBaseDado {
	ArrayList<Professores> listProfessor();

	ArrayList<ArrayList<Aluno>> listAluno();

	ArrayList<Lab> listLab();

	ArrayList<Disciplina> listDisciplina();
	
	ArrayList<Curso> listCurso();
}
