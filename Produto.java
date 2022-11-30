package doWhile;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double valor, lucro, venda;
		String r;
		boolean sair = false;
		do {
			System.out.println("Digite o valor do produto:");
			valor = ler.nextDouble();
			System.out.println("Digite a margem do lucro do produto em %:");
			lucro = ler.nextDouble();
			venda = valor + ((lucro/100)*valor);
			System.out.println("O produto sdevera ser vendido por:R$" + venda);
			while (true){
				System.out.println("Deseja continua, digite s = Sim ou n = Não");
				r = ler.next();
				if( r.equalsIgnoreCase("s")) {
					System.out.println("O programa vai continuar");
					System.out.println();
					break;
				}else if (r.equalsIgnoreCase("n")) {
					System.out.println("Programa encerrados");
					sair = true;
					break;
				}else {
					System.out.println("Resposta invalida, digite outro");
					System.out.println();
				}
			}
				
				
			}while(!sair);
		}

	}

