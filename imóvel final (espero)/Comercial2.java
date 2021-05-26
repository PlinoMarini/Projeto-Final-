
public class Comercial2 extends Imovel2{
	protected int comodos; 
	protected int banheiros; 
	
	public Comercial2(ClienteProprietario cp, int comodos, int banheiros) {
		super(cp);
		this.comodos = comodos;
		this.banheiros = banheiros;
	}
	
	/**
	 * O indice e calculado a partir dos valores contrastantes 
	 * do numero de comodos, area construida, e o valor do aluguel ou venda. 
	 * Logo, caso o imovel tenha muitos comodos, piscina e etc e seu valor for baixo, mais facil sera a compra ou o aluguel
	 * Para SALAS COMERCIAIS, o valor do indice tera um multiplicador (3x) para se diferenciar dos demais imoveis
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2 && alug_venda == 1) {
			indice = (((comodos + banheiros + area) - valor_aluguel)*(-1))*3 ; 
		}
		else if (status != 2 && alug_venda == 2){
			indice = (((comodos + banheiros + area) - valor_venda) / 1000)*3; 
		}
		else 
			indice = 0; 
		
	}


	public int getComodos() {
		return comodos;
	}


	public void setComodos(int comodos) {
		if(comodos > 0 && status != 2 ) {
			this.comodos = comodos;
		}
		else 
			this.comodos = 0; 
	}


	public int getBanheiros() {
		return banheiros;
	}


	public void setBanheiros(int banheiros) {
		if(banheiros > 0 && status != 2) {
			this.banheiros = banheiros;
		}
		else
			this.banheiros = 0; 
	}
}
