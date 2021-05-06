
public class Imovel {
	private String id; 
	protected byte status;
	protected String alug_venda;  
	protected double valor_aluguel;
	private double valor_venda; 
	private double valor_imobiliaria;
	private String data_anuncio; 
	protected String data_construcao;
	private double area; 
	private Endereco end; 
	
	public Imovel(String id,  byte status, String alug_venda, 
					double valor_aluguel, double valor_venda, 
					String data_anuncio,String data_construcao, double area, Endereco end) 
	{
		setStatus(status);
		setAlug_venda(alug_venda); 
		setValor_aluguel(valor_aluguel);
		setValor_venda(valor_venda);
		setId(id); 
		setArea(area); 
		setData_anuncio(data_anuncio); 
		setData_construcao(data_construcao); 
		this.end = end; 
	}// --------------- Construtor ---------------- // 

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id apenas recebe id se a String tiver mais de 0 elementos
	 */
	public boolean setId(String id) {
		if(id.length() > 0) {
			this.id = id; return true; 
		}
		else
			return false; 
		
	}

	/**
	 * @return the status
	 */
	public byte getStatus() {
		return status;
	}

	/**
	 * @param status é iniciado apenas se os valores inseridos forem 1,2 ou 3. 
	 * 1 = status Ativo(o imóvel está disponível para venda ou locação)
	 * 2 = status Inativo(o imóvel foi retirado)
	 * 3 = status em Uso (o imóvel foi vendido ou alugado)
	 */
	public boolean setStatus(byte status) {
		if(status == 1 || status == 2 || status == 3) {
			this.status = status;
			return true; 
		}
		else 
			return false;
	}

	/**
	 * @return the alug_venda
	 */
	public String getAlug_venda() {
		return alug_venda;
	}

	/**
	 * @param alug_venda apenas retorna true se os valores iniciados forem "aluguel" ou "venda".
	 * Caso contrário, retornará falso!
	 */
	public boolean setAlug_venda(String alug_venda) {
		alug_venda.toLowerCase();
		if(alug_venda == "aluguel" || alug_venda == "venda" && status != 2) {
			this.alug_venda = alug_venda;
			return true; 
		}
		else 
			this.alug_venda = "Erro de digitação ou Imóvel desativado!"; 
			return false;
	}

	/**
	 * @return the valor_aluguel
	 */
	public double getValor_aluguel() {
		return valor_aluguel;
	}

	/**
	 * @param valor_aluguel apenas recebe o valor se o status for diferente de inativo(3), se o imóvel for para alugar e se o valor for maior que 0
	 */
	public boolean setValor_aluguel(double valor_aluguel) {
		if(valor_aluguel > 0 && status != 2 && alug_venda == "alug") {
			this.valor_aluguel = valor_aluguel;
			return true;
		}
		else
			this.valor_aluguel = 0.0; 
			return false; 
	}

	/**
	 * @return the valor_venda
	 */
	public double getValor_venda() {
		return valor_venda;
	}

	/**
	 * @param valor_venda apenas recebe o valor se o status for diferente de inativo(3), se o imóvel for destinado à venda e se o valor for maior que 0
	 */
	public boolean setValor_venda(double valor_venda) {
		if(valor_venda > 0 && status != 2 && alug_venda == "venda") {
			this.valor_venda = valor_venda;
			return true; 
		}
		else
			this.valor_venda = 0.0;
			return false;
	}


	/**
	 * @param valor_imobiliaria recebe 8% do valor do aluguel e 6% do valor da venda.
	 */
	public double setValor_imobiliaria() {
		if(status != 2 && alug_venda == "aluguel") {
			valor_imobiliaria = 0.08 * valor_aluguel;
			return valor_imobiliaria; 
		}
		else if(status != 2 && alug_venda == "venda") {
			valor_imobiliaria = 0.06 * valor_venda;  
			return valor_imobiliaria;
		}
		else 
			return 0.0; 
	}

	/**
	 * @return the data_anuncio
	 */
	public String getData_anuncio() {
		return data_anuncio;
	}

	/**
	 * @param data_anuncio the data_anuncio to set
	 */
	public void setData_anuncio(String data_anuncio) {
		if(status != 2) this.data_anuncio = data_anuncio;
		else this.data_anuncio = "Imóvel inativo!";
	}

	/**
	 * @return the data_construcao
	 */
	public String getData_construcao() {
		return data_construcao;
	}

	/**
	 * @param data_construcao the data_construcao to set
	 */
	public void setData_construcao(String data_construcao) {
		if(status != 2) this.data_construcao = data_construcao;
		else this.data_construcao = "Imóvel inativo!"; 
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		if(area > 0 && status != 2)
			this.area = area;
		else 
			this.area = 0.0; 
	}

	/**
	 * @return the end
	 */
	public Endereco getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Endereco end) {
		if(status != 2) this.end = end;
		else this.end = null; 
	}

	
	
}//end Imovel
