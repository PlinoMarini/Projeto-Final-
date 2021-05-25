
public class Transacao {
	private double valor;
	private String dataTransacao;
	private static int nroContrato;
	private Imovel imov;
	private ClienteUsuario usuario;
	
	public Transacao(Imovel imov, ClienteUsuario usuario, double valor, String dataTransacao, int nroContrato) {	
		setValor(valor);
		setDataTransacao(dataTransacao);
		setNroContrato(nroContrato);
		this.imov = imov;
		this.usuario = usuario;
	}
	
	public Imovel getImov() {
		return imov;
	}

	public void setImov(Imovel imov) {
		this.imov = imov;
	}

	public ClienteUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(ClienteUsuario usuario) {
		this.usuario = usuario;
	}

	public double getValor() {
		return valor;
	}

	public String getDataTransacao() {
		return dataTransacao;
	}

	public int getNroContrato() {
		return nroContrato;
	}

	//rever
	private boolean setDataTransacao(String dataTransacao) {
		if(dataTransacao.length() == 10) {
			this.dataTransacao = dataTransacao;	
			return true;
    	}
    	else
    		return false;
	}

	private void setNroContrato(int nroContrato) {	
		if(nroContrato > 0) 		
			nroContrato++ ;
	}

	private boolean setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
			return true;
		}
		else
			this.valor = 0.0; 
			return false; 
	}

	public boolean efetuarTransacao(Corretor c){
		if(imov.getStatus() == 1 && imov.getAlug_venda().equals("aluguel")) {
			c.aumentaVendasMes(imov.getValor_aluguel());
			imov.setStatus((byte) 3);
			this.valor = imov.getValor_aluguel();  
			return true;
		}
		else if(imov.getStatus() == 1 && imov.getAlug_venda().equals("venda")) {
			c.aumentaVendasMes(imov.getValor_venda());
			imov.setStatus((byte) 3);
			this.valor = imov.getValor_venda();  
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Transacao{" +
				", valor = '" + valor + '\'' +
				", dataTransacao = " + dataTransacao +
				", nroContrato = " + nroContrato +
				", imov = " + imov +
				", usuario = " + usuario +
				'}';		
	}
}
