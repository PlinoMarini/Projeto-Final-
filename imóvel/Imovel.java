
public class Imovel {
	private String id; 
	private int status;
	private String alug_venda; 
	private double valor_sugerido_venda; 
	private double valor_sugerido_aluguel; 
	private double valor_aluguel;
	private double valor_venda; 
	private double valor_imobiliaria;
	private String data_anuncio; 
	private String data_construcao;
	private double area; 
	
	public Imovel(String id, int status, String alug_venda, double valor_sugerido_venda, double valor_sugerido_aluguel,
			double valor_aluguel, double valor_venda, double valor_imobiliaria, String data_anuncio,
			String data_construcao, double area) {
		super();
		/*this.id = id;
		this.status = status;
		this.alug_venda = alug_venda;
		this.valor_sugerido_venda = valor_sugerido_venda;
		this.valor_sugerido_aluguel = valor_sugerido_aluguel;
		this.valor_aluguel = valor_aluguel;
		this.valor_venda = valor_venda;
		this.valor_imobiliaria = valor_imobiliaria;
		this.data_anuncio = data_anuncio;
		this.data_construcao = data_construcao;
		*/
		setStatus(status);
		setAlug_venda(alug_venda);
		setValor_sugerido_venda(valor_sugerido_venda);
		setValor_sugerido_aluguel(valor_sugerido_aluguel);
		setValor_imobiliaria(valor_imobiliaria);
		setValor_aluguel(valor_aluguel);
		setValor_venda(valor_venda);
		setId(id); 
		setArea(area); 
	}//Constructor

	public String getId() {
		return id;
	}
	//Documenta��o setId: 
	//Fun��o: inicia ou altera o id do im�vel 
	//	(Caso o tamamho da string for menor que zero, um erro ser� armazenado)
	public void setId(String id) {
		if(id.length() < 0)
			this.id = "erro!"; 
		else
			this.id = id; 
			
	}

	public int getStatus() {
		return status;
	}

	//Documenta��o setStatus:
	//Fun��o: inicia ou altera o valor de status; 
	//	se status == 1: Im�vel Ativo; 
	//	se status == 2: Im�vel Inativo; 
	//	se status == 3: Im�vel em uso(alugado); 
	//	se status == 0: erro!
	public void setStatus(int status) {
		if(status == 1 || status == 2 || status == 3)
			this.status = status;
		else
			this.status = 0; 
	}

	public String getAlug_venda() {
		return alug_venda;
	}
	
	//Documenta��o setAlug_venda: 
	//Fun��o: inicia ou altera se o im�vel cadastrado � para alugar ou vender;
	//	apenas ser� v�lida a fun��o, se os valor da String alug_venda for "aluguel" ou "venda";
	public void setAlug_venda(String alug_venda) {
		alug_venda.toLowerCase();
		if(alug_venda != "aluguel" || alug_venda != "venda") {
			this.alug_venda = "Erro!"; 
		}
		else
			this.alug_venda = alug_venda;
	}

	public double getValor_sugerido_venda() {
		return valor_sugerido_venda;
	}
	
	//Documenta��o setValor_sugerido_venda:
	//Fun��o: inicia ou altera o valor sugerido para a compra do im�vel;
	//	(Apenas se o im�vel for destinado � venda);
	public void setValor_sugerido_venda(double valor_sugerido_venda) {
		if(valor_sugerido_venda >= 0 && alug_venda == "venda")
			this.valor_sugerido_venda = valor_sugerido_venda;
		else
			this.valor_sugerido_venda = 0.0; 
	}

	public double getValor_sugerido_aluguel() {
		return valor_sugerido_aluguel;
	}

	//Documenta��o setValor_sugerido_aluguel:
	//Fun��o: inicia ou altera o valor sugerido para o aluguel do im�vel;
	//	(Apenas se o im�vel for destinado � loca��o);
	public void setValor_sugerido_aluguel(double valor_sugerido_aluguel) {
		if(valor_sugerido_aluguel >= 0 && alug_venda == "aluguel")
			this.valor_sugerido_aluguel = valor_sugerido_aluguel;
		else
			this.valor_sugerido_aluguel = 0.0; 
	}

	public double getValor_aluguel() {
		return valor_aluguel;
	}

	//Documenta��o setValor_aluguel:
	//Fun��o: inicia ou altera o valor final para o aluguel do im�vel;
	//	(Apenas se o im�vel for destinado � loca��o e estiver ativo);
	public void setValor_aluguel(double valor_aluguel) {
		if(valor_aluguel >= 0 && status == 1 && alug_venda == "aluguel")
			this.valor_aluguel = valor_aluguel;
		else
			this.valor_aluguel = 0.0; 
	}

	public double getValor_venda() {
		return valor_venda;
	}
	//Documenta��o setValor_venda:
	//Fun��o: inicia ou altera o valor final para a compra do im�vel;
	//	(Apenas se o im�vel for destinado � venda e estiver ativo);
	public void setValor_venda(double valor_venda) {
		if(valor_venda >= 0 && status == 1 && alug_venda == "venda")
			this.valor_venda = valor_venda;
		else
			this.valor_venda = 0.0; 
	}

	public double getValor_imobiliaria() {
		return valor_imobiliaria;
	}
	
	//Documenta��o setValor_imobiliaria:
	//Fun��o: inicia ou altera o valor da comiss�o da imobili�ria
	//	(Em caso de venda, a comiss�o � de 6% sobre o valor do im�vel, para loca��o o valor � de 8%)
	public void setValor_imobiliaria(double valor_imobiliaria) {
		if(alug_venda == "venda" && valor_imobiliaria >= 0)	
			this.valor_imobiliaria = 0.06 * valor_venda;
		else if(alug_venda == "aluguel" && valor_imobiliaria >= 0)
			this.valor_imobiliaria = 0.08 * valor_aluguel; 
		else
			this.valor_imobiliaria = 0.0; 
	}

	public String getData_anuncio() {
		return data_anuncio;
	}

	public void setData_anuncio(String data_anuncio) {
		this.data_anuncio = data_anuncio;
	}

	public String getData_construcao() {
		return data_construcao;
	}

	public void setData_construcao(String data_construcao) {
		this.data_construcao = data_construcao;
	}
	
	public double getArea() {
		return area; 
	}
	
	public void setArea(double area) {
		if(area > 0)
			this.area = area; 
		else
			this.area = 0.0; 
	}
	public Endere�o end;
	
	
}//end Imovel
