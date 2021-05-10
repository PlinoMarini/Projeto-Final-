
public class Comercial2 extends Imovel2{
	protected int comodos; 
	protected int banheiros; 
	
	
	
	public Comercial2(int comodos, int banheiros) {
		super();
		setComodos(comodos);
		setBanheiros(banheiros);
	}


	@Override
	/**
	 * @param quanto menor o valor de índice, melhor e mais fácil será a venda ou aluguel da sala comercial 
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2 && alug_venda == 1) {
			indice = (((comodos + banheiros + area) - valor_aluguel)  / (1000 * 0.8))+3; 
		}
		else if (status != 2 && alug_venda == 2){
			indice = (((comodos + banheiros + area) - valor_venda)  / (1000 * 0.6))+3;
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
