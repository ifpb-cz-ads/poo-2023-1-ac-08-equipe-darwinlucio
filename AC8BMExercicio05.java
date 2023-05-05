//Class Computador herdando class Equipamento
public class AC8BMExercicio05 extends AC8BMExercicio04{
	private String processador;
	private int quantArmazenamento;
	
	public AC8BMExercicio05(String processador, int quantArmazenamento, String nome, double preco) {
		super(nome, preco);
		this.processador = processador;
		this.quantArmazenamento = quantArmazenamento;
	}
}
