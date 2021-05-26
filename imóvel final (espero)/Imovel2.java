
public abstract class Imovel2{
	private String id; 
	protected byte status;
	protected byte alug_venda;  
	protected double valor_aluguel;
	protected double valor_venda; 
	private String data_anuncio; 
	protected double area;
	protected double indice; 
	private Endereco end; 
	private ClienteProprietario cp; 
	
	
	public Imovel2(ClienteProprietario cp) {
		this.cp = cp;
	}
	public Imovel2() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id.length() > 0) {
			this.id = id;
		}
		else 
			this.id = "Valor invalido!"; 
	}
	public byte getStatus() {
		return status;
	}
	
	/**
	 * 
	 * @param status == 1 -> imovel disponivel / status == 2 -> im�vel indsipon�vel / status == 3 -> im�vel vendido ou alugado
	 * @return false se valor diferente de (1,2 ou 3) / true se for igual
	 */
	public boolean setStatus(byte status) {
		if (status == 1 || status == 2 || status == 3) {
			this.status = status;
			return true; 
		}
		else {
			return false; 
		}
	}
	public byte getAlug_venda() {
		return alug_venda;
	}
	
	/**
	 * 
	 * @param alug_venda == 1 -> imovel para aluguel / alug_venda == 2 -> imovel para venda
	 * @return false se valor for diferente de (1 ou 2) / true se o valor for igual 
	 */
	public boolean setAlug_venda(byte alug_venda) {
		if((alug_venda == 1 || alug_venda == 2 ) && status != 2) {
			this.alug_venda = alug_venda;
			return true; 
		}
		else 
			return false; 
	}
	
	public double getValor_aluguel() {
		return valor_aluguel;
	}
	
	/**
	 * Para que o valor seja alterado ou inicado o im�vel deve ser voltado para aluguel e estar dispon�vel
	 */
	public void setValor_aluguel(double valor_aluguel) {
		if(status != 2 && alug_venda == 1 && valor_aluguel > 0 ) {
			this.valor_aluguel = valor_aluguel;
		}
		else 
			this.valor_aluguel = 0.0; 
	}
	
	public double getValor_venda() {
		return valor_venda;
	}
	
	
	public void setValor_venda(double valor_venda) {
		if(status != 2 && alug_venda == 2 && valor_venda > 0) {
			this.valor_venda = valor_venda;
		}
		else 
			this.valor_venda = 0.0; 
	}
	
	
	public String getData_anuncio() {
		return data_anuncio;
	}
	
	public void setData_anuncio(String data_anuncio) {
		this.data_anuncio = data_anuncio;
	}
	
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		if(status != 2 && area > 0.0) {
			this.area = area;
		}
		else 
			this.area = 0.0; 
	} 
	
	/**
	 * Se o imovel for destinado a venda, o valor deve representar 6% do valor da venda. Caso o imovel seja
	 * para aluguel, o valor deve ser 8% do valor de aluguel.
	 * @return o valor total a ser recebido pela imobili�ria 
	 */
	public double valor_imobiliaria() {
		if(status != 2 && alug_venda == 1 && valor_aluguel > 0) {
			return valor_aluguel * 0.8;  
		}
		else if (status != 2 && alug_venda == 2 && valor_venda > 0 ) {
			return valor_venda * 0.6; 
		}
		else
			return 0; 
	}
	

	public abstract void calculaIndiceVendaLocacao();
	
	public Endereco getEnd() {
		return end;
	}
	
	public void setEnd(Endereco end) {
		this.end = end;
	} 
	
	public ClienteProprietario getCp(){
		return cp; 
	}

	public void setCp(ClienteProprietario cp){
		this.cp = cp; 
	}
	
}//-------------end---------------// 
