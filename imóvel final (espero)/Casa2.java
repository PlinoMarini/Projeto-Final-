
public class Casa2 extends Residencial2 {
	
	public Casa2(ClienteProprietario cp, int quartos, int banheiros, int suite, int sala_estar, int sala_jantar,
			int vagas_garagem, int armarios, String descricao, byte piscina) {
		super(cp, quartos, banheiros, suite, sala_estar, sala_jantar, vagas_garagem, armarios, descricao, piscina);
	}

	@Override
	/**
	 * O índice e calculado a partir dos valores contrastantes 
	 * do número de cômodos, área construida, piscina e o valor do aluguel ou venda. 
	 * Logo, caso o imovel tenha muitos comodos, piscina e etc e seu valor for baixo, mais fácil sera a compra ou o aluguel
	 * Para CASAS, o valor do indice tera um multiplicador (2x) para se diferenciar dos demais imoveis
	 */
	public void calculaIndiceVendaLocacao() {
		if(status != 2 && alug_venda == 1)
			indice = (((quartos + suite + piscina + area) - valor_aluguel)*(-1))*2; 
		else if(status != 2 && alug_venda == 2)
			indice = (((quartos + suite + piscina + area) - valor_venda) / 1000)*2;  
	}
	
}
