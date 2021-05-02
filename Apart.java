
public class Apart extends Residencial {
	private int andar; 
	private char portaria; 
	private double valor_condominio; 
	
	public Apart(String id, int status, String alug_venda, double valor_sugerido_venda, double valor_sugerido_aluguel,
			double valor_aluguel, double valor_venda, double valor_imobiliaria, String data_anuncio,
			String data_construcao, double area, int quartos, int suite, int sala_estar, int sala_jantar, int vagas_garagem,
	  int armarios, String descricao, int andar, char portaria, double valor_condominio) {
		super(id, status, alug_venda, valor_sugerido_venda, valor_sugerido_aluguel, valor_aluguel, valor_venda,
				valor_imobiliaria, data_anuncio, data_construcao,area, quartos, suite, sala_estar, sala_jantar, vagas_garagem,
			 armarios, descricao);
		setAndar(andar); 
		setPortaria(portaria); 
		setValor_condominio(valor_condominio); 
	}//Constructor

	public int getAndar() {
		return andar;
	}
	
	public double getValor_condominio() {
		return valor_condominio;
	}

	public void setValor_condominio(double valor_condominio) {
		if(valor_condominio > 0)
			this.valor_condominio = valor_condominio;
		else
			this.valor_condominio = 0.0; 
	}

	//Documentação setAndar: 
	//Função: inicia ou altera o andar do apartamento 
	//	0 = Erro!
	public void setAndar(int andar) {
		if(andar < 0 )
			this.andar = 0;
		else 
			this.andar = andar; 
	}

	public char getPortaria() {
		return portaria;
	}
	
	//Documentação setPortaria: 
	//Função: Verifica se o apartamento possui portaria
	//	deve ser inserido um char 's', em caso de sim. Caso não exista, o valor será 0
	public void setPortaria(char portaria) {
		if(portaria == 's' || portaria == 'S')
			this.portaria = portaria;
		else 
			this.portaria = 'n'; 
	}

}
