package Sistema;

public class Hospital extends Imovel{
	public Hospital(){
		this.set_nome("Hospital");
		this.set_valorAluguel(10000.00 * 0.04); // valor do aluguel pr� definido � 4% de 10000.
		this.set_valorVenda(10000.00); //valor do imovel pr�-definido � de 10000.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
