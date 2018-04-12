package exercicioarrays;
import teclado.Teclado;

public class Teste 
{
	public static void main(String[] args) 
	{
		/** EXERCICIO 1 
		 *  Para cada conjunto de valores, escreva o código Java, usando laço(s), que preencha um array
        **/
		
        //a) 10 9 8 7 6 5 4 3 2 1
		
		int[] a = new int[10];
        
        for(int i = 0; i < a.length; i++) {
            a[i] = (10 - i);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
      //b) 0 1 4 9 16 25 36 49 64 81 100
        
        int[] b = new int[11];
        
        System.out.println();
        for(int i = 0; i < b.length; i++) {
            b[i] = i * i;
            System.out.print(b[i] + " ");            
        }
        System.out.println();
       
      //c) 1 2 3 4 5 10 20 30 40 50 
        
        int[] c = new int[9];
        int x = 10;
        
        System.out.println();
        for(int i = 0; i < c.length; i++) {
            if(i < 5) {
                c[i] = i + 1;
                System.out.print(c[i] + " ");
            }else {
                c[i] = x;
                x += 10;
                System.out.print(x + " ");
            }
        }
        System.out.println();
        
      //d) 3 4 7 12 19 28 39 52 67 84 
        
        int[] d = new int[10];
        
        System.out.println();
        for(int i = 0; i < d.length; i++) {
            d[i] = (i * i) + 3;
            System.out.print(d[i] + " ");
        }
        System.out.println();
        
        /** EXERCICIO 2 
         *  Escreva um trecho Java que exiba os valores de um array a double numa mesma linha
        **/ 
        
        double[] ex2 = {1.4, 4.3, 6.5, 0.7, -0.3};
        
        System.out.println();
        for(Double num: ex2) {
            System.out.print(num + " ");
        }
        System.out.println();  
        
        /** EXERCICIO 3 
         *  Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num array d
        **/
        
        double[] ex3 = new double[10];
        
        System.out.println();
        for(int i = 0; i < ex3.length; i++) {
            ex3[i] = Teclado.leDouble("Digite um double:");
        }
        System.out.println();
        
        /** TESTANDO EXERCÍCIOS - 4 ao 8 **/
        
        Exercicios e = new Exercicios();
        
        /** EXERCICIO 4 
         *  Crie um metodo que recebe um array de inteiros e retorna a quantidade de elementos do array que sao numeros negativos 
        **/
        
        int[] arrayEx4 = new int[20];
        
        for(int i = 0; i < arrayEx4.length; i++) {
            arrayEx4[i] = Teclado.leInt("Digite um inteiro:");
        }
        
        int retornoEx4 = e.exercicio4(arrayEx4);
        System.out.println("Retorno do exercício 4: " + retornoEx4);
       
        
        /** EXERCICIO 5 
         * Crie um metodo que recebe um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a 
        **/
        
        int retornoEx5 = e.exercicio5(arrayEx4, Teclado.leInt("Digite o valor a procurar:"));
        System.out.println("Retorno do exercício 5: "+retornoEx5);
        
        /* EXERCICIO 6 
         * Escreva um metodo que recebe um array de inteiros a e devolve um array de boolean onde, cada posição indique true se o elemento da posição corresponde de a é positivo e false caso seja negativo ou zero 
        **/
        
        boolean[] retornoEx6 = e.exercicio6(arrayEx4);
        System.out.println("Retorno do exercício 6:");
        
        for(int i = 0; i < retornoEx6.length; i++){
            System.out.print(retornoEx6[i]+" - ");
        }
        System.out.println(); 
        
        /* EXERCICIO 7 
         * Escreva um metodo que recebe um array de números e devolve a posicao onde se encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira ocorrencia 
        **/
        
        double[] arrayEx7 = new double[10];
        
        for(int i = 0; i < arrayEx7.length; i++) {
            arrayEx7[i] = Teclado.leDouble("Digite um double:");
        }
        
        int retornoEx7 = e.exercicio7(arrayEx7);
        System.out.println("Retorno do exercício 7: " + retornoEx7);
        
        
        /* EXERCICIO 8 
         * Faca um metodo que devolve um array de números lidos do teclado 
        **/
        
        double[] retornoEx8 = e.exercicio8();
        
        for(int i = 0; i < retornoEx8.length; i++) {
            System.out.print(retornoEx8[i]+" - ");
        }
        System.out.println();
        
	}

}
