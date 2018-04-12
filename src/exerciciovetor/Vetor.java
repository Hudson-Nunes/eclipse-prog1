package exerciciovetor;

public class Vetor 
{

	int [] vet;
	int tot, tam;
	
	public Vetor(int tam)
	{
		this.vet = new int[tam];
		this.tot = 0;
		this.tam = tam;
	}
	
	//acrescenta ocorrencia
	
	public boolean addValue(int valor)
	{
		if(isFull()) {
			return false;
		}else {
			vet[tot++] = valor;
			return true;
		}
	}
	
	//remove primeira ocorrencia
	
	public boolean delValue(int valor){ 
		if(contains(valor) > 0) {
			compacta(posValor(valor));
			return true;
		}
		return false;
	}
	
	//remove todas ocorrencias
	
	public boolean delAllValues(int valor){ 
		if(contains(valor) == 0) {
			return false;
		}else {
			while(contains(valor) > 0) {
				compacta(posValor(valor));
			}
			return true;
		}
	}	
	
	//remove da posicao
	
	public boolean delPos(int posicao){ 
		if(posicao >= tot) {
			return false;
		}else {
			compacta(posicao);
			return true;
		}
	}	
	
	//retorna quantas ocorrencias de valor existem no vetor
	
	public int contains(int valor)
	{ 
		int contador = 0;
		for(int i = 0; i < tot; i++) {
			if(vet[i] == valor) {
				contador++;
			}
		}
		return contador;                   
	}
	
	//mostra todos elementos do vetor
	
	public void show()
	{		
		System.out.println();
		for(int i = 0; i < tot; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
	}
	
	
	/*
	 *   métodos auxiliares  .....................................................
	 */
	
	//verifica se array esta cheio
	
	public boolean isFull()
	{
		return(tot == tam);
	}
	
	//realiza a compactacao do vetor
	
	public void compacta(int pos)
	{
		for(int i = pos; i < tot - 1; i++) {
			vet[i] = vet[i + 1];
		}
		tot--;
	}

	//retorna a posicao (indice) do elemento valor dentro do vetor
	
	public int posValor(int valor)
	{
		for(int i = 0; i < tot; i++) {
			if(vet[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
}
