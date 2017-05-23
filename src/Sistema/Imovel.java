package Sistema;

public class Imovel {
	String nome_;
	int id_;
	double valorVenda_;
	double valorAluguel_;
	double rendimento_;
	
	//acessoras
	public String get_nome(){
		return(nome_);
	}
	public int get_id(){
		return(id_);
	}
	public double get_valorVenda(){
		return(valorVenda_);
	}
	public double get_valorAlugel(){
		return(valorAluguel_);
	}
	public double get_rendimento(){
		return(rendimento_);
	}
	//modificadoras
	public void set_nome(String nome){
		nome_ = nome;
	}
	public void set_id(int id){
		id_ = id;
	}
	public void set_valorVenda(double valorVenda){
		valorVenda_ = valorVenda;
	}
	public void set_valorAluguel(double valorAluguel){
		valorAluguel_ = valorAluguel;
	}
	public void set_rendimento(double rendimento){
		rendimento_ = rendimento;
	}
	public void set_acumRendimento(double valor){
		rendimento_ += valor;
	}
	public void set_debRendimento(double valor){
		rendimento_ -= valor;
	}
	
	//entrada e saída
	public void print(){
		System.out.println("IMOVEL.......: " + this.get_nome       () + "\n" +
						   "VALOR COMPRA.: " + this.get_valorVenda () + "\n" +
						   "VALOR ALUGUEL: " + this.get_valorAlugel() + "\n" +
						   "REND. ATUAL..: " + this.get_rendimento () + "\n");
	}
}
