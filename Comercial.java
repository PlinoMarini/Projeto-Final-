
public class Comercial extends Imovel {
	
	private int comodos; 
	private int banheiros; 
	
	public Comercial(String id, int status, String alug_venda, double valor_sugerido_venda,
			double valor_sugerido_aluguel, double valor_aluguel, double valor_venda, double valor_imobiliaria,
			String data_anuncio, String data_construcao,double area, int comodos, int banheiros) {
		super(id, status, alug_venda, valor_sugerido_venda, valor_sugerido_aluguel, valor_aluguel, valor_venda,
				valor_imobiliaria, data_anuncio, data_construcao, area);
		setComodos(comodos);  
		setBanheiros(banheiros); 
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		if(comodos > 0)
			this.comodos = comodos;
		else 
			this.comodos = 0; 
	}

	public int getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(int banheiros) {
		if(banheiros > 0)
			this.banheiros = banheiros;
		else 
			this.banheiros = 0; 
	}
	
	
}//end Imovel 
