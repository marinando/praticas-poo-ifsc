//	3. Escreva um método responsável por calcular o abastecimento de um veículo. O método deve retornar o
//	valor total a ser pago a partir do precoLitro e valorPagamento. Utilize wrapper classes do Java para os
//	tipos usados e valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos para precoLitro e
//	valorPagamento.

package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Double precoLitro = 0.0, quantidadeLitro = 0.0;
		
		System.out.println("\nCalculadora de abastecimento\n\nInsira o valor do preço por litro do combustível:");
		Scanner scanner = new Scanner(System.in);
		String teste = scanner.nextLine();
		
		if (teste != null) {
			
			precoLitro = Double.valueOf(teste);
			System.out.println("Qual a quantidade de litros?\n");
			String teste2 = scanner.nextLine();
			
			if (teste2 != null) {
				quantidadeLitro = Double.valueOf(teste2);				
			}
		}
		else {
			System.out.println("Erro, valor nulo inserido.");
		}
		scanner.close();
		
		System.out.println("\nValor a pagar: " + calculaPreco(quantidadeLitro, precoLitro));

	}

	public static Double calculaPreco(Double qtdLitro, Double precoLitro) {

		if (qtdLitro == null || precoLitro == null) {
			System.out.println("Valor nulo inserido.");
		} 
		else {
			return qtdLitro * precoLitro;
		}
		return null;
	}

}