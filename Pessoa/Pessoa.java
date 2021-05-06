
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

    public boolean setCpf(String cpf) {
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
    	
    	int l = 0;
    	
    	j = 10;
    	// Faz o calculo L = 10*d1 + 9*d2... 2*d9;
    	for(int i = 1; i <= 9; i++, j--) {
    		l += j*d[i];
    	}
    	
    	int resto = l % 11;
    	
    	if(resto == 0 || resto == 1) {
    		if(d[10] != 0) {
    			return false; // não é um CPF válido
    		}
    	}
    	else {
    		if(d[10] != 11 - resto) {
    			return false;
    		}
    	}
    	// caso chegou até aqui, passou no teste do primeiro digito verificador
    	
    	// Agora, será feito o teste para o segundo dígito verificador
    	
    	j = 10;
    	l = 0;
    	
    	// Faz o calculo L = 10*d2 + 9*d2... 2*d10;
    	for(int i = 2; i <= 10; i++, j--) {
    		l += j*d[i];
    	}
    	
    	resto = l % 11;
    	
    	if(resto == 0 || resto == 1) {
    		if(d[11] != 0) {
    			return false; // não é um CPF válido
    		}
    	}
    	else {
    		if(d[11] != 11 - resto) {
    			return false;
    		}
    	}
    	return true;
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
