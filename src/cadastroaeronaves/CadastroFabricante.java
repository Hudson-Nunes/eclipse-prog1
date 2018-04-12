package cadastroaeronaves;

public class CadastroFabricante 
{
	Fabricante[] cadastro;
	int contadorFabricante;

	public CadastroFabricante() 
	{
		cadastro = new Fabricante[50];
		contadorFabricante = 0;
	}
	
	public void insereFabricante(Fabricante fabricante)
	{
		cadastro[contadorFabricante++] = fabricante;
	}
	
	public void removeFabricante(int codigoInternacional)
{
		for (int i = 0; i < contadorFabricante; i++){
			if (cadastro[contadorFabricante].getCodigoInternacional() == codigoInternacional){
				for (int j = i; j < contadorFabricante; j++){
					cadastro[j] = cadastro[j + 1];
				}
			}
			i--;
			contadorFabricante--;
		}
	}
	
	public void mostraElementos() 
	{
		for (int i = 0; i < contadorFabricante; i++){
			System.out.println("Fabricante " + (i + 1));
			System.out.println("Nome: " + cadastro[i].getNome());
			System.out.println("Codigo Internacional do Fabricante: " + String.valueOf(cadastro[i].getCodigoInternacional()));
			System.out.println("Chave de Identifica��o do Fabricante: " + String.valueOf(cadastro[i].getChaveFabricante()));
			System.out.println(" ");
		}
	}
	
	public void pesquisaElemento(int codigoInternacional)
	{
		for (int i = 0; i < contadorFabricante; i++){
			if (cadastro[i].getCodigoInternacional() == codigoInternacional){
				System.out.println("Fabricante " + String.valueOf(i+1));
				System.out.println("Nome: " + cadastro[i].getNome());
				System.out.println("Codigo Internacional do Fabricante: " + String.valueOf(cadastro[i].getCodigoInternacional()));
				System.out.println("Chave de Identifica��o do Fabricante: " + String.valueOf(cadastro[i].getChaveFabricante()));
				System.out.println(" ");
			}
		}
	}
	
	}
