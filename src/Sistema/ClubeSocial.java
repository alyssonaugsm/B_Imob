package Sistema;

public class ClubeSocial extends Imovel{
	public ClubeSocial(){
		this.set_nome("ClubeSocial");
		this.set_valorAluguel(1700.00 * 0.05); // valor do aluguel pr� definido � 5% de 1700.
		this.set_valorVenda(1700.00); //valor do imovel pr�-definido � de 1700.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
