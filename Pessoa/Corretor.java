
public class Corretor extends Funcionario {
	public static final double porcentagemComissao = 0.05;
	private double salario;
	private double vendasMes;
	
	public void aumentaVendasMes(double venda) {
		vendasMes += venda;
	}
	
	public void zeraVendasMes() {
		vendasMes = 0;
	}
	
	public double calculaSalario() {
		salario = super.calculaSalario() + (vendasMes * porcentagemComissao);
		return salario;
	}

}
