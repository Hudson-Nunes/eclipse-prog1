package contacorrente;
import teclado.Teclado;

public class Principal
{
    public static void main(String[] args)
    {
    
        int numeroConta = Teclado.leInt("digite o número da conta - 5 dígitos: ");
        
        double saldo = Teclado.leDouble("digite o saldo atual da conta: ");
       
        ContaCorrente cc = new ContaCorrente(numeroConta, saldo);
        
        int n = 0;
        
        while(n != 4) {
            System.out.println();
            System.out.println("------------------");
            System.out.println("SISBANK versão 2.1");
            System.out.println("------------------");
            System.out.println("[1] - Efetuar saque");
            System.out.println("[2] - Efetuar depósito");
            System.out.println("[3] - Imprimir informações da conta");
            System.out.println("[4] - Sair do menu");
            
            System.out.println();
            int opção = Teclado.leInt("digite a opção desejada: ");
           
            if(opção == 1) {
                cc.efetuaSaque(Teclado.leDouble("digite o valor que você deseja sacar: "));
            }
            else if(opção == 2) {
                cc.efetuaDeposito(Teclado.leDouble("digite o valor que você deseja depositar: "));
            }
            else if(opção == 3) {
                cc.imprimeInfo();
            }
            else if(opção == 4) {
                n = 4;
                System.out.println();
                System.out.println("Obrigado! Volte sempre!");
            }
        }
        
        String endereço;
        double valorVenda, valorAluguel;
        
        System.out.println();
        endereço = Teclado.leString("digite o endereço do imóvel 1: ");
        valorVenda = Teclado.leDouble("digite valor de venda do imóvel 1: ");
        valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 1: ");
        while(valorVenda < 0 || valorAluguel < 0){
            valorVenda = Teclado.leDouble("digite valor de venda do imóvel 1: ");
            valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 1: ");
        }
        
        Imovel imovel1 = new Imovel(endereço, valorVenda, valorAluguel);
        imovel1.calculaImposto();
        System.out.println();
        
        System.out.println();
        endereço = Teclado.leString("digite o endereço do imóvel 2: ");
        valorVenda = Teclado.leDouble("digite valor de venda do imóvel 2: ");
        valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 2: ");
        while(valorVenda < 0 || valorAluguel < 0){
            valorVenda = Teclado.leDouble("digite valor de venda do imóvel 2: ");
            valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 2: ");
        }
        
        Imovel imovel2 = new Imovel(endereço, valorVenda, valorAluguel);
        imovel2.calculaImposto();
        System.out.println();
        
        System.out.println();
        endereço = Teclado.leString("digite o endereço do imóvel 3: ");
        valorVenda = Teclado.leDouble("digite valor de venda do imóvel 3: ");
        valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 3: ");
        while(valorVenda < 0 || valorAluguel < 0){
            valorVenda = Teclado.leDouble("digite valor de venda do imóvel 3: ");
            valorAluguel = Teclado.leDouble("digite o valor de aluguel do imóvel 3: ");
        }
        
        Imovel imovel3 = new Imovel(endereço, valorVenda, valorAluguel);
        imovel3.calculaImposto();
        System.out.println();
        
        imovel1.imprimeInfo();
        imovel2.imprimeInfo();
        imovel3.imprimeInfo();
        
        int[] arrayNumeros = new int[10];

        System.out.println();
        for(int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = Teclado.leInt("digite número inteiro: ");
        }
        
        System.out.println();
        for(int i = 0; i < arrayNumeros.length; i++) {
        		System.out.print(arrayNumeros[i] + " ");
        }

        int maior = 0;
        
        System.out.println();
        for(int i = 0; i < arrayNumeros.length; i++) {
            if(arrayNumeros[i] > maior) {
                maior = arrayNumeros[i];
            }
        }

        System.out.println();
        System.out.println(maior);
        
    }
    
}
