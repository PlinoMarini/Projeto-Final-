
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa guilherme = new Pessoa("Gui", "610.746.433-64", "Masculino", "guirodovalho10@gmail.com", "12345678");
		
		boolean teste = guilherme.setCpf("610.746.433-64");
		
		if(teste)
			System.out.println("cpf válido");
		else
			System.out.println("cpf inválido");

	}

}
