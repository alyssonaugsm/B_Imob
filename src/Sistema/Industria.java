package Sistema;

public class Industria extends Imovel{
	public Industria(){
		this.set_nome("Industria");
		this.set_valorAluguel(5000.00 * 0.2); // valor do aluguel pr� definido � 20% de 5000.
		this.set_valorVenda(5000.00); //valor do imovel pr�-definido � de 5000.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
