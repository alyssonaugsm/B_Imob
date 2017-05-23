package Sistema;

public class Residencia extends Imovel{
	public Residencia(){
		this.set_nome("Residencia");
		this.set_valorAluguel(5000.00 * 0.2); // valor do aluguel pré definido é 20% de 5000.
		this.set_valorVenda(5000.00); //valor do imovel pré-definido é de 5000.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
