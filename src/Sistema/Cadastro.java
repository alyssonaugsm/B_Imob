package Sistema;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
	public ArrayList <Jogador>listaJogadores = new ArrayList<Jogador>();
	
	public void jogadores (int qtdd){
		Scanner ler = new Scanner(System.in);
		for(int i = 0; i < qtdd; i ++){
			System.out.println("Informe o nome do jogador: " + (i+1));
			Jogador novo = new Jogador();
			novo.set_nome(ler.nextLine());
			novo.set_id(i+1);
			novo.set_numVoltas(0);
			novo.set_posAtual(0);
			novo.set_rendaImovel(0);
			novo.set_rendaImovel(0);
			novo.set_saldo(150000);
			listaJogadores.add(novo);
		}
	}
}
