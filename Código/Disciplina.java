package numero1;

public class Disciplina {
	private int codigo;
	private String nome;
	private int cargaHoraria;
	
	public Disciplina() {
		codigo = 0;
		nome = "";
		cargaHoraria = 0;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String retornaDisciplina() {
		return "Código: "+codigo+"\nNome: "+nome+"\nCarga horaria: "+cargaHoraria;
	}
}
