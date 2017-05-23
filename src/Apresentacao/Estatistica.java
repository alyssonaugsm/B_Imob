package Apresentacao;

import Sistema.Tabuleiro;
import Sistema.Cadastro;
import Sistema.Jogador;
import java.util.Scanner;

public class Estatistica {
	// dados finais
	public void run(){
		Scanner ler = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		int opc;
		int totalVoltas = 0;
		while(true){
		System.out.println("=============== ESTATÍSTICAS FINAIS ================== \n\n" +
						   "Informe o valor desejado:                                \n" +
						   "1 - Classificação dos jogadores;\n" +
						   "2 - Quantas voltas foram dadas no tabuleiro.\n" +
						   "3 - Quanto dinheiro cada jogador ficou.\n" +
						   "4 - Ranking dos imóveis visitados.\n" +
						   "5 - Quantidade de aluguel recebida por cada.\n" +
						   "6 - Valor pago de aluguel por cada.\n" +
						   "7 - Lista de imóveis de cada jogador.\n" +
						   "8 - Sair.\n\n");
		opc = ler.nextInt();
		
		if(opc == 1){
			//aqui chamaria a função de ordenar a os jogadores. não soube como fazer esta ordenação em java. visto que iria trabalhar com o arraylist.
		} else if(opc == 2){
			for (int i = 0; i < cad.listaJogadores.size(); i++){
				totalVoltas += cad.listaJogadores.get(i).get_numVoltas();
				
				System.out.println("Voltas totais: " + totalVoltas);
			}
		} else if(opc == 3){
			for (int i = 0; i < cad.listaJogadores.size(); i++){
				System.out.println("Jogador: " + cad.listaJogadores.get(i).get_nome() + "\n"
								 + "Saldo..: " + cad.listaJogadores.get(i).get_saldo() + "\n"
								 + "--------------------------------------------------------\n");
			}
		} else if(opc == 4){
			//mesma coisa da opção 1, porém consultando o valor de qtdd de visitas dos imoveis (classe posição - onde está o atributo).
		} else if ( opc == 5){
			for(int i = 0; i < cad.listaJogadores.size(); i++){
				System.out.println("Jogador: " + cad.listaJogadores.get(i).get_nome() + "\n"
								 + "Recebido: " + cad.listaJogadores.get(i).get_recebidoTotalAlguel() + "\n\n");
			}
		} else if ( opc == 6 ){
			for(int i = 0; i < cad.listaJogadores.size(); i++){
				System.out.println("Jogador: " + cad.listaJogadores.get(i).get_nome() + "\n"
								+  "Gasto: " + cad.listaJogadores.get(i).get_gastoTotalAluguel() + "\n\n");
			}
		} else if (opc == 7){
			for (int i = 0; i < cad.listaJogadores.size(); i++){
				cad.listaJogadores.get(i).listaImoveis();
			}
		} else if (opc == 8){
			break;
		} else{
			System.out.println("Valor Inválido!\n\n");
		}
	}
	}
}