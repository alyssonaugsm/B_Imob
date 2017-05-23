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
					           "[3] - Lista de Im�veis adquiridos.									\n" +
					           "[4] - Comprar Im�vel.	 										    \n" +
					           "[5] - Pagar Alguel.													\n" +
					           "[6] - Rendimento dos Im�veis adquiridos.							\n" +
					           "[7] - Ver qual � a posi��o no tabuleiro.                            \n" +
					           "[8] - Passar a vez.													\n" );
			int opc = ler.nextInt(); //lendo o valor informado pelo usu�rio.
			if(opc == 1){
							jogador.print_saldo(); //consulta o saldo do jogador.
			} else if(opc == 2){
							jogo.dados(controle, jogador, Tabuleiro.listaPos.size());//chama a fun��o de jogar dados.
							controle++;//seta o controle para o jogador n�o jogar os dados novamente nessa rodada.
			} else if(opc == 3){
							jogador.listaImoveis(); //verifica lista de imoveis.
			} else if(opc == 4){
							if(!Tabuleiro.listaPos.get(jogador.get_posAtual()).get_dono().equals(jogador.get_nome())){
								jogo.compraImovel(Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel(),
								Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorVenda(),
								jogador);
								Tabuleiro.listaPos.get(jogador.get_posAtual()).set_dono(jogador);
								System.out.println("Im�vel adquirido com sucesso!\n");
							} else if (!Tabuleiro.listaPos.get(jogador.get_posAtual()).get_dono().equals("Banco")){
								System.out.println("Outro jogador j� comprou este im�vel! Imposs�vel realizar a compra!\n");
							}	else {
								System.out.println("Imposs�vel comprar, o im�vel j� te pertence!\n");
							}
							
			} else if(opc == 5){
							jogo.pagaAluguel(Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel(),
									Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorAlugel(),
									jogador, Tabuleiro.listaPos.get(jogador.get_posAtual())); //pagar aluguel.
			} else if(opc == 6){
							jogador.rendimentoImovel(); //rendimento de im�veis.
			} else if(opc == 7){
							jogador.print_posAtual(); //ver posi��o.
			} else if(opc == 8){
							break; //passar a vez.
			} else {
				System.out.println("Valor inv�lido!\n\n");
			}
		}
	}
}