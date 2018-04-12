package servidoremail;

public class Servidor 
{
	CaixaPostal[] vetorCaixasPostais;
	int contadorCaixaPostal;
	Email[] caixaSaida;
	
	public Servidor()
	{
		vetorCaixasPostais = new CaixaPostal[50];
		contadorCaixaPostal = 0;
	}
	
	public void add(CaixaPostal caixa) 
	{
		if(vetorCaixasPostais.length == contadorCaixaPostal) {
			System.out.println();
			System.out.println("A caixa postal está cheia!");
		}else {
			vetorCaixasPostais[contadorCaixaPostal++] = caixa;
		}
	}
	
	/*
	public void sendReceive() 
	{
		for(int i = 0; i < vetorCaixasPostais.length; i++) {
			caixaSaida = vetorCaixasPostais[i].getCaixaDeSaida();
			for (int j = 0; j < vetorCaixasPostais[i].getContadorEmail(); j++) {
				for (int w = 0; w < vetorCaixasPostais.length; w++){
					if (caixaSaida[j].getDestinatario().equals(vetorCaixasPostais[w].getRemetente()) && vetorCaixasPostais[w].getContadorEmailRecebido() < 50){
						vetorCaixasPostais[w].insereEmail(caixaSaida[j]);
					}
				}
			}
			vetorCaixasPostais[i].apagaCaixaSaida();
		}
	}
	*/

}
