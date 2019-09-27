package testadores;

import animais.Animal;
import animais.Cachorro;

public class TestadorCachorro {

	public static void main(String[] args) {
		TestadorCachorro novo = new TestadorCachorro();
		Cachorro cachorro = new Cachorro("Rex", 45);
		cachorro.imprimeDados();
		cachorro.latir();
		System.out.println(cachorro.toString());
		novo.testeAnimal(cachorro);
		
	}
	public void testeAnimal (Animal animal) {
		animal.emiteSom();
	}
	
}
