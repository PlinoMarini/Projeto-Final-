
public class Casa2 extends Residencial2 {
	
	@Override
	/**
	 * quanto menor o valor de índice, melhor e mais fácil será a venda ou aluguel da casa
	 */
	public void calculaIndiceVendaLocacao() {
		
		if(status != 2 && alug_venda == 1) {
			indice = ((((quartos + suite + piscina + area) - valor_aluguel)  / (1000 * 0.8))+1) *-1; 
		}
		else if (status != 2 && alug_venda == 2){
			indice = ((((quartos + suite + piscina + area) - valor_venda)  / (1000 * 0.6 ))+1) *-1;
		}
		else 
			indice = 0; 
	}
	
}
