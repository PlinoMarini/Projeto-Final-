import java.io.Serializable;
public class Terreno2 extends Imovel2 {
	private double largura; 
	private double comprimento; 
	
	public Terreno2(double largura, double comprimento) {
		super();
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
	public void calculaIndiceVendaLocacao() {
		if(status != 2) {
			indice = ((comprimento + largura) - valor_venda)/1000*0.6; 
		}		
	}

}//-------------------end--------------------//
