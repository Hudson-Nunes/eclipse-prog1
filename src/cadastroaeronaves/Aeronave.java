package cadastroaeronaves;

public class Aeronave 
{
	String modelo, matricula;
	int chaveId, codigoInternacional;
	
	public Aeronave(String modelo, String matricula, int codigoInternacional) 
	{
		this.modelo = modelo;
		this.matricula = matricula;
		this.codigoInternacional = codigoInternacional;
		chaveId = (int) (Math.random() * 999);
	}
	
	public String getModelo() 
	{
		return modelo;
	}
	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public String getMatricula() 
	{
		return matricula;
	}
	
	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}
	
	public int getChaveId() 
	{
		return chaveId;
	}
	
	public void setChaveId(int chaveId) 
	{
		this.chaveId = chaveId;
	}
	
	public int getCodigoInternacional() 
	{
		return codigoInternacional;
	}
	
	public void setCodigoInternacional(int codigoInternacional) 
	{
		this.codigoInternacional = codigoInternacional;
	}

}
