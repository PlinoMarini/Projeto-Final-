import java.util.ArrayList;

class DadosTransacao{
	private ArrayList<Transacao> vetTrans = new ArrayList<Transacao>();
	public void cadastrar(Transacao c) {
		this.vetTrans.add(c); //ADICIONA A TRANSAÇÃO NO ARRAY
		System.out.println("Total de transacões inseridas: ");
		System.out.println(this.vetTrans.size());
	} public void listar(){
		mostrarDados();
	}
	//este método retorna o objeto Transacao caso encontrado, ou null, caso não encontrado
	public Transacao buscar(int nro) {//pode-se usar também int
		Transacao c = null;
			for ( Transacao objeto: this.vetTrans) {
				if (objeto.getNroContrato() == (nro)) {
					c = objeto;
					break;
				}
			} return c;
	}
	
	public boolean excluir(int nro){
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
}