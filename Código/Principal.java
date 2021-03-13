package numero1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Disciplina> cadastroGeral = new ArrayList<>();
		ArrayList<Matricula> matriculas = new ArrayList<>();
		
		int op,op2;
		String imp;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES:\n1 - Cadastrar disciplina\n2 - Matricular aluno\n3 - Imprimir matrícula de aluno\n4 - Imprimir todas as matrículas\n5 - Imprimir todas as disciplinas\n0 - Sair"));
			switch(op) {
			case 1:{
				Disciplina d = new Disciplina();
				d.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
				d.setNome(JOptionPane.showInputDialog("Digite o nome da disciplina"));
				d.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária")));
				cadastroGeral.add(d);
				break;
			}
			case 2:{
				Aluno a = new Aluno();
				a.setNumMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da matrícula")));
				a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
				a.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
				Data dt = new Data();
				dt.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento"));
				dt.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento"));
				dt.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
				a.setDataNasc(dt);
				Matricula m = new Matricula();
				m.setAluno(a);
				do {
					imp = "";
					imp += "Escolha uma disciplina\n";
					for(int i=0;i<cadastroGeral.size();i++) {
						imp += i + " - " + cadastroGeral.get(i).retornaDisciplina()+"\n\n";
					}
					int escolha = Integer.parseInt(JOptionPane.showInputDialog(imp));
					m.inserirDisciplina(cadastroGeral.get(escolha));
					op2 = Integer.parseInt(JOptionPane.showInputDialog("Adicionar outra disciplina?\n1 - SIM\n0 - NÃO"));
				}while(op2!=0);
				matriculas.add(m);
				break;
			}
			case 3:{
				String imp2 = "";
				imp2 += "Digite o número de matrícula do aluno\n";
				for(int i=0;i<matriculas.size();i++) {
					imp2 += matriculas.get(i).getAluno().getNumMatricula() +" - "+ matriculas.get(i).getAluno().getNome() + "\n\n";
				}
				int escolha = Integer.parseInt(JOptionPane.showInputDialog(imp2));
				for(Matricula matricula: matriculas) {
					if(escolha == matricula.getAluno().getNumMatricula()) {
						JOptionPane.showMessageDialog(null,matricula.retornaMatricula());
					}
				}
				break;
			}
			case 4:{
				String imp3 = "";
				imp3 += "MATRÍCULAS\n";
				for(int i=0;i<matriculas.size();i++) {
					imp3 += matriculas.get(i).retornaMatricula() + "\n\n";
				}
				JOptionPane.showMessageDialog(null,imp3);
				break;
			}
			case 5:{
				String imp4 = "";
				imp4 += "DISCIPLINAS\n";
				for(int i=0;i<cadastroGeral.size();i++) {
					imp4 += cadastroGeral.get(i).retornaDisciplina() + "\n\n";
				}
				JOptionPane.showMessageDialog(null,imp4);
				break;
			}
			case 0:{
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida!");
			}
		}while(op!=0);	
	}
}
