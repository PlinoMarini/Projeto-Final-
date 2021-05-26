
public class Terreno2 extends Imovel2 {
	private double largura; 
	private double comprimento; 
	
	public Terreno2(ClienteProprietario cp, double largura, double comprimento) {
		super(cp);
		setLargura(largura);
		setComprimento(comprimento);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(status != 2 && largura > 0.0) {
			this.largura = largura;
		}
		else
			this.largura = 0.0; 
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento > 0 && status != 2) {
			this.comprimento = comprimento;
		}
		else
			this.comprimento = 0.0; 
	}

	@Override
	/**
	 * O índice e calculado a partir do tamanho (LARGURA E COMPRIMENTRO) do terreno em contraste com o valor do terreno. 
	 * Sendo assim, quanto menor o valor de venda em comparacao com o tamanho do terreno melhor para a venda do mesmo. 
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2) {
			indice = ((comprimento + largura) - valor_venda) / 1000; 
		}		
	}

}//-------------------end--------------------//
