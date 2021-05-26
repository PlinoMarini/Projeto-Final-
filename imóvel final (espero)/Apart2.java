
public class Apart2 extends Residencial2 {
	
	private int andar; 
	private byte portaria; 
	protected double valor_condominio;
	
	
	public Apart2(ClienteProprietario cp, int quartos, int banheiros, int suite, int sala_estar, int sala_jantar,
			int vagas_garagem, int armarios, String descricao, byte piscina, int andar, byte portaria,
			double valor_condominio) {
		super(cp, quartos, banheiros, suite, sala_estar, sala_jantar, vagas_garagem, armarios, descricao, piscina);
		setAndar(andar);
		setValor_condominio(valor_condominio);
		setPortaria(portaria); 
	}
	
	@Override
	/**
	 * O índice e calculado a partir dos valores contrastantes 
	 * do número de cômodos, área construida, piscina e o valor do aluguel ou venda. 
	 * Logo, caso o imovel tenha muitos comodos, piscina e etc e seu valor for baixo, mais fácil sera a compra ou o aluguel
	 * Para APARTAMENTOS, o valor do indice tera um multiplicador (1x) para se diferenciar dos demais imoveis
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2 && alug_venda == 1)
			indice = (((quartos + suite + piscina + area) - valor_aluguel)*(-1)); 
		else if(status != 2 && alug_venda == 2)
			indice = (((quartos + suite + piscina + area) - valor_venda) / 1000);  
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
	 * @param portaria == 1 -> Hï¿½ portaria / portaria == 2 -> Nï¿½o hï¿½ portaria 
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
