
public class Residencial extends Imovel {
	
	private int quartos; 
	private int banheiros; 
	private int suite;
	private int sala_estar; 
	private int sala_jantar; 
	private int vagas_garagem; 
	private int armarios; 
	private String descricao; 
	private char piscina; 
	
	public Residencial(String id, byte status, String alug_venda, 
			double valor_aluguel, double valor_venda, String data_anuncio, 
			String data_construcao, double area, Endereco end, 
			int quartos, int banheiros, int suite, int sala_estar, 
			int sala_jantar, int vagas_garagem, int armarios, 
			String descricao, char piscina) 
	{
		super(id, status, alug_venda, valor_aluguel, valor_venda, data_anuncio, data_construcao, area, end);
		setQuartos(quartos);
		setBanheiros(banheiros); 
		setSuite(suite); 
		setSala_estar(sala_estar);
		setSala_jantar(sala_jantar); 
		setVagas_garagem(vagas_garagem);
		setArmarios(armarios); 
		setDescricao(descricao); 
		setPiscina(piscina); 
	}// ----------- Construtor ------------- //

	/**
	 * @return the quartos
	 */
	public int getQuartos() {
		return quartos;
	}
	
	/**
	 * @return the banheiros
	 */
	public int getBanheiros() {
		return banheiros;
	}

	/**
	 * @return the suite
	 */
	public int getSuite() {
		return suite;
	}

	/**
	 * @return the sala_estar
	 */
	public int getSala_estar() {
		return sala_estar;
	}

	/**
	 * @return the sala_jantar
	 */
	public int getSala_jantar() {
		return sala_jantar;
	}

	/**
	 * @return the vagas_garagem
	 */
	public int getVagas_garagem() {
		return vagas_garagem;
	}

	/**
	 * @return the armarios
	 */
	public int getArmarios() {
		return armarios;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @return the piscina
	 */
	public char getPiscina() {
		return piscina;
	}

	
// --------------- Setters ------------------ //
	
	/**
	 * @param quartos the quartos to set
	 */
	public void setQuartos(int quartos) {
		if(quartos > 0 && status != 2) this.quartos = quartos;
		else this.quartos = 0; 
	}

	
	/**
	 * @param 
	 */
	public void setBanheiros(int banheiros) {
		if(banheiros > 0 && status != 2) this.banheiros = banheiros; 
		else this.banheiros = 0; 
	}
	
	/**
	 * @param suite the suite to set
	 */
	public void setSuite(int suite) {
		if(suite> 0 && status != 2) this.suite = suite;
		else this.suite = 0; 
	}

	/**
	 * @param sala_estar the sala_estar to set
	 */
	public void setSala_estar(int sala_estar) {
		if(sala_estar > 0 && status != 2) this.sala_estar = sala_estar;
		else this.sala_estar = 0; 
	}

	/**
	 * @param sala_jantar the sala_jantar to set
	 */
	public void setSala_jantar(int sala_jantar) {
		if(sala_jantar > 0 && status != 2) this.sala_jantar = sala_jantar;
		else this.sala_jantar = 0; 
	}

	/**
	 * @param vagas_garagem the vagas_garagem to set
	 */
	public void setVagas_garagem(int vagas_garagem) {
		if(vagas_garagem > 0 && status != 2)
			this.vagas_garagem = vagas_garagem;
	}

	/**
	 * @param armarios the armarios to set
	 */
	public void setArmarios(int armarios) {
		if(armarios > 0 && status != 2)
			this.armarios = armarios;
		else
			this.armarios = 0; 
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		if(status != 2) this.descricao = descricao;
		else this.descricao = "Imovel desativado!"; 
	}

	/**
	 * @param piscina the piscina to set
	 */
	public void setPiscina(char piscina) {
		if(status != 2 && piscina == 's' || piscina == 'S') this.piscina = piscina;
		else this.piscina = 'n'; 
	}
		
}// ---------- end Residencial ----------- // 
	 
	
