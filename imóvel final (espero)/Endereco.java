
public class Endereco {
	private String rua; 
	private String bairro; 
	private String cidade; 
	private String cep; 
	private String complemento;
	
	public Endereco(String rua, String bairro, String cidade, String cep, String complemento) {
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
			this.rua = "Rua inv�lida!";
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
			this.bairro = "Bairro inv�lido!"; 
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if(cidade.length() > 0)
			this.cidade = cidade;
		else
			this.cidade = "Cidade inv�lida!"; 
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if(cep.length() == 8)
			this.cep = cep;
		else 
			this.cep = "Este CEP é inválido"; 
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if(complemento.length() < 0)
			this.complemento = "Complemento inv�lido!";
		else 
			this.complemento = complemento; 
	}
	
	
}//------------- end Endere�o ---------------//
