package application.aAC8CT;

import java.util.Scanner;

public class AC8TCExercicio02 {
	public static void main(String[] args) {
		ContaAtividade01 novaConta = null;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Criar conta para José");
		System.out.println("Qual tipo de conta?");
		System.out.println("1 - Conta");
		System.out.println("2 - Conta Especial");
		System.out.println("3 - Conta Poupança");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			novaConta = new ContaAtividade01(1, "José");
			break;
		case 2: 
			novaConta = new ContaEspecialAtividade01(1, "José", 100.00);
			break;
		case 3:
			novaConta = new ContaPoupancaAtividade01(1, "José");
			break;
		}
		novaConta.imprimirConta();
		sc.close();
	}
}
