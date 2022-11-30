package doWhile;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	try (Scanner ler = new Scanner (System.in)) {
		int r;
		
		
		do {
			
			System.out.println("Digite o ano do seu nascimento:");
			int anoNascimento = ler.nextInt();
			System.out.println("Digite o ano atual:");
			int anoAtual = ler.nextInt();
			
			int idade = anoAtual - anoNascimento;
			
			System.out.println("Sua idade é igual a: " + idade + "\n");
			
			if (idade<18) {
				System.out.println("Você é um neném \n");
			} else {
				System.out.println("Você é uma múmia \n");
			}
			
			while (true) {
				System.out.println("Você deseja continuar? (SIM = 1, NÃO = 2)");
				r = ler.nextInt();
				if (r != 1 && r != 2) {
					System.out.println("Número inválido, digite novamente \n");
				} else {
					break;
				}
			}

		} while (r == 1);
	}
	
		}

}
