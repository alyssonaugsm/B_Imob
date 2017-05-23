package Apresentacao;
import java.util.Scanner;
import Sistema.*;

public class Menu {
	public void menuJogador(Jogador jogador, int nRodada){
		Scanner   ler  = new Scanner   (System.in);
		Jogo      jogo = new Jogo      ();
		Tabuleiro tab  = new Tabuleiro ();
		int controle   = 0;
		while( true ){
			System.out.println("========================================= Rodada  [" + nRodada +"]  \n" +
							   "========================================= Jogador [" + jogador.get_nome() +"]\n\n" +
			
	 				           "Informe o valor para a escolha desejada:                            \n" +
					           "[1] - Ver Saldo.                                                    \n" +
					           "[2] - Jogar dados.		                                            \n" +
					           "[3] - Lista de Imóveis adquiridos.									\n" +
					           "[4] - Comprar Imóvel.	 										    \n" +
					           "[5] - Pagar Alguel.													\n" +
					           "[6] - Rendimento dos Imóveis adquiridos.							\n" +
					           "[7] - Ver qual é a posição no tabuleiro.                            \n" +
					           "[8] - Passar a vez.													\n" );
			int opc = ler.nextInt(); //lendo o valor informado pelo usuário.
			if(opc == 1){
							jogador.print_saldo(); //consulta o saldo do jogador.
			} else if(opc == 2){
							jogo.dados(controle, jogador, Tabuleiro.listaPos.size());//chama a função de jogar dados.
							controle++;//seta o controle para o jogador não jogar os dados novamente nessa rodada.
			} else if(opc == 3){
							jogador.listaImoveis(); //verifica lista de imoveis.
			} else if(opc == 4){
							if(!Tabuleiro.listaPos.get(jogador.get_posAtual()).get_dono().equals(jogador.get_nome())){
								jogo.compraImovel(Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel(),
								Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorVenda(),
								jogador);
								Tabuleiro.listaPos.get(jogador.get_posAtual()).set_dono(jogador);
								System.out.println("Imóvel adquirido com sucesso!\n");
							} else if (!Tabuleiro.listaPos.get(jogador.get_posAtual()).get_dono().equals("Banco")){
								System.out.println("Outro jogador já comprou este imóvel! Impossível realizar a compra!\n");
							}	else {
								System.out.println("Impossível comprar, o imóvel já te pertence!\n");
							}
							
			} else if(opc == 5){
							jogo.pagaAluguel(Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel(),
									Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorAlugel(),
									jogador, Tabuleiro.listaPos.get(jogador.get_posAtual())); //pagar aluguel.
			} else if(opc == 6){
							jogador.rendimentoImovel(); //rendimento de imóveis.
			} else if(opc == 7){
							jogador.print_posAtual(); //ver posição.
			} else if(opc == 8){
							break; //passar a vez.
			} else {
				System.out.println("Valor inválido!\n\n");
			}
		}
	}
}