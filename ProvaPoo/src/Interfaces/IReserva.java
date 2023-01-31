package Interfaces;

import Entites.Professores;
import Resource.Lab;
import Services.Solicitacao;

public interface IReserva {
	
	Solicitacao solicitacaoReserva(Professores p, Lab l, String d, String h);  
	
	Professores identificacaoProfessor();
	
	Lab identificacaoLab();
	
	String identificacaoData();
	
	String identificacaoHora();
	

}
