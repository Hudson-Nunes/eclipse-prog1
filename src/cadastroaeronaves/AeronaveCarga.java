package cadastroaeronaves;

public class AeronaveCarga extends Aeronave
{
	int capacidadeCarga;
	
	public AeronaveCarga(String modelo, String matricula, int codigoInternacional, int capacidadeCarga) 
	{
		super(modelo, matricula, codigoInternacional);
		codigoInternacional = codigoInternacional + 1;
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() 
	{
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) 
	{
		this.capacidadeCarga = capacidadeCarga;
	}
	
}
