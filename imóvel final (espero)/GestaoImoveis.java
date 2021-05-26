import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.io.Serializable;

public class GestaoImoveis {
	private ArrayList<Imovel2> Residencial = new ArrayList<Imovel2>();
	private ArrayList<Imovel2> Comercial = new ArrayList<Imovel2>(); 
	private ArrayList<Imovel2> Terreno = new ArrayList<Imovel2>(); 
	
	// ----------- add ------------//
	public void add(Imovel2 imv, String array) {
		array = array.strip(); 
		array = array.toLowerCase(Locale.ROOT); 
		
		switch(array) {
			case "residencial":
				this.Residencial.add(imv); 
				break;
			case "comercial":
				this.Comercial.add(imv);
			case "terreno":
				this.Terreno.add(imv); 
			default:
				System.out.println("List inv�lida!");
		}//---------- switch ----------//
		System.out.println("Total de im�veis inseridos: ");
		System.out.println("Im�veis residenciais: " + this.Residencial.size());
		System.out.println("Im�veis comerciais: " + this.Comercial.size());
		System.out.println("Terreno: " + this.Terreno.size());
	}
	// ----------- add ------------//
	
	// ----------- busca ------------//
	public Imovel2 buscaResidencial(String id) { 
		Imovel2 a = null; 
		for(Imovel2 imv : this.Residencial) {
			if(imv.getId().equals(id)) {
				a = imv;
				break;
			}	
		}
		return a; 
	}
	
	public Imovel2 buscaComercial(String id) { 
		Imovel2 b = null; 
		for(Imovel2 imv : this.Comercial) {
			if(imv.getId().equals(id)) {
				b = imv;
				break;
			}	
		}
		return b; 
	}
	
	public Imovel2 buscaTerreno(String id) { 
		Imovel2 c = null; 
		for(Imovel2 imv : this.Terreno) {
			if(imv.getId().equals(id)) {
				c = imv;
				break;
			}	
		}
		return c; 
	}
	// ----------- busca ------------//
	
	// ----------- excluir ----------//
	public boolean eliminaImoveis(String id) {
		Imovel2 imv = buscaResidencial(id); 
		if(imv != null) {
			this.Residencial.remove(imv); 
			return true; 
		}
		imv = buscaComercial(id); 
		if(imv != null) {
			this.Comercial.remove(imv); 
			return true; 
		}
		imv = buscaTerreno(id);
		if(imv != null) {
			this.Terreno.remove(imv); 
			return true; 
		}
		System.out.println("Im�vel n�o encontrado!");
		return false; 
	}
	// ----------- excluir ----------//
	
	// ----------- salva -----------//
	public void salvaImoveis() {
		BufferedWriter escritor = null;
		
		if(!Residencial.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("Residencial"))); 
				for(Imovel2 imv : Residencial) {
					escritor.write(imv.toString());
				}
				escritor.flush();
				escritor.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		if(!Comercial.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("Comercial")));
				for(Imovel2 imv : Comercial) {
					escritor.write(imv.toString());
				}
				escritor.flush(); 
				escritor.close(); 
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		if(!Terreno.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("Terreno")));
				for(Imovel2 imv : Terreno) {
					escritor.write(imv.toString());
				}
				escritor.flush(); 
				escritor.close(); 
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	// ----------- salva -----------//
	
	// ----------- salvaBin -----------//
	public void salvaImoveisBin() {
		FileOutputStream escritorArq = null; 
		ObjectOutputStream escritorObj = null; 
		
		if(!Residencial.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("residencialbin"); 
				escritorObj = new ObjectOutputStream(escritorObj); 
				escritorObj.writeObject(Residencial);
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(escritorArq != null)
						escritorArq.close(); 
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}//if residencial
		
		if(!Comercial.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("Comercialbin"); 
				escritorObj = new ObjectOutputStream(escritorObj); 
				escritorObj.writeObject(Comercial);
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(escritorArq != null)
						escritorArq.close(); 
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}//if comercial
		
		if(!Terreno.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("terrenobin"); 
				escritorObj = new ObjectOutputStream(escritorObj); 
				escritorObj.writeObject(Terreno);
			}
			catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			finally {
				try {
					if(escritorArq != null)
						escritorArq.close(); 
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}//if terreno
	}
	// ----------- salvaBin -----------//
	
}// ---------- end -------------//
