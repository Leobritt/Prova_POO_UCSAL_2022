package Resource;

public class Lab {

	private Integer capacidade;
	
	private String indetificacao;

	public Lab() {

	}

	public Lab(String indetificacao,Integer capacidade) {
		super();
		this.capacidade = capacidade;
		this.indetificacao = indetificacao;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public String getIndetificacao() {
		return indetificacao;
	}

	public void setIndetificacao(String indetificacao) {
		this.indetificacao = indetificacao;
	}

	@Override
	public String toString() {
		return "Laboratorios: "+ indetificacao + " Capacidade: " +  capacidade;
	}
	

}
