package cadastroaeronaves;

public class AeronavePassageiros extends Aeronave 
{
	int quantAssentos;
	String nomeCompanhia, numeroVoo;
	
	public AeronavePassageiros(String modelo, String matricula, int codigoInternacional, int quantAssentos, String nomeCompanhia, String numeroVoo) {
		super(modelo, matricula, codigoInternacional);
		chaveId = chaveId + 1;
		this.quantAssentos = quantAssentos;
		this.nomeCompanhia = nomeCompanhia;
		this.numeroVoo = numeroVoo;
	}
	
	public int getQuantAssentos() {
		return quantAssentos;
	}
	
	public void setQuantAssentos(int quantAssentos) {
		this.quantAssentos = quantAssentos;
	}
	
	public String getNomeCompanhia() {
		return nomeCompanhia;
	}
	
	public void setNomeCompanhia(String nomeCompanhia) {
		this.nomeCompanhia = nomeCompanhia;
	}
	
	public String getNumeroVoo() {
		return numeroVoo;
	}
	
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

}
