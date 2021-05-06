
public class Cliente extends Pessoa {
	private char estadoCivil;
	private String profissao;
	

	public Cliente(String nome, String cpf, String sexo, String email, String telefone, char estadoCivil,
			String profissao) {
		super(nome, cpf, sexo, email, telefone);
		setEstadoCivil(estadoCivil);
		setProfissao(profissao);
	}

	
	
	@Override
	public String toString() {
		return "Cliente [estadoCivil=" + estadoCivil + ", profissao=" + profissao + ", getNome()=" + getNome()
				+ ", getCpf()=" + getCpf() + ", getSexo()=" + getSexo() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + "]";
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public boolean setEstadoCivil(char estadoCivil) {
		if((estadoCivil >= 65 && estadoCivil <= 90) || (estadoCivil >= 97 && estadoCivil <= 122)) {
			this.estadoCivil = estadoCivil;
			return true;
		}
		else {
			this.estadoCivil = 'u';
			return false;
		}
	}

	public String getProfissao() {
		return profissao;
	}



	public boolean setProfissao(String profissao) {
		if(profissao.length() > 0) {
			this.profissao = profissao;
			return true;
		}
		else {
			this.profissao = "undefined";
			return false;
		}
	}
	
	
	
}
