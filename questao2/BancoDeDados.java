package questao2;
public class BancoDeDados {
	int count = 0;
	Tarefa[] tarefas = new Tarefa[20];
	
	public void criarTarefa(String n,Data d,String d2) {
		Tarefa novaTarefa = new Tarefa(n,d,d2);
		tarefas[count] = novaTarefa;
		count ++;
	}
	public void removerTarefa(int posicao) {
		tarefas[posicao] = null;
	}
	public Tarefa consultarTarefa(String busca) {
		for(int i = 0; i < tarefas.length; i++) {
			if(tarefas[i].getNome().equals(busca)) {
				return tarefas[i];
			}
			else{
				continue;
			}
		}
		return null;
		
	}
	public void alterarNome(int posicao, String novoNome) {
		tarefas[posicao].setNome(novoNome);
	}
	public void alterarStatus(int posicao, boolean novoStatus) {
		tarefas[posicao].setStatus(novoStatus);
	}
	public void alterarData(int posicao, Data novaData) {
		tarefas[posicao].setData(novaData);
	}
	public void alterarDescricao(int posicao, String descricao) {
		tarefas[posicao].setDescricao(descricao);
	}
}