package cadastroaeronaves;
import teclado.Teclado;

public class Teste 
{

	public static void main(String[] args) 
	{
		int opcao = 0;
		AeronavePassageiros aeronavePass;
		AeronaveCarga aeronaveCarga;
		Fabricante fabricanteA;
		CadastroAeronaves cA = new CadastroAeronaves();
		CadastroFabricante cF = new CadastroFabricante();
		
		while (opcao != 3) {
			System.out.println("MENU PRINCIPAL:");
			System.out.println("1-Cadastro de Aeronaves");
			System.out.println("2-Cadastro de Fabricantes");
			System.out.println("3-Sair do programa");
			System.out.println();
			
			opcao = Teclado.leInt("Digite a opção escolhida: ");
			
			if (opcao == 1) {
				int opcaoA = 0;
				while (opcaoA != 5) {
					System.out.println(" ");
					System.out.println("CADASTRO DE AERONAVES");
					System.out.println("1-Inserir Aeronave");
					System.out.println("2-Remover Aeronave");
					System.out.println("3-Mostrar Elementos");
					System.out.println("4-Pesquisar Elementos");
					System.out.println("5-Voltar para Menu Principal");
					System.out.println();
					
					opcaoA = Teclado.leInt("Digite a opção escolhida: ");
					
					if (opcaoA == 1) {
						int opcaoAA = 0;
						while (opcaoAA != 3) {
							System.out.println("INSERIR AERONAVE");
							System.out.println("1-Aeronave de Passageiros");
							System.out.println("2-Aeronave de Carga");
							System.out.println("3-Voltar para o menu de aeronaves");
							System.out.println();
							
							opcaoAA = Teclado.leInt("Digite a sua escolha: ");
							
							if (opcaoAA == 1){
								aeronavePass = new AeronavePassageiros(Teclado.leString("Modelo: "), Teclado.leString("Matrícula: "), Teclado.leInt("Código Internacional: "), 
										Teclado.leInt("Quantidade de Assentos: "), Teclado.leString("Companhia Aérea: "), Teclado.leString("Número do Voo: "));
								cA.insereAeronave(aeronavePass);
							}
							else if (opcaoAA == 2){
								aeronaveCarga = new AeronaveCarga (Teclado.leString("Modelo: "), Teclado.leString("Matrícula: "), Teclado.leInt("Código Internacional: "), 
										Teclado.leInt("Capacidade de Carga: "));
								cA.insereAeronave(aeronaveCarga);
								
							}
						}
					}
					else if (opcaoA == 2) {
						int opcaoAB = 0;
						while (opcaoAB != 3){
							System.out.println("Digite 1 para remover por código internacional: ");
							System.out.println("Digite 2 para remover por matrícula: ");
							System.out.println();
							
							opcaoAB = Teclado.leInt("Digite sua escolha: ");
							
							if (opcaoAB == 1){
								cA.removeAeronave(Teclado.leInt("Código Internacional: "));
							}
							else if (opcaoAB == 2){
								cA.removeAeronave(Teclado.leString("Matrícula: "));
							}
						}
					}
					else if (opcaoA == 3) {
						cA.mostraElementos();
					}
					else if (opcaoA == 4) {
						cA.pesquisaElemento(Teclado.leInt("Código a ser pesquisado: "));
					}
				}
			}
			else if (opcao == 2){
				int opcaoB = 0;
				while (opcaoB != 5){
					System.out.println(" ");
					System.out.println("CADASTRO DE FABRICANTES");
					System.out.println("1-Inserir Fabricante");
					System.out.println("2-Remover Fabricante");
					System.out.println("3-Mostrar Elementos");
					System.out.println("4-Pesquisar Elementos");
					System.out.println("5-Voltar para Menu Principal");
					opcaoB = Teclado.leInt("Digite a opçãoo escolhida: ");
					
					if (opcaoB == 1){
						fabricanteA = new Fabricante(Teclado.leString("Nome do fabricante: "), Teclado.leInt("Código Internacional: "));
						cF.insereFabricante(fabricanteA);
					}
					else if (opcaoB == 2){
						cF.removeFabricante(Teclado.leInt("Código do Fabricante a ser deletado: "));
					}
					else if (opcaoB == 3){
						cF.mostraElementos();
					}
					else if (opcaoB == 4){
						cF.pesquisaElemento(Teclado.leInt("Código do Fabricante a ser pesquisado: "));
					}
				}
			}
			else if (opcao == 3) {
				opcao = 3;
				System.out.println("Até logo!");
			}
		}
	}
}