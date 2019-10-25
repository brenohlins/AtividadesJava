package teste;
import java.util.ArrayList;
import java.util.Collections;

public class testaCollections {

	private ArrayList<Pessoa> minhaPessoa;


	public static void main(String[] args) {
		
		testaCollections testador;
		
		testador = new testaCollections();
		
		testador.criaColecao();
		testador.preencheColecao();
		testador.imprimeColecao();
		testador.ordenaColecao();
		testador.imprimeColecao();
		 
	

	}
	
	private void criaColecao() {
		
		minhaPessoa = new ArrayList <Pessoa>();
		
	}
	
	
	private void preencheColecao() 
	
	{
		Pessoa pessoa;
		
		pessoa = new Pessoa ("Joao", 1.88, 50, 15);
		minhaPessoa.add(pessoa);
		pessoa = new Pessoa ("Pedro", 1.88, 60, 16);
		minhaPessoa.add(pessoa);
		pessoa = new Pessoa ("Erika", 1.67, 61, 12);
		minhaPessoa.add(pessoa);
		pessoa = new Pessoa ("Victor", 1.58, 63, 15);
		minhaPessoa.add(pessoa);
		pessoa = new Pessoa ("Rennan", 1.78, 70, 19);
		minhaPessoa.add(pessoa);
		
	}
	
	
	private void imprimeColecao() 
	{
		this.minhaPessoa.forEach(i -> {
			System.out.println(i);
		});
		System.out.println("-----------------------");
//		for(Pessoa pessoa: minhaPessoa) {
//			System.out.println(pessoa);
//		}
	}

	private void ordenaColecao() {
		Collections.sort(minhaPessoa);
	}
}
