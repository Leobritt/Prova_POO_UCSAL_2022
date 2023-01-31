package Resource;

public class Curso {
	
	private String silga;
	
	private String descricao;

	public Curso(String silga, String descricao) {
		super();
		this.silga = silga;
		this.descricao = descricao;
	}

	public String getSilga() {
		return silga;
	}

	public void setSilga(String silga) {
		this.silga = silga;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Curso: " + silga + " Descricao: " + descricao;
	}
	
	

}
