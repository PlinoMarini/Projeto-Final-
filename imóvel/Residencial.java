
public class Residencial extends Imovel {
	private int quartos; 
	private int suite;
	private int sala_estar; 
	private int sala_jantar; 
	private int vagas_garagem; 
	private int armarios; 
	private String descricao; 
	 
	
	public Residencial(String id, int status, String alug_venda, double valor_sugerido_venda, double valor_sugerido_aluguel,
			double valor_aluguel, double valor_venda, double valor_imobiliaria, String data_anuncio,
			String data_construcao, double area, int quartos, int suite, int sala_estar, int sala_jantar, int vagas_garagem, int armarios, String descricao) {
		super(id, status, alug_venda, valor_sugerido_venda, valor_sugerido_aluguel, valor_aluguel, valor_venda,
				valor_imobiliaria, data_anuncio, data_construcao, area);
		/*this.quartos = quartos;
		this.suite = suite;
		this.sala_estar = sala_estar;
		this.sala_jantar = sala_jantar;
		this.vagas_garagem = vagas_garagem;
		this.armarios = armarios;
		this.descricao = descricao;
		this.andar = andar;
		this.portaria = portaria;
		*/
		setQuartos(quartos); 
		setSuite(suite);
		setSala_estar(sala_estar); 
		setSala_jantar(sala_jantar); 
		setVagas_garagem(vagas_garagem); 
	}

	public int getQuartos() {
		return quartos;
	}
	
	//Documentação setQuartos: 
	//Função: inicia ou altera o número de quartos de um imóvel
	//	0 = Erro!
	public void setQuartos(int quartos) {
		if(quartos > 0)
			this.quartos = quartos;
		else 
			this.quartos = 0; 
	}

	public int getSuite() {
		return suite;
	}
	
	//Documentação setSuite: 
	//Função: inicia ou altera o número de suítes de um imóvel
	//	0 = Erro!
	public void setSuite(int suite) {
		if(suite > 0)
			this.suite = suite;
		else 
			this.suite = 0; 
	}

	public int getSala_estar() {
		return sala_estar;
	}

	//Documentação setSala_estar: 
	//Função: inicia ou altera o número de salas de estar de um imóvel
	//	0 = Erro!
	public void setSala_estar(int sala_estar) {
		if(sala_estar > 0)
			this.sala_estar = sala_estar;
		else 
			this.sala_estar = 0;
	}

	public int getSala_jantar() {
		return sala_jantar;
	}
	
	//Documentação setSala_jantar: 
	//Função: inicia ou altera o número de salas de jantar de um imóvel
	//	0 = Erro!
	public void setSala_jantar(int sala_jantar) {
		if(sala_jantar > 0)
			this.sala_jantar = sala_jantar;
		else
			this.sala_jantar = 0; 
	}

	public int getVagas_garagem() {
		return vagas_garagem;
	}
	//Documentação setVagas_garagem: 
	//Função: inicia ou altera o número de vagas na garagem
	//	0 = Erro!
	public void setVagas_garagem(int vagas_garagem) {
		if(vagas_garagem > 0)
			this.vagas_garagem = vagas_garagem;
		else
			this.vagas_garagem = 0; 
	}

	public int getArmarios() {
		return armarios;
	}
	//Documentação setArmarios: 
	//Função: inicia ou altera o número de armários
	//	0 = Erro!
	public void setArmarios(int armarios) {
		if(armarios < 0)
			this.armarios = 0;
		else
			this.armarios = armarios; 
	}

	public String getDescricao() {
		
		return descricao;
	}

	//Documentação setDescricao: 
	//Função: Escreve a descrição do imóvel residencial
	//	 = Erro!
	public void setDescricao(String descricao) {
		if(descricao.length() <= 0)
			this.descricao = null;
		else
			this.descricao = descricao; 
	}

}
