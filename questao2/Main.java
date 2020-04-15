package questao2;
import java.util.Scanner; 

public class Main{
	static BancoDeDados bd = new BancoDeDados();
	static Scanner sc = new Scanner(System.in);
	int num;

public static void main(String[] args) {
		do {
			menu();
			int num = Integer.valueOf(sc.nextLine());
			switch (num) {  
	        case 0:  
	            System.out.println("Fim do programa!");
	            System.exit(0);
	        case 1:   
	            System.out.println("Digite o nome, descricao e a data limite");  
	            String entrada = sc.nextLine();
	            String[] entradav = entrada.split(",");
	            String[] entradad = entradav[2].split("/");
	            Data datatemp = new Data(entradad[0],entradad[1],entradad[2]);
	            bd.criarTarefa(entradav[0],datatemp,entradav[1]);
	            System.out.println("Adicionado com Sucesso!");
	            break;
	        case 2:
	        	System.out.println("Digite a posicao da tarefa para ser removida");
	        	int entrada2 = Integer.valueOf(sc.nextLine());
	        	bd.removerTarefa(entrada2);
	        	System.out.println("Tarefa removida!");
	        	break;
	        case 3:
	        	System.out.println("Digite a posicao e a tarefa a ser editada");
	        	String entrada3 = sc.nextLine();
	        	String[] entrada3v = entrada3.split(",");
	        	int entrada3i = Integer.valueOf(entrada3v[0]);
	        	bd.alterarNome(entrada3i,entrada3v[1]);
	        	break;
	        case 4:
	        	System.out.println("Digite a posicao e o novo status do tarefa a ser editada");
	        	String entrada4 = sc.nextLine();
	        	String[] entrada4v = entrada4.split(",");
	        	int entrada4i = Integer.valueOf(entrada4v[0]);
	        	if(entrada4v[1].equals("feita")) {
	        		bd.alterarStatus(entrada4i, true); 
	        	}
	        	break;
	        case 5:
	        	System.out.println("Digite a posicao e o nova data da tarefa a ser editada");
	        	String entrada5 = sc.nextLine();
	        	String[] entrada5v = entrada5.split(",");
	        	int entrada5i = Integer.valueOf(entrada5v[0]);
	        	String[] entrada5d = entrada5v[1].split("/");
	        	Data datatemp2 = new Data(entrada5d[0],entrada5d[1],entrada5d[2]);
	        	bd.alterarData(entrada5i, datatemp2);
	        	break;
	        case 6:
	        	System.out.println("Digite a posicao e o nova descricao da tarefa a ser editada");
	        	String entrada6 = sc.nextLine();
	        	String[] entrada6v = entrada6.split(",");
	        	int entrada6i = Integer.valueOf(entrada6v[0]);
	        	bd.alterarDescricao(entrada6i, entrada6v[1]);
	        	break;
	        case 7:
	        	System.out.println("Digite o nome do contato que voce quer buscar");
	        	String entrada7 = sc.nextLine();
	        	System.out.println(bd.consultarTarefa(entrada7).getNome()+","+bd.consultarTarefa(entrada7).getDescricao()+","+bd.consultarTarefa(entrada7).getStatus());
	        	break;
	        default:  
	            System.out.println("Opção Invalida. Tente novamente!");
	            break;
			} }while(true);
}
public static void menu() {
	System.out.println("Digite:\n[1] - CRIAR CONTATO\n[2] - EXCLUIR\n[3] - ALTERAR TAREFA\n[4] - ALTERAR STATUS\n[5] - ALTERAR DATA\n[6] - ALTERAR DESCRICAO\n[7] - BUSCAR [0] - SAIR DO PROGRAMA");
}
}