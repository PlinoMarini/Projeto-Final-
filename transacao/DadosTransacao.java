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

class DadosTransacao{
	private ArrayList<Transacao> vetTrans = new ArrayList<Transacao>();
	public void add(Transacao c) {
		this.vetTrans.add(c); //ADICIONA A TRANSA��O NO ARRAY
		System.out.println("Total de transac�es inseridas: ");
		System.out.println(this.vetTrans.size());
	} public void listar(){
		mostrarDados();
	}
	//este m�todo retorna o objeto Transacao caso encontrado, ou null, caso n�o encontrado
	public Transacao busca(int nro) {//pode-se usar tamb�m int
		Transacao c = null;
			for ( Transacao objeto: this.vetTrans) {
				if (objeto.getNroContrato() == (nro)) {
					c = objeto;
					break;
				}
			} return c;
	}
	
	public boolean exclui(int nro){
		Transacao c = this.buscar(nro);
		if (c != null) {
				this.vetTrans.remove(c);
				return true;
			} else {
				return false;
			}
		}
	
    public void mostrarDados() {
        for(Transacao objeto:this.vetTrans){
            System.out.println( objeto.toString());
        }
    }

	public void salva() {
		BufferedWriter escritor = null;
		
		if(!vetTrans.isEmpty()) {
			try {
				escritor = new BufferedWriter(new FileWriter(new File("transacao"))); 
				for(Transacao trans : vetTrans) {
					escritor.write(trans.toString());
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
		
		if(!vetTrans.isEmpty()) {
			try {
				escritorArq = new FileOutputStream("transacaobin"); 
				escritorObj = new ObjectOutputStream(escritorObj); 
				escritorObj.writeObject(vetTrans);
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