package Sistema;
import java.util.ArrayList;

public class Jogador {
	private int id_;
	private String nome_;
	private double saldo_;
	private int posAtual_;
	private double rendaImoveis_;
	private int numVoltas_;
	private double recebidoTotalAluguel_;
	private double gastoTotalAluguel_;
	ArrayList <Imovel> listaImovel =  new ArrayList <Imovel> ();
	
	//acessoras
	public int get_id(){
		return (id_);
	}
	public String get_nome(){
		return(nome_);
	}
	public double get_saldo(){
		return(saldo_);
	}
	public int get_posAtual(){
		return(posAtual_);
	}
	public double get_rendaImoveis(){
		return(rendaImoveis_);
	}
	public int get_qtddImoveis(){
		return(this.listaImovel.size());
	}
	public int get_numVoltas(){
		return(numVoltas_);
	}
	public double get_gastoTotalAluguel(){
		return(gastoTotalAluguel_);
	}
	public double get_recebidoTotalAlguel(){
		return(recebidoTotalAluguel_);
	}
	//modificadoras
	public void set_id(int id){
		id_ = id;
	}
	public void set_nome(String nome){
		nome_ = nome;
	}
	public void set_saldo(double saldo){
		saldo_ = saldo;
	}
	public void set_posAtual(int posAtual){
		posAtual_ = posAtual;
	}
	public void set_rendaImovel(double rendaImoveis){
		rendaImoveis_ = rendaImoveis;
	}
	public void set_numVoltas(int numVoltas){
		numVoltas_ = numVoltas;
	}
	public void set_gastoTotalAluguel(double valor){
		gastoTotalAluguel_ = valor;
	}
	public void set_recebidoTotalAluguel(double valor){
		recebidoTotalAluguel_ = valor;
	}
	
	//entrada e saída
	public void print_saldo(){
		System.out.println("###########################\n"
		         		 + "Saldo Atual: " + get_saldo() + "\n"
		                 + "###########################\n");
	}
	public void print_posAtual(){
		System.out.println("###########################\n"
        		         + "Posição Atual: " + get_posAtual() + "\n"
                         + "###########################\n");
		}
	public void rendimentoImovel(){
		for(int i = 0; i<(this.get_qtddImoveis()); i++){
			System.out.println("########################\n" +
							   "Imóvel.....: " + this.listaImovel.get(i).get_nome() + "\n" +
							   "Renda Atual: " + this.listaImovel.get(i).get_rendimento() + "\n");
		}
		System.out.println("#################################");
	}
	public void listaImoveis(){
		for(int i = 0; i<(this.get_qtddImoveis()); i++){
			System.out.println("##################################\n\n" +
							   "Posição: " + this.listaImovel.get(i).get_id() + "\n" +
							   "Imóvel:  " + this.listaImovel.get(i).get_nome() + "\n" +
							   "##################################\n\n");
		}
	}
}