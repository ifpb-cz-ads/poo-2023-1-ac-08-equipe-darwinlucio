//Class Computador herdando class Equipamento
public class AC8BMExercicio06Computer extends AC8BMExercicio06Equipamento{
	private String processador;
	private int quantArmazenamento;
	
	public AC8BMExercicio06Computer(String processador, int quantArmazenamento, String nome, double preco) {
		super(nome, preco);
		this.processador = processador;
		this.quantArmazenamento = quantArmazenamento;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public int getQuantArmazenamento() {
		return quantArmazenamento;
	}
	
	public void setQuatArmazenamento(int quantArmazenamento) {
		this.quantArmazenamento = quantArmazenamento;
	}
}
