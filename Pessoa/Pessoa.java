
public class Pessoa {
    private String nome; 
    private String cpf; 
    private String sexo; 
    private String email; 
    private String telefone;

    public Pessoa(String nome, String cpf, String sexo, String email, String telefone) {
       /* this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        */
        setNome(nome); 
        setCpf(cpf); 
        setSexo(sexo);
        setEmail(email);
        setTelefone(telefone);

    }// Constructor 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0)
            this.nome = nome;
        else
            this.nome = "";
    }

    //127.869.988-10
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
    	int d[] = new int[13];
    	
    	
    	int j = 0;
		// Converte todos os chars de CPF para inteiros no array d, cada posição sendo um dígito do CPF
    	for(int i = 1; (i < 13 &&  j  < 14); i++, j++) {
    		if(cpf.charAt(j) >= 48 && cpf.charAt(j) <= 57) {
    			d[i] = Character.getNumericValue(cpf.charAt(j));
    		}
    		else {
    			i--;
    		}
    	}
    	
    	
    	
    	
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == "m" || sexo == "f")
            this.sexo = sexo;
        else
            this.sexo = "NÃ£o desejo informar!";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    //34988588461
    public void setTelefone(String telefone) {
        if(telefone.length() < 11 || telefone.length() > 11)
            this.telefone = "";
        else
            this.telefone = telefone; 
    }

    

     
}//end Pessoa
