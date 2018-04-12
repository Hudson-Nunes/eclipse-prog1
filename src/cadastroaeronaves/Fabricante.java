package cadastroaeronaves;

public class Fabricante 
{
	int chaveFabricante, codigoInternacional;
	String nome;
	
	public Fabricante(String nome, int codigoInternacional) 
	{
		chaveFabricante = (int) (Math.random() * 999);
		this.nome = nome;
		this.codigoInternacional = codigoInternacional;
	}

	public int getChaveFabricante() 
	{
		return chaveFabricante;
	}

	public void setChaveFabricante(int chaveFabricante) 
	{
		this.chaveFabricante = chaveFabricante;
	}

	public int getCodigoInternacional() 
	{
		return codigoInternacional;
	}

	public void setCodigoInternacional(int codigoInternacional) 
	{
		this.codigoInternacional = codigoInternacional;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
}
