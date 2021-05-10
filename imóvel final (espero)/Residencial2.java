/**
 * 
 */

/**
 * @author plini
 *
 */
public abstract class Residencial2 extends Imovel2 {
	protected int quartos; 
	private int banheiros; 
	protected int suite;
	private int sala_estar; 
	private int sala_jantar; 
	private int vagas_garagem; 
	private int armarios; 
	private String descricao; 
	protected byte piscina;
	
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		if(status != 2 && quartos > 0) {
			this.quartos = quartos;
		}
		else 
			this.quartos = 0; 
	}
	
	public int getBanheiros() {
		return banheiros;
	}
	
	public void setBanheiros(int banheiros) {
		if(banheiros > 0 && status != 2) {
			this.banheiros = banheiros;
		}
		else
			this.banheiros = 0; 
	}
	
	public int getSuite() {
		return suite;
	}
	
	public void setSuite(int suite) {
		if(status != 2 && suite > 0) {
			this.suite = suite;
		}
		else 
			this.suite = 0; 
	}
	
	public int getSala_estar() {
		return sala_estar;
	}
	public void setSala_estar(int sala_estar) {
		if(status != 2 && sala_estar > 0) {
			this.sala_estar = sala_estar;
		}
		else 
			this.sala_estar = 0; 
	}
	public int getSala_jantar() {
		return sala_jantar;
	}
	public void setSala_jantar(int sala_jantar) {
		if(status != 2 && sala_jantar > 0) {
			this.sala_jantar = sala_jantar;
		}
		else 
			this.sala_jantar = 0; 
	}
	public int getVagas_garagem() {
		return vagas_garagem;
	}
	public void setVagas_garagem(int vagas_garagem) {
		if(vagas_garagem > 0 && status != 2) {
			this.vagas_garagem = vagas_garagem;
		}
		else
			this.vagas_garagem = 0; 
	}
	public int getArmarios() {
		return armarios;
	}
	public void setArmarios(int armarios) {
		if(status != 2 && armarios > 0) {
			this.armarios = armarios;
		}
		else 
			this.armarios = 0; 
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length() > 0 && status != 2) {
			this.descricao = descricao;
		}
		else
			this.descricao = "Inválido!"; 
	}
	
	public byte getPiscina() {
		return piscina;
	}
	
	/**
	 * 
	 * @param piscina == 1 -> Há piscinas / piscina == 2 -> Não há piscina 
	 */
	public void setPiscina(byte piscina) {
		if((piscina == 1 || piscina == 2) && status != 2) {
			this.piscina = piscina;
		}
		else 
			this.piscina = 0; 
	}
	
	
}//----------------end----------------//
