package Sistema;

public class Banco extends Imovel{
	public Banco(){
		this.set_nome("Banco");
		this.set_valorAluguel(0.0); // banco n�o tem aluguel.
		this.set_valorVenda(99999999); // valor infinito ningu�m pode comprar o banco.
	}
}
