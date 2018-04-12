package criptografia;

public class Teste 
{
	public static void main(String[] args) 
	{
		
		Cripto c = new Cripto();
		
		String mensagemCifra = c.cifraMensagem("Unisinos1234");	
		String mensagemDecifra = c.decifraMensagem(mensagemCifra);
		
		System.out.println(mensagemCifra);
		System.out.println();
		System.out.println(mensagemDecifra);

	}

}
