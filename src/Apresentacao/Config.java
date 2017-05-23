package Apresentacao;
import java.util.Scanner;

public class Config {
	//atributos.
	private Scanner ler = new Scanner(System.in);
	private int qtddJogadores_;
	private int tamanhoTabuleiro_;
	
	//acessoras
	public int get_qtddJogadores(){
		return(qtddJogadores_);
	}
	public int get_tamanhoTabuleiro(){
		return(tamanhoTabuleiro_);
	}
	
	//modificadoras
	public void set_qtddJogadores(int qtddJogadores){
		qtddJogadores_ = qtddJogadores;
	}
	public void set_tamanhoTabuleiro(int tamanhoTabuleiro){
		tamanhoTabuleiro_ = tamanhoTabuleiro;
	}
}