package animais;

public class ExemploArrays {

	public static void main(String[] argumentos) {
		String[] texto;
		for( int i = 0; i < argumentos.length; i++)
{	
		texto = argumentos;
		System.out.println("Texto["+ i +"] =>");
		System.out.println(texto);
}
		int [] dados = new int [18];
		dados[3] = 42;
	
		Animal[] animais = new Animal [16];
		animais[2] = new Cachorro(null,2);
		
		System.out.println("Acabei o exemplo");
	}
}




	
	