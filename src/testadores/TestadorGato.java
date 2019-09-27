package testadores;

import animais.Gato;

public class TestadorGato {

	public static void main(String[] args) {
		Gato gato = new Gato("Garfield", 65.5);
		gato.imprimeDados();
		gato.miar();
	}

}
