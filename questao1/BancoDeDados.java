package questao1;

public class BancoDeDados {
	int count = 0;
	Contato[] contatos = new Contato[20];
	
	public void criarContato(String n,String t,String e) {
		Contato novoContato = new Contato(n,t,e);
		contatos[count] = novoContato;
		count ++;
	}
	public void removerContato(int posicao) {
		contatos[posicao] = null;
	}
	public Contato consultarContato(String busca) {
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i].getNome().equals(busca)) {
				return contatos[i];
			}
			else{
				continue;
			}
		}
		return null;
		
	}
	public void alterarNome(int posicao, String novoNome) {
		contatos[posicao].setNome(novoNome);
	}
	public void alterarEndereco(int posicao, String novoEndereco) {
		contatos[posicao].setEndereco(novoEndereco);
	}
	public void alterarTelefone(int posicao, String novoTelefone) {
		contatos[posicao].setTelefone(novoTelefone);
	}
}
