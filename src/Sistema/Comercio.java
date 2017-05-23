package Sistema;

public class Comercio extends Imovel{
	public Comercio(){
		this.set_nome("Comercio");
		this.set_valorAluguel(1000.00 * 0.3); // valor do aluguel pré definido é 30% de 1000.
		this.set_valorVenda(1000.00); //valor do imovel pré-definido é de 1000.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
