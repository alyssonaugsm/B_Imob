package Sistema;
import java.util.ArrayList;
import Apresentacao.RegrasTab;

public class Tabuleiro {
	private int contador_; //contador de posi��es do tabuleiro.
	RegrasTab defaultTab = new RegrasTab();//objeto para configurar qual im�vel vai entrar na posi��o.
	public static ArrayList <Posicao> listaPos = new ArrayList <Posicao>();//array que forma o tabuleiro.
		
	public void construirTabuleiro(int tamanho){//recebe o tamanho do tabuleiro como par�metro para construir as posi��es dentro do limite.
		int qtddRes=0; //vari�vel que ir� realizar a contagem de resid�ncias inseridas no tabuleiro - para regra do clubsocial.
		for(contador_ = 0; contador_ < tamanho; contador_++){
			Posicao pos = defaultTab.checkRegras(contador_, new Posicao(), tamanho, qtddRes);//chamada de fun��o para definir o im�vel.
			pos.print();//assim que � preenchido o im�vel seguindo as regras de neg�cio imprime em tela.
			this.listaPos.add(contador_, pos);
			if(this.listaPos.get(contador_).get_imovel().get_nome().equals("Residencia")){//verifica se o im�vel � uma resid�ncia.
				qtddRes++;// se for, incrementa a contagem.
			} else if(qtddRes == 10){//resetando a contagem quando atingir o valor de 10.
				qtddRes = 0;
			} 
		}
	}
}