package Sistema;

public class Posicao {
	int 	id_;
	Imovel 	imovel_;
	Jogador 	dono_;
	String 	visitante_;
	int	    qtddVisitas_;
	
	//acessoras
	public int get_id(){
		return (id_);
	}
	public Imovel get_imovel(){
		return (imovel_);
	}
	public Jogador get_dono(){
		return (dono_);
	}
	public String get_visitante(){
		return (visitante_);
	}
	public int get_qtddVisitas(){
		return (qtddVisitas_);
	}
	
	//modificadoras
	public void set_id(int id){
		id_ = id;
	}
	public void set_imovel(Imovel imovel){
		imovel_ = imovel;
	}
	public void set_dono(Jogador dono){
		dono_ = dono;
	}
	public void set_visitante(String visitante){
		this.set_qtddVisitas();
		visitante_ = visitante;
	}
	public void set_qtddVisitas(){
		qtddVisitas_ += 1;
	}
	public void reset_qtddVisitas(){
		qtddVisitas_ = 0;
	}
	
	//entrada e saída
	public void print(){
		System.out.println("======================================\n"   +
						   "POSICAO......: " + this.get_id());
		this.get_imovel().print();
		System.out.println("DONO.........: " + this.get_dono().get_nome() + "\n"   +
						   "======================================\n");
	}
}
