package servidoremail;

public class CaixaPostal 
{
	String remetente, email;
	Email[] caixaDeSaida;
	Email[] caixaDeEntrada;
	int contadorEmail, contadorEmailRecebido;
	
	public CaixaPostal(String remetente)
	{
		this.remetente = remetente;
		caixaDeSaida = new Email[50];
		caixaDeEntrada = new Email[50];
		contadorEmail = 0;
		contadorEmailRecebido = 0;
	}
	
	public String getRemetente() 
	{
		return remetente;
	}

	public void setRemetente(String remetente) 
	{
		this.remetente = remetente;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public Email[] getCaixaDeSaida() 
	{
		return caixaDeSaida;
	}

	public void setCaixaDeSaida(Email[] caixaDeSaida) 
	{
		this.caixaDeSaida = caixaDeSaida;
	}

	public Email[] getCaixaDeEntrada() 
	{
		return caixaDeEntrada;
	}

	public void setCaixaDeEntrada(Email[] caixaDeEntrada) 
	{
		this.caixaDeEntrada = caixaDeEntrada;
	}

	public int getContadorEmail() 
	{
		return contadorEmail;
	}

	public void setContadorEmail(int contadorEmail) 
	{
		this.contadorEmail = contadorEmail;
	}

	public int getContadorEmailRecebido() 
	{
		return contadorEmailRecebido;
	}

	public void setContadorEmailRecebido(int contadorEmailRecebido) 
	{
		this.contadorEmailRecebido = contadorEmailRecebido;
	}

	public void writeEmail(Email mensagem) 
	{
		caixaDeSaida[contadorEmail] = mensagem;
		caixaDeSaida[contadorEmail].setRemetente(remetente);
		contadorEmail ++;
	}
	
	public void showInbox()
	{	
		System.out.println("Caixa de Entrada de: " + remetente);
		if(contadorEmailRecebido == 0) {
			System.out.println("Caixa de Entrada Vazia");
			System.out.println();
		}
		for(int i = 0; i < contadorEmailRecebido; i++) {
			System.out.println("Email " + (i + 1));
			System.out.println("Remetente: " + caixaDeEntrada[i].getRemetente());
			System.out.println("assunto: " + caixaDeEntrada[i].getAssunto());
			System.out.println("corpo: " + caixaDeEntrada[i].getCorpoEmail());
			System.out.println();
		}
		
	}

	/*
	 * metodos auxiliares
	 */
	
	public void insereEmail(Email email)
	{
		caixaDeEntrada[contadorEmailRecebido++] = email;
	}
	
	public void apagaCaixaSaida()
	{
		for (int i = contadorEmail; contadorEmail > 0; i--) {
			caixaDeSaida[i] = caixaDeSaida[i + 1];
			contadorEmail --;
		}
	}
	
}
