package Sistema;
import java.util.ArrayList;
import Apresentacao.RegrasTab;

public class Tabuleiro {
	private int contador_; //contador de posições do tabuleiro.
	RegrasTab defaultTab = new RegrasTab();//objeto para configurar qual imóvel vai entrar na posição.
	public static ArrayList <Posicao> listaPos = new ArrayList <Posicao>();//array que forma o tabuleiro.
		
	public void construirTabuleiro(int tamanho){//recebe o tamanho do tabuleiro como parâmetro para construir as posições dentro do limite.
		int qtddRes=0; //variável que irá realizar a contagem de residências inseridas no tabuleiro - para regra do clubsocial.
		for(contador_ = 0; contador_ < tamanho; contador_++){
			Posicao pos = defaultTab.checkRegras(contador_, new Posicao(), tamanho, qtddRes);//chamada de função para definir o imóvel.
			pos.print();//assim que é preenchido o imóvel seguindo as regras de negócio imprime em tela.
			this.listaPos.add(contador_, pos);
			if(this.listaPos.get(contador_).get_imovel().get_nome().equals("Residencia")){//verifica se o imóvel é uma residência.
				qtddRes++;// se for, incrementa a contagem.
			} else if(qtddRes == 10){//resetando a contagem quando atingir o valor de 10.
				qtddRes = 0;
			} 
		}
	}
}