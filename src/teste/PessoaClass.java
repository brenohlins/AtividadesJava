package teste;

import br.edu.ifpe.recife.tads.lpoo.armazenamento.ObjetoArmazenavelAbstrato;

public class PessoaClass extends ObjetoArmazenavelAbstrato {
	String nome;
	int idade;


public PessoaClass(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
	
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Nome = " + this.nome +  " Idade =" + this.idade;
	
}





}