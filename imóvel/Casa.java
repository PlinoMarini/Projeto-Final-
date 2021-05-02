
public class Casa extends Residencial  {
	
	private char piscina; 
	
	public Casa(String id, int status, String alug_venda, double valor_sugerido_venda, double valor_sugerido_aluguel,
			double valor_aluguel, double valor_venda, double valor_imobiliaria, String data_anuncio,
			String data_construcao,double area, int quartos, int suite, int sala_estar, int sala_jantar, int vagas_garagem,
			int armarios, String descricao) {
		super(id, status, alug_venda, valor_sugerido_venda, valor_sugerido_aluguel, valor_aluguel, valor_venda,
				valor_imobiliaria, data_anuncio, data_construcao,area, quartos, suite, sala_estar, sala_jantar, vagas_garagem,
				armarios, descricao);
		setPiscina(piscina); 

	}//Constructor

	public char getPiscina() {
		return piscina;
	}

	public void setPiscina(char piscina) {
		if(piscina == 's' || piscina == 'S')
			this.piscina = piscina;
		else 
			this.piscina = 'n'; 
	}
	
	

}
