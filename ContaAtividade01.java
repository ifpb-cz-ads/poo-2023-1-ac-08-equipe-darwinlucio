package application.aAC8CT;

public class ContaAtividade01 {
	private int numero;
	private String nome;
	public double saldo;
	
	public ContaAtividade01(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		saldo = 0;
	}
	
	public void depositar(double valor) {
		this.saldo = this.getSaldo() + valor;
	}
	
	public boolean sacar(double valor) {
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
