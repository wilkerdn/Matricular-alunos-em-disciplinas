package numero1;

public class Aluno {
	private int numMatricula;
	private String nome;
	private String cpf;
	private Data dataNasc;
	
	public Aluno() {
		numMatricula = 0;
		nome = "";
		cpf = "";
		dataNasc = new Data();
	}
	
	public Aluno(int numMatricula) {
		this.numMatricula = numMatricula;
		nome = "";
		cpf = "";
		dataNasc = new Data();
	}
	
	public int getNumMatricula() {
		return numMatricula;
	}
	
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Data getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String retornaAluno() {
		return "Número de matrícula: "+numMatricula+
				"\nNome: "+nome+
				"\nCPF: "+cpf+
				"\nData de nascimento: "+dataNasc.dia+"/"+dataNasc.mes+"/"+dataNasc.ano;
	}
}
