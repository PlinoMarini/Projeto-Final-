
public class Comercial extends Imovel {
	
	private int comodos; 
	private int banheiros;
	
	
	
	public Comercial(String id, byte status, String alug_venda, 
			double valor_aluguel, double valor_venda, String data_anuncio, 
			String data_construcao, double area, Endereco end, 
			int comodos, int banheiros) 
	{
		super(id, status, alug_venda, valor_aluguel, valor_venda, data_anuncio, data_construcao, area, end);
		setComodos(comodos);
		setBanheiros(banheiros);
	}
	/**
	 * @return the comodos
	 */
	public int getComodos() {
		return comodos;
	}
	/**
	 * @return the banheiros
	 */
	public int getBanheiros() {
		return banheiros;
	}
	
	// ------------- Setters -------------//
	
	/**
	 * @param comodos the comodos to set
	 */
	public void setComodos(int comodos) {
		if(status != 2 && comodos > 0) this.comodos = comodos;
		else this.comodos = 0; 
	}
	
	/**
	 * @param banheiros the banheiros to set
	 */
	public void setBanheiros(int banheiros) {
		if(status != 2 && banheiros > 0) this.banheiros = banheiros;
		else this.banheiros = 0; 
	} 
		
}// --------- end Comercial -----------//