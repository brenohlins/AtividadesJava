package teste;

public class Pessoa implements Comparable <Pessoa>
{

	private double altura;
	private String nome;
	private double peso;
	private int idade;


	public Pessoa (String novoNome, double novaAltura,double novoPeso, int novaIdade)
	{
		this.nome = novoNome;
		this.altura = novaAltura;
		this.peso = novoPeso;
		this.idade = novaIdade;

	}



	@Override
	public int compareTo(Pessoa outraPessoa) 
	{
		int resultado = comparaPelaAltura(outraPessoa);

		if(resultado == 0)
		{
			resultado = comparaPeloPeso(outraPessoa);
		}
		return  resultado;

	}
	public int comparaPelaAltura(Pessoa outraPessoa) 
	
	{

		if(this.altura > outraPessoa.altura) {
			return 1;
		}else if(this.altura == outraPessoa.altura) 
		{
			return 0;
		} else {
			return -1;  
		}
	}

	public int comparaPeloPeso(Pessoa outraPessoa)
	
	{

		if(this.peso <  outraPessoa.peso) {
			return 1;
		}else if(this.peso == outraPessoa.peso) 
		{
			return 0;
		} else {
			return -1;  
		}


	}

	@Override
	public String toString() 
	{
		return "Pessoa [ Altura =" + altura +",Nome = " + nome +", Peso ="+ peso +",Idade="+idade+"]";
	}



}


