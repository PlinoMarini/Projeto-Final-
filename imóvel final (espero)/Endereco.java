
public class Endereco {
	private String rua; 
	private String bairro; 
	private String cidade; 
	private int cep; 
	private String complemento;
	
	public Endereco(String rua, String bairro, String cidade, int cep, String complemento) {
		setRua(rua); 
		setBairro(bairro); 
		setCidade(cidade); 
		setCep(cep);
		setComplemento(complemento); 
	}// --------------- Construtor --------------- //

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if(rua.length() <= 0)
			this.rua = "Rua inválida!";
		else
			this.rua = rua; 
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if(bairro.length() > 0)
			this.bairro = bairro;
		else 
			this.bairro = "Bairro inválido!"; 
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.length() > 0)
			this.cidade = cidade;
		else
			this.cidade = "Cidade inválida!"; 
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		if(cep <= 0 || cep > 8)
			this.cep = 0;
		else 
			this.cep = cep; 
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if(complemento.length() < 0)
			this.complemento = "Complemento inválido!";
		else 
			this.complemento = complemento; 
	}
	
	
}//------------- end Endereço ---------------//
