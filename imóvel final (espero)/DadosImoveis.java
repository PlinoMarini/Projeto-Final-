import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DadosImoveis {
	private ArrayList<Imovel2> Imoveis = new ArrayList<Imovel2>();

	// ----------- add ------------//
	public void add(Imovel2 imv) {
		this.Imoveis.add(imv); 

		System.out.println("Total de im�veis inseridos: ");
		System.out.println("Im�veis: " + this.Imoveis.size());
		
	}
	// ----------- add ------------//
	
	// ----------- busca ------------//
	public Imovel2 busca(String id) { 
		Imovel2 a = null; 
		for(Imovel2 imv : this.Imoveis) {
			if(imv.getId().equals(id)) {
				a = imv;
				break;
			}	
		}
		return a; 
	}
	// ----------- busca ------------//
	
	// ----------- exclui ----------//
	public boolean exclui(String id) {
		Imovel2 imv = busca(id); 
		if(imv != null) {
			this.Imoveis.remove(imv); 
			return true; 
		}
		System.out.println("Im�vel n�o encontrado!");
		return false; 
	}
	// ----------- exclui ----------//
	
	// ----------- salva -----------//
	public void salva() {
		BufferedWriter escritor = null;
		
		if(!Imoveis.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("imoveis"))); 
				for(Imovel2 imv : Imoveis) {
					escritor.write(imv.toString());
					System.out.println();
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
	public void salvaBin(){
		FileOutputStream escritorArq = null; 
		ObjectOutputStream escritorObj = null; 
		
		if(!Imoveis.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("imoveisbin"); 
				escritorObj = new ObjectOutputStream(escritorObj);
				escritorObj.writeObject((Integer)Imoveis.size()); 
				escritorObj.writeObject(Imoveis);
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
		}
	}
	// ----------- salvaBin -----------//
	
}// ---------- end -------------//
