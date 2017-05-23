package Sistema;

public class Hotel extends Imovel{
	public Hotel(){
		this.set_nome("Hotel");
		this.set_valorAluguel(2000.00 * 0.15); // valor do aluguel pré definido é 15% de 2000.
		this.set_valorVenda(2000.00); //valor do imovel pré-definido é de 2000.
		this.set_rendimento(0.0); //valor inicial de rendimento 0.
	}
}
