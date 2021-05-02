
public class Pessoa {
    private String nome; 
    private String cpf; 
    private String sexo; 
    private String email; 
    private int telefone;

    public Pessoa(String nome, String cpf, String sexo, String email, int telefone) {
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
            this.nome = 0;
    }

    //127.869.988-10
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() < 14 || cpf.length() > 14)
            this.cpf = 0;
        else
            this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == "m" || sexo == "f")
            this.sexo = sexo;
        else
            this.sexo = "Não desejo informar!";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    //34988588461
    public void setTelefone(int telefone) {
        if(telefone < 11 || telefone > 11)
            this.telefone = 0;
        else
            this.telefone = telefone; 
    }

    

     
}//end Pessoa
