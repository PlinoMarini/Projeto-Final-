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

public class DadosPessoa {
    private ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>(); 

    // ----------- add ------------//
    public void add(Pessoa plp){
        this.Pessoas.add(plp); 

        System.out.println("Pessoas Cadastradas: ");
        System.out.println(this.Pessoas.size());
    }
    // ----------- add ------------//

    // ----------- busca ------------//
    public Pessoa busca(String nome){
        Pessoa p = null;
        for(Pessoa plp : this.Pessoas){
            if(plp.getNome().equals(nome)){
                p = plp; 
            }
        } 
        return p; 
    }
     // ----------- busca ------------//

     // ----------- exclui ------------//
    public boolean exclui(String nome){
        Pessoa plp = busca(nome); 
        if(plp != null){
            this.Pessoas.remove(plp);
            return true; 
        }
        System.out.println("Pessoa não encontrada!");
        return false; 
    }
     // ----------- exclui ------------//

     // ----------- salva -----------//
	public void salva() {
		BufferedWriter escritor = null;
		
		if(!Pessoas.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("pessoas"))); 
				for(Pessoa plp : Pessoas) {
					escritor.write(plp.toString());
					System.out.println();
				}
				escritor.flush();
				escritor.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
    } // ----------- salva -----------//

        // ----------- salvaBin -----------//
        public void salvaBin(){
        FileOutputStream escritorArq = null; 
		ObjectOutputStream escritorObj = null; 
		
		if(!Pessoas.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("pessoasbin"); 
				escritorObj = new ObjectOutputStream(escritorObj);
				escritorObj.writeObject((Integer)Pessoas.size()); 
				escritorObj.writeObject(Pessoas);
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
}//------------- end -------------//
