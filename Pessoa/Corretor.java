import java.util.ArrayList;

public class Corretor extends Funcionario {
	public static final double porcentagemComissao = 0.05;
	private double salario;
	private double vendasMes;
	private ArrayList<String> cursos = new ArrayList<String>();
	
	public Corretor(String nome, String cpf, String sexo, String email, String telefone, String data_ingresso,
			double salario_base) { // Não precisa receber cursos ainda
		super(nome, cpf, sexo, email, telefone, data_ingresso, salario_base);
	}

	public String getCursos() {
		return cursos.toString();
	}

	public boolean removeCurso(String curso) {
		if(cursos.remove(curso)) {
			return true;
		}
		else 
			return false	;		//Não tem essa String (curso) em cursos 
		
	}
	
	public boolean limpaCursos() {
		while(!cursos.isEmpty()) {
			cursos.remove(0);
		}
		if(cursos.isEmpty())
			return true;
		else
			return false;
	}
	

	public boolean setCursos(String[] cursos) {
		for(int i = 0; i < cursos.length; i++) {
			setCursos(cursos[i]);
		}
		return true;
	}
	
	public boolean setCursos(String curso) {
		if(curso.length() > 0) {
			this.cursos.add(curso);			
			return true;
		}
		else
			return false;
		
	}

	public void aumentaVendasMes(double venda) {
		vendasMes += venda;
	}
	
	public double getVendasMes() {
		return vendasMes;
	}
	
	public void zeraVendasMes() {
		vendasMes = 0;
	}
	
	public double calculaSalario() {
		salario = super.calculaSalario() + (vendasMes * porcentagemComissao);
		return salario;
	}

}
