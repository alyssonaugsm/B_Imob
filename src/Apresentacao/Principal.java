package Apresentacao;
import java.util.Scanner;
import Sistema.*;

public class Principal {
	public static void main(String[] args) {
		Config configJogo = new Config(); //objeto que ir� configurar o jogo.
		Scanner ler = new Scanner(System.in); //vari�vel para leitura de dados.
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
							   "Informe o tamanho do tabuleiro � se jogar:		      \n");
								tam = ler.nextInt();//ler o tamanho do tabuleiro.
															
								if( tam <= 0 ){ //verifica se o usu�rio inseriu um valor v�lido.
									System.out.println("Valor invalido! Tente novamente!\n");
								} else{
									configJogo.set_tamanhoTabuleiro(tam); //setando o tamanho do tabuleiro do jogo.
									break;
								}
		}
		while(true){
			System.out.println("Informe a quantidade de jogadores (2 a 5)\n");
			qtdd = ler.nextInt();//l� a quantidade de jogadores que ir�o participar do jogo.
			if( qtdd <= 1 ){
				System.out.println("Valor inv�lido! Tente novamente!\n");
			} else {
				configJogo.set_qtddJogadores(qtdd);//setando quantidade de jogadores.
				cadastro.jogadores(qtdd);//cadastrando o nome dos jogadores.
				break;
			}
		}
		tabuleiro.construirTabuleiro(tam);//chamada de constru��o do tabuleiro.
		
		while(true){
			jogador.menuJogador(cadastro.listaJogadores.get(i), rodada); //chama o menu do jogador informando a rodada e o jogador.
			i++; //incrementa para mudar de jogador.
			rodada++;//n�mero de jogadas (soma a cada mudan�a de jogador.
			if(i == qtdd){//condi��o para resetar a contagem de n�mero de jogadores.
				i = 0;
			}
			if(cadastro.listaJogadores.get(i).get_saldo() < 0){//verifica se os jogadores correntes est�o com saldo positivo.
				cont++;//verifica quantos jogadores atingiram o valor m�nimo (menos que 80).
			}if (cont == (qtdd-1)){// se sobrar s� 1 jogador, o jogo � encerrado.
				System.out.println("Fim de jogo!\n\n");
				break;
			}
		}
		e.run(); //chamada das estat�sticas.
	}
}