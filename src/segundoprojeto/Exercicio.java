package segundoprojeto;
import teclado.Teclado;

public class Exercicio
{
    //opção 1 - soma
    static void soma(){
        int x = Teclado.leInt("digite o primeiro valor inteiro:");
        int y = Teclado.leInt("digite o segundo valor inteiro:");
        int resultadoSoma = x + y;
        System.out.println("Soma = "+ resultadoSoma);
    }
    
    //opção 2 - divide
    static void divide(){
        int x = Teclado.leInt("digite o primeiro valor inteiro:");
        int y = Teclado.leInt("digite o segundo valor inteiro:");
        int resultadoDivide = x / y;
        System.out.println("Divisão = "+ resultadoDivide);
        
        if(y == 0){
            System.out.println("ERRO! Divisor não pode ser 0.");
        }
    }
    
    // opção 3 - verifica triângulo
    static void verificaTriangulo(){
        int x = Teclado.leInt("digite o primeiro lado do triângulo:");
        int y = Teclado.leInt("digite o segundo lado do triângulo:");
        int z = Teclado.leInt("digite o terceiro lado do triângulo:");
    
        if(x < y + z || y < x + z || z < x + y){
            if(x == y || x == z || y == z){
                System.out.println("O triângulo é isóceles.");
            }
            else if(x == y && x == z){
                System.out.println("O triângulo é equilátero.");
            }
            else{
                System.out.println("O triângulo é escaleno.");
            }
        }
        else{
            System.out.println("Não é um triângulo.");
        }
    }
    
    // opção 4 - verifica idade
    static void verificaIdade(){
        int x = Teclado.leInt("digite uma idade entre 0 e 120:");
        
        if(x < 0){
            System.out.println("ERRO! Não existe idade negativa.");
        }
        else if(x >= 0 && x <= 12){
            System.out.println("criança");
        }
        else if(x >= 13 && x <= 18){
            System.out.println("adolescente");
        }
        else if(x >= 19 && x <= 120){
            System.out.println("adulto");
        }
        else{
            System.out.println("ERRO! Não há alguém com mais de 120 anos.");
        }
    }
    
    // opção 5 - sinaleira
    static void sinaleira(){
        String cor = Teclado.leString("digite uma cor:");
        
        if(cor.equalsIgnoreCase("verde")){
            System.out.println("aberta");
        }
        else if(cor.equalsIgnoreCase("vermelho")){
            System.out.println("fechada");
        }
        else if(cor.equalsIgnoreCase("amarelo")){
            System.out.println("atenção");
        }
        else{
            System.out.println("ERRO!");
        }
    }
    
    // opção 6 - conta até 300
    static void contador(){
        int x = Teclado.leInt("digite um valor inteiro:");
        
        for(int i = x;i <= 300; i++){
            System.out.println(i + " ");
        }
    }
    
    // opção 7 - verifica primo
    static void verificaPrimo(){
        int x = Teclado.leInt("digite um valor inteiro:");
        int numeroDivisores = 0;
        
        for(int i = 1; i <= x; i++){
            if(x % i == 0){
                numeroDivisores++;
            }
        }
        
        if(numeroDivisores == 2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
    // opção 8 - achar maior
    static void achaMaior(){
        int x = Teclado.leInt("digite o primeiro número inteiro:");
        int y = Teclado.leInt("digite o segundo número inteiro:");
        int z = Teclado.leInt("digite o terceiro número inteiro:");
        
        if(x > y && x > z){
            System.out.println(x);
        }
        else if(y > x && y > z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
    
    // opção 9 - imprime pares
    static void imprimePares(){
        int x = Teclado.leInt("digite um valor inteiro:");
        
        for(int i = 0; i <= x; i++){
            System.out.println(i + " ");
        }
    }
    
    public static void main(String[] args){
        
       int opcao = 100;
        
        while(opcao > 0 && opcao < 10){
        System.out.println();
        System.out.println("Olá, seja bem vindo ao PRIMEIRO programa em JAVA!!!");
        System.out.println();
        
        System.out.println("Selecione uma opção:");
        System.out.println("1.soma");
        System.out.println("2.divide");
        System.out.println("3.verifica triângulo");
        System.out.println("4.verifica idade");
        System.out.println("5.sinaleira");
        System.out.println("6.conta até 300");
        System.out.println("7.verifica primo");
        System.out.println("8.achar maior");
        System.out.println("9.imprime pares");
        System.out.println();
        
        opcao = Teclado.leInt("escolha uma opção (ou digite 0 para sair):");
        
        if(opcao == 1){
            soma();
        }
        else if(opcao == 2){
            divide();
        }
        else if(opcao == 3){
            verificaTriangulo();
        }
        else if(opcao == 4){
            verificaIdade();
        }
        else if(opcao == 5){
            sinaleira();
        }
        else if(opcao == 6){
            contador();
        }
        else if(opcao == 7){
            verificaPrimo();
        }
        else if(opcao == 8){
            achaMaior();
        }
        else if(opcao == 9){
            imprimePares();
        }
       }
       
       System.out.println();
       System.out.println("Até logo!");
    }
}
