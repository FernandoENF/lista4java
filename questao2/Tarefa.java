package questao2;

public class Tarefa {
	private String descricao;
	private String nome;
	private boolean status;
	private Data data;
	
	public Tarefa(String nome, Data data, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.status = false;
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		if (status = true) {
				return "feita";
		} else {
			return "nao feita";
		}
	}
		
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	

}