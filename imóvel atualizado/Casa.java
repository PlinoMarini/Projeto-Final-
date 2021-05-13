
public class Casa extends Residencial  {

	public Casa(String id, byte status, String alug_venda, 
			double valor_aluguel, double valor_venda, String data_anuncio, 
			String data_construcao, double area, Endereco end, 
			int quartos, int banheiros, int suite, int sala_estar, 
			int sala_jantar, int vagas_garagem, int armarios, 
			String descricao, char piscina) 
	{
		super(id, status, alug_venda, valor_aluguel, valor_venda, data_anuncio, data_construcao, area, end, quartos, banheiros, suite,
				sala_estar, sala_jantar, vagas_garagem, armarios, descricao, piscina);
		
	}// ------------- Construtor ------------ //
	
	
}// ------------ end Casa -------------//
