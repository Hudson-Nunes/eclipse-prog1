package primeiroprojeto;

public class TesteVariaveis
{
    public static void main(String[] args)
    {
        int v1 = 5;
        int v2 = 10;
        int soma = v1 + v2;
        System.out.println("Resultado da soma: "+soma);
        
        double d1, d2, d3;
        d1 = 9.7;
        d2 = -90.4;
        d3 = 0.4534;
        double mult = d1*d2*d3;
        String conc = "Valor é: "+mult;
        System.out.println("O valor multiplicado é:"+mult+"!");
        
        String t1 = "Texto 1";
        String t2 = "Texto 2";
        
        System.out.println(t1);
        System.out.println(t2);
        
        char c = 'K';
        System.out.println(c);
    }
    
}