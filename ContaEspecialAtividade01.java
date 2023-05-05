package application.aAC8CT;

public class ContaEspecialAtividade01 extends ContaAtividade01{
	private double limite;
	
	public ContaEspecialAtividade01(int numero, String nome, double limite) {
		super(numero, nome);
		this.limite = limite;
	}	
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor <= limite + this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
