package teste;

import br.edu.ifpe.recife.tads.lpoo.armazenamento.ExemploArmazenamentoSimples;
import br.edu.ifpe.recife.tads.lpoo.armazenamento.ObjetoArmazenavel;

public class TesteNovaClasseJava {

	
	public static void main(String[] args) {
		
		ExemploArmazenamentoSimples gravador = new ExemploArmazenamentoSimples("Testando.bin");
		PessoaClass objeto  = new PessoaClass("Ana", 18);
		
		gravador.gravarObjeto(objeto);
		if(gravador.ultimaOperacaoDeuCerto()) {
			System.out.println("Deu certo boy");
		} else {
			System.out.println("Deu erro man");
		}
		objeto = (PessoaClass) gravador.lerObjeto();
		if(gravador.ultimaOperacaoDeuCerto()) {
			System.out.println(objeto);
			
		} else {
			System.out.println("Deu erro");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
