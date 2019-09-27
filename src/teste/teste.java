package teste;


import java.util.Scanner;

import animais.Animal;

public class teste {
	public static void main(String[] args) {
		
		TestaArrayString(12);
	}

	public static void TestaArrayInt()
	{
		int[] teste = new int[101];
		for(int i = 0; i <= 100; i++) {
		teste[i] = i;
		} 
		for(int i = 0; i <= 100; i++)
		{
			System.out.println(teste[i]);
		}
	
	}
	
	public static void TestaArrayString(int tamanho)
	{ 
		Scanner Entrada = new Scanner(System.in);
		String [] teste = new String [tamanho];
		for(int i = 0; i < tamanho; i++){
			teste[i] = Entrada.next(); 
		}
		}
	 

	public static void TestaAnimalArray() {
		Animal[] teste = new Animal[3];
		
		
		
	}
}
	 


