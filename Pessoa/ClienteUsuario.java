
public class ClienteUsuario extends Cliente {
	private String nomeFiador;
	private String cpfFiador;
	
	public ClienteUsuario(String nome, String cpf, String sexo, String email, String telefone, char estadoCivil,
			String profissao, String nomeFiador, String cpfFiador) {
		super(nome, cpf, sexo, email, telefone, estadoCivil, profissao);
		this.nomeFiador = nomeFiador;
		this.cpfFiador = cpfFiador;
	}

	public String getNomeFiador() {
		return nomeFiador;
	}

	public boolean setNomeFiador(String nomeFiador) {
		if(nomeFiador.length() > 0) {
			this.nomeFiador = nomeFiador;
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getCpfFiador() {
		return cpfFiador;
	}

	public boolean setCpfFiador(String cpfFiador) {
		if(Pessoa.verificaCpf(cpfFiador)) {
			this.cpfFiador = cpfFiador;
			return true;
		}
		else
			return false;
	}
	
}
