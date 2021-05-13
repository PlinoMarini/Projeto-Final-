public class Funcionario extends Pessoa{

    private String data_ingresso; 
    private static double salario_base;
    private Usuario user;

    public Funcionario (String nome, String cpf, String sexo, String email, String telefone, String data_ingresso, double salario_base){
	    super(nome, cpf, sexo, email, telefone);
	    setData_ingresso(data_ingresso); 
	    setSalario_base(salario_base); 
    
    }//Constructor
    
    public double calculaSalario() {
    	return salario_base;
    }

    public Usuario getUser() {
		return user;
	}

	public boolean setUser(Usuario user) {
		this.user = new Usuario(user);
		return true;
	}
	
	public boolean setUser(String login, String senha) {
		if(!login.isBlank() && senha.length() >= 8) {
			this.user = new Usuario(login, senha);
			return true;
		}
		else
			return false;
		
	}

	public String getData_ingresso() {
        return data_ingresso;
    }

    //  10/10/21 -> 8 posiÃ§Ãµes de array
    public void setData_ingresso(String data_ingresso) {
        if(data_ingresso.length() == 8)
            this.data_ingresso = data_ingresso;
        else 
            this.data_ingresso = "Data Inválida!"; 
    }

    public static double getSalario_base() {
        return salario_base;
    }

    public boolean setSalario_base(double salario_base) {
        if(salario_base >= 0 ) {
        	Funcionario.salario_base = salario_base;
        	return true;
        }
        else {
        	return false;
        }
    }
    
    //oi
    //r: olá
}