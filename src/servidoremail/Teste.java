package servidoremail;

public class Teste 
{
	public static void main(String[] args) 
	{
		CaixaPostal cpCarlos = new CaixaPostal("carlos@unisinos.br");
		CaixaPostal cpEduardo = new CaixaPostal("eduardo@unisinos.br");
		CaixaPostal cpJonas = new CaixaPostal("jonas@unisinos.br");
		
		Servidor ser = new Servidor();
		ser.add(cpCarlos);
		ser.add(cpEduardo);
		ser.add(cpJonas);
		
		cpCarlos.writeEmail(new Email("eduardo@unisinos.br", "teste", "isto eh um teste"));
		System.out.println();
		cpEduardo.writeEmail(new Email("carlos@unisinos.br", "oi", "tudo bem?"));
		System.out.println();
		cpJonas.writeEmail(new Email("carlos@unisinos.br", "projeto", "tenho proposta de projeto"));
		
		//ser.sendReceive();
		
		cpCarlos.showInbox();
		cpEduardo.showInbox();
		cpJonas.showInbox();	
	}

}
