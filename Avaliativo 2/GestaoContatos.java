import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Locale;

public class GestaoContatos {
	private ArrayList<Contato> Familia = new ArrayList<Contato>();   
	private ArrayList<Contato> Amigos = new ArrayList<Contato>();  
	private ArrayList<Contato> Profissional = new ArrayList<Contato>();


	public void add(Contato ctt, String array){
		array = array.strip();
		array = array.toLowerCase(Locale.ROOT);

		switch(array){
			case "familia":
				this.Familia.add(ctt);
				break;
			case "amigos":
				this.Amigos.add(ctt);
				break;
			case "profissional":
				this.Amigos.add(ctt);
				break;
			default:
				System.out.println("Lista de contatos invalida");
		}
		System.out.print("Total de pessoas inseridas: "); 		//verifica quantas pessoas foram inseridas no ArrayList
		System.out.println(this.Familia.size());
	}
	
	// public void addFamilia(Contato a) {
	// 	this.Familia.add(a); 		//adiciona a pessoa no array Fam�lia
	// 	System.out.println("Total de pessoas inseridas: "); 		//verifica quantas pessoas foram inseridas no ArrayList
	// 	System.out.println(this.Familia.size());
	// }
	
	// public void addAmigos(Contato b) {
	// 	this.Amigos.add(b); 		//adiciona a pessoa no array Amigos
	// 	System.out.println("Total de pessoas inseridas: "); 		//verifica quantas pessoas foram inseridas no ArrayList
	// 	System.out.println(this.Amigos.size());
	// }
	
	// public void addProfissional(Contato c) {
	// 	this.Amigos.add(c);			//adiciona a pessoa no array Profissional 
	// 	System.out.println("Total de pessoas inseridas: "); 		//verifica quantas pessoas foram inseridas no ArrayList
	// 	System.out.println(this.Profissional.size());
	// }
	
	//---------------------------- add------------------------------//
	
	public Contato buscaFamilia(String nome) {
		Contato a = null; 
		for(Contato pessoa : this.Familia) {
			if(pessoa.getNome().equals(nome)) {
				a = pessoa; 
				break; 
			}
		}
		return a; 
	}
	
	public Contato buscaAmigo(String nome) {
		Contato b = null; 
		for(Contato pessoa : this.Amigos) {
			if(pessoa.getNome().equals(nome)) {
				b = pessoa; 
				break; 
			}
		}
		return b; 
	}
	
	public Contato buscaProfissional(String nome) {
		Contato c = null; 
		for(Contato pessoa : this.Profissional) {
			if(pessoa.getNome().equals(nome)) {
				c = pessoa; 
				break; 
			}
		}
		return c; 
	}
	
	//----------------------------busca------------------------------//


	public boolean eliminaContato(String nome){

		Contato ctt = buscaFamilia(nome);
		if (ctt != null){
			this.Familia.remove(ctt);
			return true;
		}
	 	ctt = buscaAmigo(nome);
		if (ctt != null){
			this.Familia.remove(ctt);
			return true;
		}
		ctt = buscaProfissional(nome);
		if (ctt != null){
			this.Profissional.remove(ctt);
			return true;
		}
		System.out.println("Contato não encontrado!");
		return false;


	}

	
	// public boolean excFamilia(String nome) {
	// 	Contato a = buscaFamilia(nome); 
	// 	if(a != null) {
	// 		this.Familia.remove(a);
	// 		return true;
	// 	}
	// 	else {
	// 		System.out.println("Contato n�o encontrado!");
	// 		return false;
	// 	}
	// }
	
	// public boolean excAmigo(String nome) {
	// 	Contato b = buscaAmigo(nome); 
	// 	if(b != null) {
	// 		this.Amigos.remove(b);
	// 		return true;
	// 	}
	// 	else {
	// 		System.out.println("Contato n�o encontrado!");
	// 		return false;
	// 	}
	// }
	
	// public boolean excProfissional(String nome) {
	// 	Contato c = buscaProfissional(nome); 
	// 	if(c != null) {
	// 		this.Profissional.remove(c);
	// 		return true;
	// 	}
	// 	else {
	// 		System.out.println("Contato n�o encontrado!");
	// 		return false;
	// 	}
	// }
	
	//----------------------------Excluir------------------------------//

	public void listaContatos(String array){
		array = array.strip();
		array = array.toLowerCase(Locale.ROOT);

		switch(array){
			case "familia":
				for(Contato a : this.Familia) {
					System.out.print(a.toString());
				}
				break;
			case "amigos":
				for(Contato b : this.Amigos) {
					System.out.print(b.toString());
				}
				break;
			case "profissional":
				for(Contato c : this.Profissional) {
					System.out.print(c.toString());
				}
				break;
			default:
				System.out.println("Lista de contatos invalida");
				
		}
		
	}

	public String toString(){
		StringBuilder str = new StringBuilder();
		for(Contato c : this.Amigos){

			str.append(c.toString());
			str.append("\n");

		}
		for(Contato c : this.Familia){

			str.append(c.toString());
			str.append("\n");
			
		}
		for(Contato c : this.Profissional){
			
			str.append(c.toString());
			str.append("\n");

		}

		return str.toString();
	}
	
	//----------------------------Mostrar------------------------------//
	
	public Contato maisVelho(String array){
		array = array.strip();
		array = array.toLowerCase(Locale.ROOT);

		Contato aux = new Contato();


		switch(array){
			case "familia":
				if(this.Familia.size() <= 0){
					return aux;
				}
				aux = Familia.get(0);
				for(Contato ctt : this.Familia){
					if(ctt.getIdade() > aux.getIdade())
						aux = ctt;
				}
			break;
			case "amigos":
				if(this.Amigos.size() <= 0){
					return aux;
				}
				aux = Amigos.get(0);
				for(Contato ctt : this.Amigos){
					if(ctt.getIdade() > aux.getIdade())
						aux = ctt;
				}
			break;
			case "profissional":
				if(this.Profissional.size() <= 0){
					return aux;
				}
				aux = Profissional.get(0);
				for(Contato ctt : this.Profissional){
					if(ctt.getIdade() > aux.getIdade())
						aux = ctt;
				}
			break;
			default:
			break;

		}
		
		return aux;
	}

	public Contato maisNovo(String array){

		array = array.strip();
		array = array.toLowerCase(Locale.ROOT);

		Contato naux = new Contato();

		switch(array){
			case "familia":
				if(this.Familia.size() <= 0){
					return naux;
				}
				naux = Familia.get(0);
				for(Contato ctt : this.Familia){
					if(ctt.getIdade() < naux.getIdade())
						naux = ctt;
				}
			break;
			case "amigos":
				if(this.Amigos.size() <= 0){
					return naux;
				}
				naux = Amigos.get(0);
				for(Contato ctt : this.Amigos){
					if(ctt.getIdade() < naux.getIdade())
						naux = ctt;
				}
			break;
			case "profissional":
				if(this.Profissional.size() <= 0){
					return naux;
				}
				naux = Profissional.get(0);
				for(Contato ctt : this.Profissional){
					if(ctt.getIdade() < naux.getIdade())
						naux = ctt;
				}
			break;
			default:
			break;



		}

		return naux;

	}

	public void salvaContatos(){

		BufferedWriter escritor = null;

		if(!Familia.isEmpty()){
			try {
				escritor = new BufferedWriter(new FileWriter(new File("familia")));
				for(Contato ctt : Familia){
					escritor.write(ctt.toString());
				}
				escritor.flush();
				escritor.close();
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if(!Amigos.isEmpty()){
			try {
				escritor = new BufferedWriter(new FileWriter(new File("amigos")));
				for(Contato ctt : Amigos){
					escritor.write(ctt.toString());
				}
				escritor.flush();
				escritor.close();
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if(!Profissional.isEmpty()){
			try {
				escritor = new BufferedWriter(new FileWriter(new File("profissional")));
				for(Contato ctt : Profissional){
					escritor.write(ctt.toString());
				}
				escritor.flush();
				escritor.close();
	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void salvaContatosBin(){

		FileOutputStream escritorArq = null;
		ObjectOutputStream escritorObj = null;

		if(!Familia.isEmpty()){

			try {
				escritorArq = new FileOutputStream("familiabin");
				escritorObj = new ObjectOutputStream(escritorArq);
				
	
				escritorObj.writeObject(Familia);
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e){
				System.out.println(e.getMessage());
			} finally {
				try {
					if (escritorArq != null)
						escritorArq.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

		if(!Amigos.isEmpty()){
			try {
				escritorArq = new FileOutputStream("amigosbin");
				escritorObj = new ObjectOutputStream(escritorArq);
				
	
				escritorObj.writeObject(Amigos);
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e){
				System.out.println(e.getMessage());
			} finally {
				try {
					if (escritorArq != null)
						escritorArq.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		if(!Profissional.isEmpty()){
			try {
				escritorArq = new FileOutputStream("profissionalbin");
				escritorObj = new ObjectOutputStream(escritorArq);
				
	
				escritorObj.writeObject(Profissional);
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e){
				System.out.println(e.getMessage());
			} finally {
				try {
					if (escritorArq != null)
						escritorArq.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	
	
}//---------------end---------------//
