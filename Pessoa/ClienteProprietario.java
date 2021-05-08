
public class ClienteProprietario extends Cliente {
	private String dataCadastroImovel;
	
	public ClienteProprietario(String nome, String cpf, String sexo, String email, String telefone, char estadoCivil,
			String profissao, String dataCadastroImovel) {
		super(nome, cpf, sexo, email, telefone, estadoCivil, profissao);
		setDataCadastroImovel(dataCadastroImovel);
	}

	public String getDataCadastroImovel() {
		return dataCadastroImovel;
	}

	public void setDataCadastroImovel(String dataCadastroImovel) {
		this.dataCadastroImovel = dataCadastroImovel;
	}
	
}
