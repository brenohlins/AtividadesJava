package animais;

public class Cachorro extends Animal{
	String nome;
	double peso;
	
	public Cachorro(String n, double p) {
		this.nome = n;
		this.peso = p;
	}
	
	public void imprimeDados() {
		String texto = "Dados do cachorro\n";
		texto += "Nome " + this.nome;
		texto += "\nPeso " + this.peso;
		System.out.println(texto);
	}
	
	public void imprimeDados(String cabecalho) {
		System.out.println(cabecalho);
		this.imprimeDados();
	}
	
	public void latir() {
		;System.out.println("au au");
	}
	public void emiteSom() {
		System.out.println("au au");
	}
	
}
