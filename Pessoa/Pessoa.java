import java.io.Serializable;

public class Pessoa implements Serializable{
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

    public boolean setNome(String nome) {
        if(nome.length() > 0) {
        	this.nome = nome;
        	return true;
        }
        else
            return false;
    }

    //127.869.988-10
    public String getCpf() {
        return cpf;
    }
    
    public static boolean verificaCpf(String cpf) {
    	int d[] = new int[12];
    	
    	int j = 0;
		// Converte todos os chars de CPF para inteiros no array d, cada posi��o sendo um d�gito do CPF
    	for(int i = 1; (i < 12 &&  j  < 14); i++, j++) {
    		if(cpf.charAt(j) >= 48 && cpf.charAt(j) <= 57) {
    			d[i] = Character.getNumericValue(cpf.charAt(j));
    		}
    		else {
    			i--;
    		}
    	}
    	
    	// Primeiro, verif�ca se todos os d�gitos s�o iguais, que � um caso de CPF inv�lido, mas que passaria nos outros testes
    	
    	int iguais = 1;
    	
    	for(int i = 2; i < 12; i++) {
    		if(d[i] != d[i-1]) {
    			iguais = 0;
    		}
    	}
    	
    	if(iguais == 1)
    		return false;
    	
    	int l = 0;
    	
    	j = 10;
    	// Faz o calculo L = 10*d1 + 9*d2... 2*d9;
    	for(int i = 1; i <= 9; i++, j--) {
    		l += j*d[i];
    	}
    	
    	int resto = l % 11;
    	
    	if(resto == 0 || resto == 1) {
    		if(d[10] != 0) {
    			return false; // n�o � um CPF v�lido
    		}
    	}
    	else {
    		if(d[10] != 11 - resto) {
    			return false;
    		}
    	}
    	// caso chegou at� aqui, passou no teste do primeiro digito verificador
    	
    	// Agora, ser� feito o teste para o segundo d�gito verificador
    	
    	j = 10;
    	l = 0;
    	
    	// Faz o calculo L = 10*d2 + 9*d2... 2*d10;
    	for(int i = 2; i <= 10; i++, j--) {
    		l += j*d[i];
    	}
    	
    	resto = l % 11;
    	
    	if(resto == 0 || resto == 1) {
    		if(d[11] != 0) {
    			return false; // n�o � um CPF v�lido
    		}
    	}
    	else {
    		if(d[11] != 11 - resto) {
    			return false;
    		}
    	}
    	return true;
    }

    public boolean setCpf(String cpf) {
    	if(verificaCpf(cpf)) {
    		this.cpf = cpf;
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    	
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == "m" || sexo == "f" || sexo == "M" || sexo == "F")
            this.sexo = sexo;
        else
            this.sexo = "N�o desejo informar!";
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
    	if(email.length() > 0) {    		
    		this.email = email;
    		return true;
    	}
    	else
    		return false;
    	
    }

    public String getTelefone() {
        return telefone;
    }

    //34988588461
    public boolean setTelefone(String telefone) {
        if(telefone.length() == 11) {
        	this.telefone = telefone;
        	return true;
        }
        else
        	return false;
    }

}//end Pessoa
