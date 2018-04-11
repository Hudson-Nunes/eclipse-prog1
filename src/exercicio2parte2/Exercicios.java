package exercicio2parte2;
import teclado.Teclado;

public class Exercicios
{

    public void imprimeValores(int x)
    {
        if(x > 0) {
            for(int i = 0; i <= x; i++) {
                System.out.println(i);
            }
        }
        else if (x < 0) {
            for(int i = 0; i >= x; i--) {
                System.out.println(i);
            }
        }else {
            System.out.println(x);
        }
    }

    public double maiorValorDoisValores(double a, double b)
    {
       if(a > b) {
           return a;
       }else {
           return b;
       }
    }
    
    public double maiorValorTresValores(double c, double d, double e)
    {
        if(c > d && c > e) {
            return c;
        }
        else if(d > c && d > e) {
            return d;
        }else {
            return e;
        }
    }
    
    public boolean verificaPositivo(int x)
    {
        if(x > 0) {
            return true;
        }else {
            return false;
        }
    }
    
    public int calculaFatorial(int x)
    {
        if(x > 0) {
            int fatorial = 1;
            for(int i = 1; i <= x; i++) {
                fatorial *= i;   
            }
                   
            return fatorial;
        }else {
            return -1;
        }
    }
    
    public double mediaValores(int x)
    {
        double mediaValores = 0;
        if(x > 0) {
            double soma = 0;
            for(int i = 0;i < x; i++) {
                double valores = Teclado.leDouble("digite " + x + " valores para calcular a média: ");
                soma += valores;
            }
            System.out.println();
            mediaValores = (soma / x);
        }
        else if (x <= 0) {
            return -1;
        }
        return mediaValores;
    }
    
}
