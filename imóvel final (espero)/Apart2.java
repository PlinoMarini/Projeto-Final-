
public class Apart2 extends Residencial2 {
	
	private int andar; 
	private byte portaria; 
	protected double valor_condominio;
	
	public Apart2(int andar, byte portaria, double valor_condominio) {
		super();
		setAndar(andar);
		setValor_condominio(valor_condominio);
		setPortaria(portaria); 
	}

	@Override
	/**
	 * @param quanto menor o valor de índice, melhor e mais fácil será a venda ou aluguel do apartamento
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2 && alug_venda == 1) {
			indice = (((quartos + suite + piscina + area) - (valor_aluguel + valor_condominio)  / (1000 * 0.8))+2); 
		}
		else if (status != 2 && alug_venda == 2){
			indice = (((quartos + suite + piscina + area) - (valor_venda + valor_condominio)  / (1000 * 0.6))+2);
		}
		else 
			indice = 0; 
		
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		if(status != 2 && andar > 0) {
			this.andar = andar;
		}
		else 
			this.andar = 0; 
	}

	public byte getPortaria() {
		return portaria;
	}
	
	/**
	 * 
	 * @param portaria == 1 -> Há portaria / portaria == 2 -> Não há portaria 
	 * @return
	 */
	public boolean setPortaria(byte portaria) {
		if((portaria == 1 || portaria == 2) && status != 2) {
			this.portaria = portaria;
			return true; 
		}
		else 
			return false; 
	}

	public double getValor_condominio() {
		return valor_condominio;
	}

	public void setValor_condominio(double valor_condominio) {
		if(status != 2 && valor_condominio > 0) {
			this.valor_condominio = valor_condominio;
		}
		else 
			this.valor_condominio = 0.0; 
	}
	
	

}//------------------------end-----------------------//
