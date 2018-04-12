package cadastroaeronaves;

public class CadastroAeronaves 
{
	Aeronave[] cadastro;
	int contador;

	public CadastroAeronaves() 
	{
		cadastro = new Aeronave[50];
		contador = 0;
	}
	
	public void insereAeronave(Aeronave aeronave)
	{
		cadastro[contador++] = aeronave;
	}
	
	public void insereAeronave(AeronaveCarga aeronave)
	{
		cadastro[contador++] = aeronave;
	}
	
	public void insereAeronave(AeronavePassageiros aeronave)
	{
		cadastro[contador++] = aeronave;
	}
	
	public void removeAeronave(String matricula)
	{
		for (int i = 0; i < contador; i++) {
			if (cadastro[contador].getMatricula().equals(matricula)) {
				for (int j = i; j < contador; j++){
					cadastro[j] = cadastro[j + 1];
				}
			i--;
			contador--;
			}
		}
	}
	
	public void removeAeronave(int CodigoInternacional) {
		for (int i = 0; i< contador; i++) {
			if (cadastro[contador].getCodigoInternacional() == CodigoInternacional){
				for (int j = i; j < contador; j++){
					cadastro[j] = cadastro[j+1];
				}
			}
			i--;
			contador--;
		}
	}
	
	public void mostraElementos() 
	{
		for (int i = 0; i < contador; i++) {
			System.out.println("Aeronave " + String.valueOf(i + 1));
			System.out.println("Chave de identifica��o: " + String.valueOf(cadastro[i].getChaveId()));
			System.out.println("Modelo: " + cadastro[i].getModelo());
			System.out.println("Matricula: " + cadastro[i].getMatricula());
			System.out.println("Codigo Internacional do Fabricante: " + String.valueOf(cadastro[i].getCodigoInternacional()));
			if (cadastro[i] instanceof AeronavePassageiros) {
				System.out.println("Assentos: " + String.valueOf(((AeronavePassageiros)cadastro[i]).getQuantAssentos()));
				System.out.println("Nome da Companhia: " + ((AeronavePassageiros)cadastro[i]).getNomeCompanhia());
				System.out.println("Nome da Companhia: " + ((AeronavePassageiros)cadastro[i]).getNumeroVoo());
			}
			if (cadastro[i] instanceof AeronaveCarga) {
				System.out.println("Assentos: " + String.valueOf(((AeronaveCarga)cadastro[i]).getCapacidadeCarga()));
			}
			System.out.println(" ");
		}
	}
	
	public void pesquisaElemento(int codigoInternacional) 
	{
		for (int i = 0; i < contador; i++){
			if (cadastro[i].getCodigoInternacional() == codigoInternacional) {
				System.out.println("Chave de identificação: " + String.valueOf(cadastro[i].getChaveId()));
				System.out.println("Modelo: " + cadastro[i].getModelo());
				System.out.println("Matricula: " + cadastro[i].getMatricula());
				System.out.println("Codigo Internacional do Fabricante: " + String.valueOf(cadastro[i].getCodigoInternacional()));
				if (cadastro[i] instanceof AeronavePassageiros) {
					System.out.println("Assentos: " + String.valueOf(((AeronavePassageiros)cadastro[i]).getQuantAssentos()));
					System.out.println("Nome da Companhia: " + ((AeronavePassageiros)cadastro[i]).getNomeCompanhia());
					System.out.println("Nome da Companhia: " + ((AeronavePassageiros)cadastro[i]).getNumeroVoo());
				}
				if (cadastro[i] instanceof AeronaveCarga) {
					System.out.println("Assentos: " + String.valueOf(((AeronaveCarga)cadastro[i]).getCapacidadeCarga()));
				}
				System.out.println(" ");
			}
		}
	}

}