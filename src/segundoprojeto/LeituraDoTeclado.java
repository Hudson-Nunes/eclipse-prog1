package segundoprojeto;
import teclado.Teclado;

public class LeituraDoTeclado{
    //método main
    public static void main(String[] args){
        //INTEIRO
        int x = Teclado.leInt("Digite um valor inteiro:");
        System.out.println("O valor digitado foi "+x);
        
        if(x > 0){
            System.out.println("Valor é positivo!");
            for(int i=x; i<=1000; i++)
                System.out.println("i = "+i);
        }
        else if(x < 0)
            System.out.println("Valor é negativo!");
        else
            System.out.println("Valor é zero");
        
        //DOUBLE
        double d = Teclado.leDouble("Digite um valor double positivo:");
        while(d < 0)
            d = Teclado.leDouble("Digite um valor double positivo:");

        System.out.println("O valor digitado foi "+d);
        
        //STRING
        String s = Teclado.leString("Digite um texto:");
        System.out.println("O valor digitado foi "+s);
        
        //CHAR
        char c = Teclado.leChar("Digite um caractere:");
        System.out.println("O valor digitado foi "+c);
    }
}