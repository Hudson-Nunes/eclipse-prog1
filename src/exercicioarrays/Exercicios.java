package exercicioarrays;
import teclado.Teclado;

public class Exercicios 
{

	public int exercicio4(int[] array)
	{
	       if(array == null) {
	            return -1;
	        }
	        
	        int contNegativos = 0;
	        for(int i = 0; i < array.length; i++) {
	            if(array[i] < 0) {
	                contNegativos++;
	            }
	        }
	        return contNegativos;
	}

    public int exercicio5(int[] array, int x)
    {
        if(array == null) {
            return -1;
        }
        
        int quantVezes = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == x) {
                quantVezes++;
            }
        }
        return quantVezes;
    }

    public boolean[] exercicio6(int[] a)
    {
        if(a == null) {
            return null;
        }
        
        boolean[] retorno = new boolean[a.length];
        for(int i = 0; i < a.length; i++) {
            if(a[i] <= 0) {
                retorno[i] = false;
            }else {
                retorno[i] = true;
            }
        }
        return retorno;
    }
    
    public int exercicio7(double[] array)
    {
        if(array == null){
            return -1;
        }
        
        int posicaoDoMaiorValor = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > array[posicaoDoMaiorValor]) {
                posicaoDoMaiorValor = i;
            }
        }
        return posicaoDoMaiorValor;
    }
    
    public double[] exercicio8()
    {
        double[] retorno = new double[Teclado.leInt("Digite o tamanho do array:")];
        
        for(int i=0; i<retorno.length; i++) {
            retorno[i] = Teclado.leDouble("Digite o valor da posição "+i+" do array:");
        }
        return retorno;
    }
}
