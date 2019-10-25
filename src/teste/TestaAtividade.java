package teste; 
import br.edu.ifpe.recife.tads.lpoo.armazenamento.ExemploArmazenamentoSimples;
import br.edu.ifpe.recife.tads.lpoo.armazenamento.ObjetoArmazenavel;

/**
 * Classe de teste para a biblioteca que
 * armazena objetos.
 * 
 * @author Paulo Guedes
 *
 */
public class TestaAtividade {

	public static void main(String[] args)
	{
		ExemploArmazenamentoSimples gravador;
		gravador = new ExemploArmazenamentoSimples("Arquivo.bin");
		
		ObjetoArmazenavel objeto;
		objeto = new ObjetoArmazenavel("dado a ser gravado!!!");
		objeto = null;
		
		gravador.gravarObjeto(objeto);
	if(gravador.ultimaOperacaoDeuCerto())
		{
			System.out.println("Deu certo!!!");
		}
		else
		{
			System.out.println("Falhou!");
		}

		//objeto = (ObjetoArmazenavel) gravador.lerObjeto();
		//if(gravador.ultimaOperacaoDeuCerto())
		//{
			//System.out.println("Deu certo!!! eu li -> [" + objeto + "].");
		//}
		//else
		//{
			//System.out.println("Falhou!");
		//}
	}

}