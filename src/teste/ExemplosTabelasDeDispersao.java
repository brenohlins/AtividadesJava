package teste;
import java.util.HashMap;
public class ExemplosTabelasDeDispersao {
	
	
	private HashMap<String, Object> tabela;
	
	
	public static void main(String[] args) {


	}

		private void criaTabela()
		{
			tabela = new HashMap<String, Object>();
			
			
		}

		
		private void preencheTabela() 
		{
			tabela.put("1", "Jonas");
			tabela.put("112", "Jorge");
			tabela.put("154", "Carla");
			
		}
		
		
		private void consultaTabela() 
		
		{
			String testar;
			Object testar2;
			testar = "1";
			testar2 = tabela.get("a"); 
			System.out.println("O dado para" + testar);
			System.out.println("é"+ testar2);
		}
		
		private void substituiEntrada()
		{
			Object valorAnterior;
			valorAnterior = tabela.replace("Jonh");
			String valorAnterior1;
			valorAnterior1 = tabela.replace("2");
			System.out.println("O valor anterior é");
			
			
		}

}


