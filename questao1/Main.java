package questao1;
import java.util.Scanner; 

public class Main{
	static BancoDeDados bd = new BancoDeDados();
	static Scanner sc = new Scanner(System.in);
	int num;

public static void main(String[] args) {
		do {
			menu();
			int num = new Integer(sc.nextLine());
	        switch (num) {  
	        case 0:  
	            System.out.println("Fim do programa!");
	            System.exit(0);
	        case 1:   
	            System.out.println("Digite o nome, telefone e endereco");  
	            String entrada = sc.nextLine();
	            String[] entradav = entrada.split(",");
	            bd.criarContato(entradav[0],entradav[1],entradav[2]);
	            System.out.println("Adicionado com Sucesso!");
	            break;
	        case 2:
	        	System.out.println("Digite a posicao do contato para ser removido");
	        	int entrada2 = new Integer(sc.nextLine());
	        	bd.removerContato(entrada2);
	        	System.out.println("Contato removido!");
	        	break;
	        case 3:
	        	System.out.println("Digite a posicao e o novo nome do contato a ser editado");
	        	String entrada3 = sc.nextLine();
	        	String[] entrada3v = entrada3.split(",");
	        	int entrada3i = new Integer(entrada3v[0]);
	        	bd.alterarNome(entrada3i,entrada3v[1]);
	        	break;
	        case 4:
	        	System.out.println("Digite a posicao e o novo endereco do contato a ser editado");
	        	String entrada4 = sc.nextLine();
	        	String[] entrada4v = entrada4.split(",");
	        	int entrada4i = new Integer(entrada4v[0]);
	        	bd.alterarEndereco(entrada4i, entrada4v[1]);
	        	break;
	        case 5:
	        	System.out.println("Digite a posicao e o novo telefone do contato a ser editado");
	        	String entrada5 = sc.nextLine();
	        	String[] entrada5v = entrada5.split(",");
	        	int entrada5i = new Integer(entrada5v[0]);
	        	bd.alterarTelefone(entrada5i, entrada5v[1]);
	        	break;
	        case 6:
	        	System.out.println("Digite o nome do contato que voce quer buscar");
	        	String entrada6 = sc.nextLine();
	        	System.out.println(bd.consultarContato(entrada6).getNome()+","+bd.consultarContato(entrada6).getTelefone()+","+bd.consultarContato(entrada6).getEndereco());
	        	break;
	        default:  
	            System.out.println("Opção Invalida. Tente novamente!");
	            break;
			} }while(true);
}
public static void menu() {
	System.out.println("Digite:\n[1] - CRIAR CONTATO\n[2] - EXCLUIR\n[3] - ALTERAR NOME\n[4] - ALTERAR ENDEREÇO\n[5] - ALTERAR TELEFONE\n[6] - BUSCAR\n[0] - SAIR DO PROGRAMA");
}
}