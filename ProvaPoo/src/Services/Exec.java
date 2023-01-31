package Services;

import Entites.Professores;
import Print.Impressao;
import Resource.Lab;

public class Exec {
	public static void main(String[] args) {
		BaseDado bd = new BaseDado();
		Impressao imp = new Impressao();
		Reserva reserva = new Reserva();

		//imp.imprimirListaAluno(bd.listAluno());
		System.out.println("--------------------------------");

		imp.imprimirListaCurso(bd.listCurso());
		System.out.println("--------------------------------");

		imp.imprimirListaDisciplina(bd.listDisciplina());
		System.out.println("--------------------------------");

		imp.imprimirListaLab(bd.listLab());
		System.out.println("--------------------------------");

		imp.imprimirListaProfessores(bd.listProfessor());
		System.out.println("--------------------------------");

		Professores prof = reserva.identificacaoProfessor();

		Lab lab = reserva.identificacaoLab();

		String data = reserva.identificacaoData();

	
		String hora = reserva.identificacaoHora();

		reserva.solicitacaoReserva(prof,lab,data,hora);
		
	}

}
