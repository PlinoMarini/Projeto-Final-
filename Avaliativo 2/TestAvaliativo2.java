// import java.util.ArrayList;

public class TestAvaliativo2 {

	public static void main(String[] args) {

		GestaoContatos gestao = new GestaoContatos();
		Contato guilherme = new Contato("Guilherme", 18, 'M', "Estudante", "64992849874", "guirodovalho10@gmail.com");
		Contato marco = new Contato("marc", 20, 'M', "profissao", "12345", "mrc@gmail.com");
		
		gestao.add(guilherme, "familia");
		gestao.add(marco, "familia");
		// String res = gestao.toString();
		// System.out.println(res);
		// gestao.listaContatos("familia");

		Contato vctt = gestao.maisVelho("familia");
		System.out.println(vctt.toString());

		Contato nctt = gestao.maisNovo("familia");
		System.out.println(nctt.toString());

		gestao.salvaContatos();
		gestao.salvaContatosBin();
		
	}

}//------------------end------------------//
