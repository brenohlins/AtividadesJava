package animais;

public class Gato {	
	String nome;
	double peso;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Gato(String n, double p) {
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
	
	public void miar() {
		System.out.println("Miau");
	}
}
