package Services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import Entites.Aluno;
import Entites.Professores;
import Interfaces.IBaseDado;
import Resource.Curso;
import Resource.Disciplina;
import Resource.Lab;

public class BaseDado implements IBaseDado {

	@Override
	public ArrayList<Professores> listProfessor() {
		ArrayList<Professores> teactherList = new ArrayList();

		for (int i = 0; i < 10; i++) {
			teactherList.add(new Professores("Professor0" + (i + 1), listDisciplina().get(i)));
		}

		return teactherList;
	}

	@Override
	public ArrayList<ArrayList<Aluno>> listAluno() {

		ArrayList<ArrayList<Aluno>> studentList = new ArrayList<ArrayList<Aluno>>();

		ArrayList<Aluno> listBES = new ArrayList<>();

		for (int i = 0; i < 200; i++) {
			listBES.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listBES);

		ArrayList<Aluno> listADS = new ArrayList<>();

		for (int i = 0; i < 120; i++) {
			listADS.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listADS);

		ArrayList<Aluno> listDigitalGames = new ArrayList<>();

		for (int i = 0; i < 90; i++) {
			listDigitalGames.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listDigitalGames);

		ArrayList<Aluno> listGTI = new ArrayList<>();

		for (int i = 0; i < 40; i++) {
			listGTI.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listGTI);

		ArrayList<Aluno> listINF = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			listINF.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listINF);

		ArrayList<Aluno> listRDC = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			listRDC.add(new Aluno("20222" + (i + 1), "Aluno" + (i + 1)));
		}
		studentList.add(listRDC);
		return studentList;
	}

	@Override
	public ArrayList<Lab> listLab() {
		ArrayList<Lab> labList = new ArrayList<>();

		for (int i = 1; i < 8; i++) {
			labList.add(new Lab("LAB" + i, 20));
		}
		for (int j = 8; j < 12; j++) {
			labList.add(new Lab("LAB" + j, 15));

		}
		for (int l = 12; l < 13; l++) {
			labList.add(new Lab("LAB" + l, 30));
		}

		return labList;
	}

	@Override
	public ArrayList<Disciplina> listDisciplina() {
		ArrayList<Disciplina> listDisciplina = new ArrayList<>();

		listDisciplina.add(new Disciplina("BES005", "LÓGICA DE PROGRAMAÇÃO E ALGORITMO"));

		listDisciplina.add(new Disciplina("BES006", "ESTRUTURA DE DADOS"));

		listDisciplina.add(new Disciplina("BES008", "PROGRAMCAO ORIENTADA A OBJETO"));

		listDisciplina.add(new Disciplina("BES011", "BANCO DE DADOS"));

		listDisciplina.add(new Disciplina("BES012", "ENGENHARIA DE REQUISITOS"));

		listDisciplina.add(new Disciplina("BES020", "PROGRAMAÇAO PARA DISPOSITIVOS MOVEIS"));

		listDisciplina.add(new Disciplina("BES026", "SISTEMAS DISTRIBUIDOS"));

		listDisciplina.add(new Disciplina("BES038", "INTELIGENCIA ARTIFICIAL"));

		listDisciplina.add(new Disciplina("BES049", "PROGRAMACAO WEB"));

		listDisciplina.add(new Disciplina("BES048", "PROGRAMACAO FRONT-END"));

		return listDisciplina;
	}

	@Override
	public ArrayList<Curso> listCurso() {
		ArrayList<Curso> listCurso = new ArrayList<>();
		listCurso.add(new Curso("BES", "BACHERELADO EM ENGNHARIA DE SOFTWARE 200 Alunos"));

		listCurso.add(new Curso("ADS", "ANALISE DE DESSENVOLVIMENTO DE SISTEMAS 120 Alunos"));

		listCurso.add(new Curso("JGD", "JOGOS DIGITAIS 90 Alunos"));

		listCurso.add(new Curso("GTI", "GOVERNANCA DE TECNOLOGIA DA INFORMACAO 40 Alunos"));

		listCurso.add(new Curso("INF", "INFORMATICA 20 Alunos"));

		listCurso.add(new Curso("RDC", "REDE DE COMPUTADORES 30 Alunos"));

		return listCurso;
	}

}
