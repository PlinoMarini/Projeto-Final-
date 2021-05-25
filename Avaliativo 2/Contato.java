import java.io.Serializable;

public class Contato implements Serializable {
	private String nome; 
	private int idade;
	private char sexo; 
	private String profissao; 
	private String telefone; 
	private String email;

	public Contato(){
		
	}
	
	public Contato(String nome, int idade, char sexo, String profissao, String telefone, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
		this.telefone = telefone;
		this.email = email;
	}//------------Construtor-------------// 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("%s, %d anos de idade, do sexo %c, %s, telefone do n. %s, email: %s", getNome(), getIdade(), getSexo(), getProfissao(), getTelefone(), getEmail()); 
	}
	
}// ---------------------end----------------------//
