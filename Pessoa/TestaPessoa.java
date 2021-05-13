
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa guilherme = new Pessoa("Gui", "610.746.433-64", "Masculino", "guirodovalho10@gmail.com", "12345678");
		
		boolean teste = guilherme.setCpf("064.585.643-68");
		
		if(teste)
			System.out.println("cpf válido");
		else
			System.out.println("cpf inválido");
//		
		System.out.println(guilherme.getCpf());
		
		Corretor gui = new Corretor("Guilherme", "018.317.343-03", "Masculino", "guirodovalho10@gmail.com", "1234", 
				"10/05/2020", 1500d);
		
		
		String[] cursos = {"Mecanico", "proplayer", "bootcamp", "jogador caro"};
		
		
		gui.setCursos(cursos);
		
		
		gui.setCursos("Gostack");
	
		
		if(gui.removeCurso("Gostack"))
			System.out.println("Deu bom a remoção");
		else
			System.out.println("Deu ruim");
		
		String test = gui.getCursos();
		
		System.out.println(test);
		
		

	}

}
