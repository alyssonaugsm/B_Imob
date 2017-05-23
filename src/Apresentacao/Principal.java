package Apresentacao;
import java.util.Scanner;
import Sistema.*;

public class Principal {
	public static void main(String[] args) {
		Config configJogo = new Config(); //objeto que irá configurar o jogo.
		Scanner ler = new Scanner(System.in); //variável para leitura de dados.
		int tam = 0;
		int qtdd = 0;
		Tabuleiro tabuleiro = new Tabuleiro();
		Menu jogador = new Menu();
		Cadastro cadastro = new Cadastro();
		int rodada = 1;
		int i = 0;
		int cont = 0;
		Estatistica e = new Estatistica();
		while(true){
			System.out.println("================ BANCO IMOBILIARIO ================ \n\n" +
							   "Informe o tamanho do tabuleiro à se jogar:		      \n");
								tam = ler.nextInt();//ler o tamanho do tabuleiro.
															
								if( tam <= 0 ){ //verifica se o usuário inseriu um valor válido.
									System.out.println("Valor invalido! Tente novamente!\n");
								} else{
									configJogo.set_tamanhoTabuleiro(tam); //setando o tamanho do tabuleiro do jogo.
									break;
								}
		}
		while(true){
			System.out.println("Informe a quantidade de jogadores (2 a 5)\n");
			qtdd = ler.nextInt();//lê a quantidade de jogadores que irão participar do jogo.
			if( qtdd <= 1 ){
				System.out.println("Valor inválido! Tente novamente!\n");
			} else {
				configJogo.set_qtddJogadores(qtdd);//setando quantidade de jogadores.
				cadastro.jogadores(qtdd);//cadastrando o nome dos jogadores.
				break;
			}
		}
		tabuleiro.construirTabuleiro(tam);//chamada de construção do tabuleiro.
		
		while(true){
			jogador.menuJogador(cadastro.listaJogadores.get(i), rodada); //chama o menu do jogador informando a rodada e o jogador.
			i++; //incrementa para mudar de jogador.
			rodada++;//número de jogadas (soma a cada mudança de jogador.
			if(i == qtdd){//condição para resetar a contagem de número de jogadores.
				i = 0;
			}
			if(cadastro.listaJogadores.get(i).get_saldo() < 0){//verifica se os jogadores correntes estão com saldo positivo.
				cont++;//verifica quantos jogadores atingiram o valor mínimo (menos que 80).
			}if (cont == (qtdd-1)){// se sobrar só 1 jogador, o jogo é encerrado.
				System.out.println("Fim de jogo!\n\n");
				break;
			}
		}
		e.run(); //chamada das estatísticas.
	}
}