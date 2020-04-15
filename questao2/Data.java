package questao2;

public class Data {
	int dia;
	int mes;
	int ano;
	public Data(String dia, String mes, String ano) {
		this.dia = Integer.valueOf(dia);
		this.mes = Integer.valueOf(mes);
		this.ano = Integer.valueOf(ano);
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
