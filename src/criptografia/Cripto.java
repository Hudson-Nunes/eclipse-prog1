package criptografia;

public class Cripto 
{
	public static String cifraMensagem(String mensagem) 
	{
		String stringOriginal = mensagem;
		int contador = 0;
		int tamanhoMensagem = 0;

		//tamanho adaptado para multiplo de 6
		
		//String stringAlterada = stringOriginal + "abcdefghijklmnopqrstuvxzwy".substring(0, 4);
		
		//transforma em char		
		
		char[] m = new char[stringOriginal.length()];
		
		for(int i = 0;  i < stringOriginal.length();i++) {
			m[i] = stringOriginal.charAt(i);
		}
		
		//muda chars

		for(int i = 0;  i < stringOriginal.length(); i++) {
			if(contador == 0) {
				m[i] = (char)(m[i] + 2);
			}
			else if (contador == 1) {
				m[i] = (char)(m[i] + 5);
			}
			else if(contador == 2) {
				m[i] = (char)(m[i] + 7);
			}else {
				contador = 0;
				m[i] = (char)(m[i] + 2);
			}
			contador++;
		}
		
		//troca os pares 
		
		if(stringOriginal.length() % 2 == 0) {
			for(int i = 0; i< stringOriginal.length(); i = i + 2) {
				char temp = 0;
				temp = m[i];
				m[i] = m[i + 1];
				m[i + 1] = temp;
			}
		}else {
			tamanhoMensagem = stringOriginal.length() - 1;
			for(int i = 0; i < tamanhoMensagem; i = i + 2) {
				char temp = 0;
				temp = m[i];
				m[i] = m[i + 1];
				m[i + 1] = temp;
			}
		}
		
		//troca os grupos
		
		if(stringOriginal.length() % 6 == 0) {
			for (int i = 0; i< stringOriginal.length(); i = i + 6) {
				char temp1 = 0; 
				char temp2 = 0;
				char temp3 = 0;
				char temp4 = 0;
				temp1 = m[i];
				temp2 = m[i + 1];
				temp3 = m[i + 4];
				temp4 = m[i + 5];
				m[i] = m[i + 2];
				m[i + 1] = m[i + 3];
				m[i + 2] = temp3;
				m[i + 3] = temp4;
				m[i + 4] = temp1;
			    m[i + 5] = temp2;
			}
		}else {
			tamanhoMensagem = stringOriginal.length() - 5;
			for (int i = 0; i< tamanhoMensagem; i = i + 6) {
				char temp1 = 0; 
				char temp2 = 0;
				char temp3 = 0;
				char temp4 = 0;
				temp1 = m[i];
				temp2 = m[i + 1];
				temp3 = m[i + 4];
				temp4 = m[i + 5];
				m[i] = m[i + 2];
				m[i + 1] = m[i + 3];
				m[i + 2] = temp3;
				m[i + 3] = temp4;
				m[i + 4] = temp1;
				m[i + 5] = temp2;
			}
		}
		
		String stringCifrada = "";
		for(int i = 0; i < stringOriginal.length(); i++) {
			stringCifrada += m[i];
		}
		
		return stringCifrada;
	} 


	public String decifraMensagem(String mensagem) 
	{
		String stringCifrada = mensagem;
		int contador = 0;
		int tamanhoMensagem = 0;
		
		char[] m = new char[mensagem.length()];
		
		for(int i = 0; i < stringCifrada.length(); i++) {
			m[i] = stringCifrada.charAt(i);
		}
				
		//desfaz a troca dos grupos
		
		if(stringCifrada.length() % 6 == 0) {
			for (int i = 0; i< stringCifrada.length(); i = i + 6) {
				char temp1 = 0; 
				char temp2 = 0;
				char temp3 = 0;
				char temp4 = 0;
				temp1 = m[i];
				temp2 = m[i + 1];
				temp3 = m[i + 2];
				temp4 = m[i + 3];
				m[i] = m[i + 4];
				m[i + 1] = m[i + 5];
				m[i + 2] = temp1;
				m[i + 3] = temp2;
				m[i + 4] = temp3;
			    m[i + 5] = temp4;
			}
		}else {
			tamanhoMensagem = stringCifrada.length() - 5;
			for (int i = 0; i< tamanhoMensagem; i = i + 6) {
				char temp1 = 0; 
				char temp2 = 0;
				char temp3 = 0;
				char temp4 = 0;
				temp1 = m[i];
				temp2 = m[i + 1];
				temp3 = m[i + 2];
				temp4 = m[i + 3];
				m[i] = m[i + 4];
				m[i + 1] = m[i + 5];
				m[i + 2] = temp1;
				m[i + 3] = temp2;
				m[i + 4] = temp3;
			    m[i + 5] = temp4;
			}
		}
		
		//destroca os pares 
		
		if(stringCifrada.length() % 2 == 0) {
			for(int i = 0; i< stringCifrada.length(); i = i + 2) {
				char temp = 0;
				temp = m[i + 1];
				m[i + 1] = m[i];
				m[i] = temp;
			}
		}else {	
			tamanhoMensagem = stringCifrada.length() - 1;
			for(int i = 0; i < tamanhoMensagem; i = i + 2) {
				char temp = 0;
				temp = m[i + 1];
				m[i + 1] = m[i];
				m[i] = temp;
			}
		}
				
		//desfaz mudança chars

		for(int i = 0;  i < stringCifrada.length(); i++) {
			if(contador == 0) {
				m[i] = (char)(m[i] - 2);
			}
			else if (contador == 1) {
				m[i] = (char)(m[i] - 5);
			}
			else if(contador == 2) {
				m[i] = (char)(m[i] - 7);
			}else {
				contador = 0;
				m[i] = (char)(m[i] - 2);
			}
			contador++;
		}
		
		String stringDecifrada = "";
		for(int i = 0; i < stringCifrada.length(); i++) {
			stringDecifrada += m[i];
		}
		
		return stringDecifrada;
	}

}