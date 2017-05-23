package Apresentacao;

import Sistema.*;

public class RegrasTab {
			//regras de tabuleiro
		public Posicao checkRegras(int id, Posicao pos, int tamanho, int qtddRes){
			pos.set_id(id);
			Jogador banco = new Jogador();
			banco.set_nome("Banco");
			
			if(id == 0){ //sempre na primeira posição
				pos.set_imovel(new Banco());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			} else if (id == 1){//um por tabuleiro
				pos.set_imovel(new Hospital());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			} else if (id%2 != 0){//posições impar comércio
				pos.set_imovel(new Comercio());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			} else if (id%2 == 0){//posições par residência
				pos.set_imovel(new Residencia());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			} if (qtddRes == 10){//um clubesocial a cada 10 residências
				pos.set_imovel(new ClubeSocial());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
				qtddRes = 0;
			} else if (id == 2 ||(id == (tamanho/2 + 1))){ //um na primeira metade outro na segunda metade
				pos.set_imovel(new Hotel());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			} else if( id%4 == 2 ){ //na estrutura que montei no tabuleiro sempre que o contador de residência for 1 será uma 
										//condição ideal para inserir uma industria pq não terá um vizinho como clubsocial/hospital
										//ou residencia.
				pos.set_imovel(new Industria());
				pos.get_imovel().set_id(id);
				pos.set_dono(banco);
				pos.reset_qtddVisitas();
			}
			return (pos);
		}
}
