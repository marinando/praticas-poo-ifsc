//	3. Escreva um método responsável por calcular o abastecimento de um veículo. O método deve retornar o
//	valor total a ser pago a partir do precoLitro e valorPagamento. Utilize wrapper classes do Java para os
//	tipos usados e valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos para precoLitro e
//	valorPagamento.

package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("\nCalculadora de abastecimento\n\nInsira o valor do preço por litro do combustível:");
		Scanner scanner = new Scanner(System.in);
		Double quantidadeLitro = 0.0;
		
		Double precoLitro = Double.valueOf(scanner.nextLine());

		System.out.println("Qual a quantidade de litros?\n");

		quantidadeLitro = Double.valueOf(scanner.nextLine());
		System.out.println("\nValor a pagar: " + calculaPreco(quantidadeLitro, precoLitro));
		
		scanner.close();

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
