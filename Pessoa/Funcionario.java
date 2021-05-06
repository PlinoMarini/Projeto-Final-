public class Funcionario extends Pessoa{

    private String data_ingresso; 
    private double salario_base;

    public Funcionario (String nome, String cpf, String sexo, String email, String telefone, String data_ingresso, double salario_base){
    super(nome, cpf, sexo, email, telefone);
    setData_ingresso(data_ingresso); 
    setSalario_base(salario_base); 
    
    }//Constructor

    public String getData_ingresso() {
        return data_ingresso;
    }

    //  10/10/21 -> 8 posições de array
    public void setData_ingresso(String data_ingresso) {
        if(data_ingresso.length() == 8)
            this.data_ingresso = data_ingresso;
        else 
            this.data_ingresso = "Data Inválida!"; 
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        if(salario_base > 0 )
            this.salario_base = salario_base;
        else
            this.salario_base = 0.0; 
    }
    
}