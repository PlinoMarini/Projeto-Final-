
public class Terreno extends Imovel {
	private double largura; 
	private double comprimento; 
	private String aclive_declive; 
	
	public Terreno(String id, int status, String alug_venda, double valor_sugerido_venda, double valor_sugerido_aluguel,
			double valor_aluguel, double valor_venda, double valor_imobiliaria, String data_anuncio,
			String data_construcao, double area, double largura, double comprimento, String aclive_declive) {
		super(id, status, alug_venda, valor_sugerido_venda, valor_sugerido_aluguel, valor_aluguel, valor_venda,
				valor_imobiliaria, data_anuncio, data_construcao, area);
		setLargura(largura); 
		setComprimento(comprimento); 
		setAclive_declive(aclive_declive); 
	}//Constructor 

	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0)
			this.largura = largura;
		else 
			this.largura = 0.0; 
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento > 0)
			this.comprimento = comprimento;
		else 
			this.comprimento = 0.0;
	}

	public String getAclive_declive() {
		return aclive_declive;
	}

	public void setAclive_declive(String aclive_declive) {
		if(aclive_declive.length() > 0)
			this.aclive_declive = aclive_declive;
		else 
			this.aclive_declive = "Inválido!"; 
	}

}
