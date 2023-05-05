public class AC8BmExercicio08TestaEquipamento {
	public static void main(String[] args) {
		//Instanciação do equipamento
		AC8BMExercicio06Equipamento equipamento = new AC8BMExercicio06Equipamento("Mouser Gamer ReDragon Cobra", 159.99);
		
		//Instanciação do Computador
		AC8BMExercicio06Computer computer = new AC8BMExercicio06Computer("I5 10", 256, "IdeaPad Gaming 3I", 3950.00);
		
		mostrarEquipamento(equipamento);
		mostrarComputer(computer);
	}
	
	public static void mostrarEquipamento(AC8BMExercicio06Equipamento equipamento) {
		System.out.println("\nEquipamento: ");
		System.out.println("Nome: " + equipamento.getNome());
		System.out.println("Preço: " + equipamento.getPreco() + "\n");
	}
	
	public static void mostrarComputer(AC8BMExercicio06Computer computer) {
		System.out.println("\nComputador: ");
		System.out.println("Nome: " + computer.getNome());
		System.out.println("Preço: " + computer.getPreco());
		System.out.println("Processador: " + computer.getProcessador());
		System.out.println("Quant. Armazenamento: " + computer.getQuantArmazenamento() + " GB\n");
	}
}
