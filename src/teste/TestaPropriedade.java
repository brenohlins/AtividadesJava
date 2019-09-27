package teste;


import java.util.HashMap;
public class TestaPropriedade {
	HashMap<String,PropriedadeFirefox> tabela;
	
	public static void main(String[] args) {
	
		TestaPropriedade app = new TestaPropriedade();
		app.criaTabela();
		
	}
	public void criaTabela() {
		this.tabela = new HashMap<String, PropriedadeFirefox>();
		
	}
	
	
	public void adicionaPropriedade(String chave,PropriedadeFirefox obj) {
		
		this.tabela.put(chave, obj);
		
	}
	
	public PropriedadeFirefox consultaPropriedade(String chave){
		return this.tabela.get(chave);
	}
	
	public void listarPropriedade()
	{
	
	
	
	}

}


