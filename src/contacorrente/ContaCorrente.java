package contacorrente;

public class ContaCorrente
{
    
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }
    
    public ContaCorrente(int numeroConta, double saldo)
    {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    
    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public void imprimeInfo()
    {
        System.out.println();
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
    
    public void efetuaDeposito(double valorDeposito)
    {
        if (valorDeposito < 0) {
            System.out.println("ERRO! Não é possível depositar um valor negativo!");
            System.out.println();
        }else {
            this.saldo += valorDeposito;
            System.out.printf("Depósito realizado! Seu novo saldo é de R$ %.2f", saldo);
            System.out.println();
        }
    }
    
    public void efetuaSaque(double valorSaque)
    {
        if (valorSaque < 0) {
            System.out.println("ERRO! Não é possível sacar um valor negativo!");
            System.out.println();
        }else if(saldo < 0) {
            System.out.println("ERRO! Saldo insuficiente para saque no momento!");
            System.out.println();
        }else {
            this.saldo -= valorSaque;
            System.out.printf("Saque realizado! Seu novo saldo é de R$ %.2f", saldo);
            System.out.println();
        }
    }

	public String toString()
	{
        String retorno = "Número da conta: " + numeroConta;
        retorno += "\n";
        retorno += "Saldo da conta: " + saldo;
        retorno += "\n";
        return retorno;
    }

}
