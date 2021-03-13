package numero1;

import java.util.ArrayList;

public class Matricula {
	private Aluno aluno;
	private ArrayList<Disciplina> disciplinas;
	
	public Matricula() {
		aluno = new Aluno();
		disciplinas = new ArrayList<>();
	}
	
	public void inserirDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String retornaMatricula() {
		String retorno = "";
		retorno += aluno.retornaAluno()+"\n";
		for(int i=0;i<disciplinas.size();i++) {
			retorno += disciplinas.get(i).retornaDisciplina()+"\n";
		}
		return retorno;
	}
}
