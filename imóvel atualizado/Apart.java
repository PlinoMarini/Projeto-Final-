
public class Apart extends Residencial {
	
	private int andar; 
	private char portaria; 
	private double valor_condominio;
	
	
	public Apart(String id, byte status, String alug_venda, 
			double valor_aluguel, double valor_venda, String data_anuncio, 
			String data_construcao, double area, Endereco end, 
			int quartos, int banheiros, int suite, int sala_estar, 
			int sala_jantar, int vagas_garagem, int armarios, 
			String descricao, char piscina, int andar, char portaria, double valor_condominio) 
	{
		super(id, status, alug_venda, valor_aluguel, valor_venda, data_anuncio, data_construcao, area, end, quartos,
				banheiros, suite, sala_estar, sala_jantar, vagas_garagem, armarios, descricao, piscina);
		setAndar(andar);
		setPortaria(portaria);
		setValor_condominio(valor_condominio);
	}// -------------Construtor------------ // 
	
	/**
	 * @return the andar
	 */
	public int getAndar() {
		return andar;
	}
	/**
	 * @return the portaria
	 */
	public char getPortaria() {
		return portaria;
	}
	/**
	 * @return the valor_condominio
	 */
	public double getValor_condominio() {
		return valor_condominio;
	}
	/**
	 * @param andar the andar to set
	 */
	
	// ------------Setters------------ // 
	
	public void setAndar(int andar) {
		if(status != 2) this.andar = andar;
		else this.andar = 0; 
	}
	/**
	 * @param portaria the portaria to set
	 */
	public void setPortaria(char portaria) {
		if(portaria == 's' || portaria == 'S' && status != 2) this.portaria = portaria;
		else portaria = 'n'; 
	}
	/**
	 * @param valor_condominio the valor_condominio to set
	 */
	public void setValor_condominio(double valor_condominio) {
		if(status != 2) this.valor_condominio = valor_condominio;
		else this.valor_condominio = 0.0; 
	} 
	
}// ------------end Apart------------ //