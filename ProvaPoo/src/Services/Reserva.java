package Services;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Entites.Professores;
import Interfaces.IReserva;
import Resource.Lab;

public class Reserva implements IReserva {
	Scanner input = new Scanner(System.in);
	BaseDado b = new BaseDado();

	@Override
	public Solicitacao solicitacaoReserva(Professores p, Lab l, String d, String h) {
		Solicitacao solicitacao = new Solicitacao(p, l, d, h);

		try {
			//forcando a data e a hora ao erro do null pointer execption, porque irá verificar que eh null e caíra no catch
			d.toString();
			h.toString();
			System.out.println("\nReserva Efetuada:\nProfessor: " + p.getNome() + "\nDisciplina: "
					+ p.getDisciplina().getSigla() + "\nLaboratório: " + l.getIndetificacao()
					+ "\nQuantidade de Maquinas: " + l.getCapacidade() + "\nData Reserva: " + d + "\nHorários: " + h);
		} catch (Exception e) {
			System.err.println("ERRO");
		}
		return solicitacao;
	}

	@Override
	public Professores identificacaoProfessor() {
		System.out.println("Professor, informe seu nome:");
		String nome = input.next();

		for (Professores p : b.listProfessor()) {
			if (p.getNome().equals(nome)) {
				System.out.println("Indentificação válida");
				return p;
			}
		}
		System.out.println("Professor não encontrado");
		return null;
	}

	@Override
	public Lab identificacaoLab() {
		System.out.println("Informe o laborátorio");
		String labName = input.next();
		for (Lab l : b.listLab()) {
			if (l.getIndetificacao().equals(labName)) {
				return l;
			}
		}
		System.out.println("Laboratório não encontrado");
		return null;
	}

	@Override
	public String identificacaoData() {
		System.out.println("Informe a data desejada: ");
		String dataEscolhida = input.next();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFormat = sdf.parse(dataEscolhida);
				return dataEscolhida;
			
		} catch (Exception e) {
			System.err.println("Problema na identificação da data");
		}
		return null;
	}

	@Override
	public String identificacaoHora() {
		List<String> horarios = Arrays.asList("07:00", "08:25", "09:50", "11:15", "14:00", "15:25", "16:50", "19:00",
				"20:25");
		System.out.println("Informe a hora desejada:");

		String horaEscolhida = input.next();
		String verificarHour = null;

		try {
			if (horarios.contains(horaEscolhida)) {
				verificarHour = horaEscolhida;
				return horaEscolhida;
			}
		} catch (Exception e) {
			System.err.println("Problelma na indentificação da hora");
		}

		if (verificarHour == null) {
			System.err.println("Horário não encontrado!");
		}

		return null;
	}

}
