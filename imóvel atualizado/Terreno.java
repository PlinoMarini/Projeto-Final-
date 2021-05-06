
public class Terreno extends Imovel {
	private double largura; 
	private double comprimento; 
	private String aclive_declive;
	
	 
	public Terreno(String id, byte status, String alug_venda, double valor_aluguel, double valor_venda,
			String data_anuncio, String data_construcao, double area, Endereço end, double largura, double comprimento,
			String aclive_declive) 
	{
		super(id, status, alug_venda, valor_aluguel, valor_venda, data_anuncio, data_construcao, area, end);
		setLargura(largura);
		setComprimento(comprimento);
		setAclive_declive(aclive_declive);
		this.alug_venda = "venda"; 
		this.valor_aluguel = 0.0;
		this.data_construcao = "Terreno sem construção"; 
	} // ------------ Construtor ------------//
	
	/**
	 * @return the largura
	 */
	public double getLargura() {
		return largura;
	}
	/**
	 * @return the comprimento
	 */
	public double getComprimento() {
		return comprimento;
	}
	/**
	 * @return the aclive_declive
	 */
	public String getAclive_declive() {
		return aclive_declive;
	}
	/**
	 * @param largura the largura to set
	 */
	public void setLargura(double largura) {
		if(largura > 0.0 && status != 2) this.largura = largura;
		else this.largura = 0.0; 
	}
	/**
	 * @param comprimento the comprimento to set
	 */
	public void setComprimento(double comprimento) {
		if(comprimento > 0.0 && status != 2) this.comprimento = comprimento;
		else this.comprimento = 0.0; 
	}
	/**
	 * @param aclive_declive the aclive_declive to set
	 */
	public void setAclive_declive(String aclive_declive) {
		this.aclive_declive = aclive_declive;
	} 
	
	public void setAlug_vend(String alug_venda) {
		this.alug_venda = "venda"; 
	}
	
	public void setData_construcao(String data_construcao) {
		this.data_construcao = "Apenas Terreno!"; 
	}
	
	public boolean setValor_aluguel(double valor_aluguel) {
		this.valor_aluguel = 0.0; 
		return false; 
	}
	
}// --------- end Terreno ----------// 
