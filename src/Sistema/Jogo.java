package Sistema;

public class Jogo {
	
	//classe responsável por rotinas do jogo
	public void dados(int controle, Jogador jogador, int tamanho){
		if(controle == 0) 
		{
			int dado = (int)(1 + Math.random()*(6)); //número aleatório entre 1 e 6.
			controle = 1;// controle para validar se o usuário já jogou os dados na rodada corrente.
			int dest = (jogador.get_posAtual()+dado);// casa onde o jogador irá parar após o valor do dado.
			Tabuleiro.listaPos.get(jogador.get_posAtual()).set_visitante((jogador.get_nome()));
			Tabuleiro.listaPos.get(jogador.get_posAtual()).set_qtddVisitas();
			
			if( dest > tamanho ){ // se completar uma volta soma o contador, e a diferença redefine a posição do jogador (fila)
				int resto = dest - tamanho;
				jogador.set_saldo((jogador.get_saldo()+5000.00)); //jogador ganha 5000 de bonus pela volta.
				jogador.set_numVoltas((jogador.get_numVoltas() + 1));//incrementa o numero de volta.
				jogador.set_posAtual(resto);
			} else {
				jogador.set_posAtual(dest);
			}
			System.out.println("###############################################\n"
					         + "Valor sorteado: " + dado + "\n"
					         + "###############################################\n"
					         + "Posição chegada...: " + jogador.get_posAtual() + "\n"
					         + "Imovel............: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_nome() +"\n"
					         + "Valor Aluguel.....: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorAlugel() + "\n"
					         + "Valor Compra......: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_imovel().get_valorVenda() + "\n"
					         + "Dono atual........: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_dono().get_nome() + "\n"
					         + "Visitante.........: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_visitante() +"\n" 
					         + "Qtdd Visitas Atual: " + Tabuleiro.listaPos.get(jogador.get_posAtual()).get_qtddVisitas() + "\n"
					         + "###############################################\n\n");
			
			
		} else {
			System.out.println("Você já jogou os dados nesta rodada!\n\n");
		}
	}
	
	public void compraImovel(Imovel imovel, double valor, Jogador jogador){
		if(jogador.get_saldo() > imovel.get_valorVenda()){
			double saldoAtual = jogador.get_saldo() - valor;
			jogador.set_saldo(saldoAtual);
			jogador.listaImovel.add(imovel);
		}else{
			System.out.println("Impossível comprar o imóvel, saldo insuficiente!\n\n");
		}
	}
	public void pagaAluguel(Imovel imovel, double valorAluguel, Jogador jogador, Posicao pos){
		if(jogador.get_saldo() > imovel.get_valorAlugel()){//verifica se o jogador tem dinhero pra pagar o aluguel
			double novoSaldo = jogador.get_saldo() - valorAluguel;//debita o aluguel
			jogador.set_saldo(novoSaldo);
			imovel.set_rendimento(valorAluguel);
			double gastoAluguel = imovel.get_valorAlugel() + jogador.get_gastoTotalAluguel();
			jogador.set_gastoTotalAluguel(gastoAluguel);//acumula o valor pago no total gasto pelo jogador que pagou o aluguel.
			pos.get_dono().set_recebidoTotalAluguel(valorAluguel); //acumula o valor pago no total recebido pelo jogador dono
		} else if (pos.get_dono().get_nome().equals(jogador.get_nome())){
			System.out.println("Insento de Aluguel, você é o dono do imóvel!\n");
		} else {
			System.out.println("Impossível pagar aluguel, saldo insuficiente!\n");
		}
	}
}
