package application.aAC8CT;

public class ContaPoupancaAtividade01 extends ContaAtividade01{
	
	public ContaPoupancaAtividade01(int numero, String nome) {
		super(numero, nome);
	}
	
	public void reajustar(double percentual) {
		saldo = saldo + saldo * percentual;
	}
}
