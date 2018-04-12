package pedrapapeltesouraspock;
import teclado.Teclado;

public class PedraSpock
{
    public static void main(String[] args)
    {
        
        Jogador jogador1 = new Jogador(Teclado.leString("Digite o seu nome jogador 1: "));
        Jogador jogador2 = new Jogador(Teclado.leString("Digite o seu nome jogador 2: "));
        System.out.println();

        boolean continuarJogo = true;
        
		int vitoriaJogador1 = 0;
		int vitoriaJogador2 = 0;
		int empate = 0;
		int numeroVitorias1 = 0;
		int numeroVitorias2 = 0;
		int empates = 0;
		
        while (continuarJogo) {
        
           	String jogada1 = null;
           	String jogada2 = null;
                                
           	jogada1 = Teclado.leString(jogador1.getNome() + ", selecione a sua jogada dentra as opções possíveis - Pedra, papel, tesoura, lagarto ou spock: ");
                
           	while((jogador1.digitaCorreto(jogada1))) {
           		jogada1 = Teclado.leString(jogador1.getNome() + ", selecione a sua jogada dentra as opções possíveis - Pedra, papel, tesoura, lagarto ou spock: ");
            	}
           
           	jogada2 = Teclado.leString(jogador2.getNome() + ", selecione a sua jogada dentra as opções possíveis - Pedra, papel, tesoura, lagarto ou spock: ");
           	System.out.println();

           	while((jogador2.digitaCorreto(jogada2))) {
           		jogada2 = Teclado.leString(jogador2.getNome() + ", selecione a sua jogada dentra as opções possíveis - Pedra, papel, tesoura, lagarto ou spock: ");
          	 }
           
            //lógica do jogo
           
			if(jogada1.equalsIgnoreCase("pedra")) {
            		if(jogada2.equalsIgnoreCase("tesoura") || jogada2.equalsIgnoreCase("lagarto")) {
            			vitoriaJogador1++;            
            		}else if(jogada2.equalsIgnoreCase("papel") || jogada2.equalsIgnoreCase("spock")) {
            			vitoriaJogador2++;
            		}else if(jogada2.equalsIgnoreCase("pedra")) {
            			empate++;                
            		}
        		}
			else if(jogada1.equalsIgnoreCase("papel")) {
				if(jogada2.equalsIgnoreCase("pedra") || jogada2.equalsIgnoreCase("spock")) {
            			vitoriaJogador1++;            
				}else if(jogada2.equalsIgnoreCase("tesoura") || jogada2.equalsIgnoreCase("lagarto")) {
            			vitoriaJogador2++;
            		}else if(jogada2.equalsIgnoreCase("papel")) {
            			empate++;                
            		}
			}
			else if(jogada1.equalsIgnoreCase("tesoura")) {
           	 	if(jogada2.equalsIgnoreCase("papel") || jogada2.equalsIgnoreCase("lagarto")) {
           	 		vitoriaJogador1++;            
           	 	}else if(jogada2.equalsIgnoreCase("spock") || jogada2.equalsIgnoreCase("pedra")) {
           	 		vitoriaJogador2++;
           	 	}else if(jogada2.equalsIgnoreCase("tesoura")) {
           	 		empate++;                
            		}
			}
        		else if(jogada1.equalsIgnoreCase("lagarto")) {
        			if(jogada2.equalsIgnoreCase("spock") || jogada2.equalsIgnoreCase("papel")) {
        				vitoriaJogador1++;            
        			}else if(jogada2.equalsIgnoreCase("tesoura") || jogada2.equalsIgnoreCase("pedra")) {
        				vitoriaJogador2++;
        			}else if(jogada2.equalsIgnoreCase("lagarto")) {
        				empate++;                
        			}
			}
			else if(jogada1.equalsIgnoreCase("spock")) {
            		if(jogada2.equalsIgnoreCase("pedra") || jogada2.equalsIgnoreCase("tesoura")) {
            			vitoriaJogador1++;            
            		}else if(jogada2.equalsIgnoreCase("papel") || jogada2.equalsIgnoreCase("lagarto")) {
            			vitoriaJogador2++;
            		}else if(jogada2.equalsIgnoreCase("spock")) {
            		empate++;                
            		}
			}	
			
			numeroVitorias1 += vitoriaJogador1;
			numeroVitorias2 += vitoriaJogador2;
			empates += empate;
		    // pergunta aos jogadores se querem jogar novamente

           	String continuar = Teclado.leString("desejam jogar novamente? sim ou não?");
           	System.out.println();

           	if(continuar.equalsIgnoreCase("sim")) {
            	   continuarJogo = true;
           	}else {
            	   continuarJogo = false;
           	}
        }

		// imprima o ganhador do jogo (aquele que obteve mais vitórias)
	
		if(numeroVitorias1 > numeroVitorias2 && numeroVitorias1 > empates) {
			System.out.println("Vitória do jogador " + jogador1.getNome() + " !");
		}
		else if(numeroVitorias2 > numeroVitorias1 && numeroVitorias2 > empates) {
			System.out.println("Vitória do jogador " + jogador2.getNome() + " !");
		}
		else if(empates > numeroVitorias1 && empates > numeroVitorias2) {
			System.out.println("Deu empate mais vezes!");
		}
	}
    
}