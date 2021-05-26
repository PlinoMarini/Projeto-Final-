import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DadosEndereco {
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>(); 

    // ----------- add ------------//
    public void add(Endereco end){
        this.enderecos.add(end); 

        System.out.println("Endereços Cadastrados: ");
        System.out.println(this.enderecos.size());
    }
    // ----------- add ------------//

    // ----------- busca ------------//
    public Endereco busca(String cep){
        Endereco e = null;
        for(Endereco end : this.enderecos){
            if(end.getCep().equals(cep)){
                e = end; 
            }
        } 
        return e; 
    }
     // ----------- busca ------------//

     // ----------- exclui ------------//
    public boolean exclui(String cep){
        Endereco end = busca(cep); 
        if(end != null){
            this.enderecos.remove(end);
            return true; 
        }
        System.out.println("Endereço não encontrado!");
        return false; 
    }
     // ----------- exclui ------------//

     // ----------- salva -----------//
	public void salva() {
		BufferedWriter escritor = null;
		
		if(!enderecos.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("enderecos"))); 
				for(Endereco end : enderecos) {
					escritor.write(end.toString());
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
		
		if(!enderecos.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("enderecosbin"); 
				escritorObj = new ObjectOutputStream(escritorObj);
				escritorObj.writeObject((Integer)enderecos.size()); 
				escritorObj.writeObject(enderecos);
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
}
