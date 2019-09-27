package teste;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExemploColecao {

	
	private ArrayList<String> meuArray;
	

	public static void main(String[] args) {
		ExemploColecao testador;
	
			testador = new ExemploColecao();
			testador.adicionaStrings(60);
			testador.geraSubColecao(5);
	}
	
public void adicionaStrings(int quantidade) {
		
		meuArray = new ArrayList<String>();
		
		for (int i = 0; i < quantidade; i++) {
			
			meuArray.add("Valor" +(i+1));
		 }
			meuArray.forEach(System.out::println);
	}
	public ArrayList<String> geraSubColecao(int quantidade)
	{
		ArrayList<String> arrayRetorno = new ArrayList<String>();
		for (int i = 0; i < quantidade; i++) {
			arrayRetorno.add(this.meuArray.get(i));
			arrayRetorno.forEach(System.out::println);
			}

	return arrayRetorno;
}

}

	
	
	

	