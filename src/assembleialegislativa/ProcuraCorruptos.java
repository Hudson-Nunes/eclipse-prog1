package assembleialegislativa;

public class ProcuraCorruptos
{
    private Deputado[] deputados;
    private int quantDeputados;

    public ProcuraCorruptos(int quantDeputados)
    {
        this.deputados = new Deputado[quantDeputados];
    }
    
    public Deputado[] getDeputados() 
    {
		return deputados;
	}

	public void setDeputados(Deputado[] deputados) 
	{
		this.deputados = deputados;
	}
	
	public Deputado[] deputadosComMaisFuncionarios()		//método que contém os deputados que possuem mais funcionários do que o estipulado 
    {
        Deputado[] retorno = new Deputado[deputados.length];
        
        for(int i=0; i < deputados.length; i++) {
            if(deputados[i].getFuncionarios().length > 10) {
                retorno[i] = deputados[i];
            }
        }
        return retorno;
    }
    
    public Deputado[] deputadosQueRecebemValores() //método que contém todos os deputados que fazem os funcionários (pelo menos 1) devolverem dinheiro
    {
        Deputado[] retorno = new Deputado[deputados.length];
        
        for(int i=0; i < deputados.length; i++) {
            for(int j=0; j < deputados[i].getFuncionarios().length; j++) {
                if(deputados[i].getFuncionarios()[j].getSalarioLiquido() < (deputados[i].getFuncionarios()[j].getSalarioBruto() * 0.7)) {
                    retorno[i] = deputados[i];
                }
            }
        }
        return retorno;
    }
    
    public Deputado[] deputadosQueDesviamVerbas() //método que contém todos os deputados que desviam verbas
    {
        Deputado[] retorno = new Deputado[deputados.length];
                
        for(int i=0; i < deputados.length; i++) {
           if(deputados[i].getSalarioLiquido() > (deputados[i].getSalarioBruto() * 0.8)) {
               retorno[i] = deputados[i];
           }
        }
        return retorno;
    }
    
}