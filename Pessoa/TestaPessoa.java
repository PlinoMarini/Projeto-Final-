
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa guilherme = new Pessoa("Gui", "018.317.343-03", "Masculino", "guirodovalho10@gmail.com", "12345678");
		
		boolean teste = guilherme.setCpf("018.317.343-03");
		
		if(teste)
			System.out.println("cpf válido");
		else
			System.out.println("cpf inválido");

	}

}
