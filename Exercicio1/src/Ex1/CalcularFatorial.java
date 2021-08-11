package Ex1;

import java.util.Scanner;

public class CalcularFatorial {

	public static void main(String[] args) {
		System.out.println("Digite um Numero para calculo de Fatorial!");
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
		if(numero > 0)
			System.out.println("O fatorial do numero digitado é: " + calcularFatorial(numero));
		else
			System.out.println("O numero digitado é menor que 0");

	}
	
	public static int calcularFatorial(int numero) {
		if(numero == 0)
			return 1;
		else if (numero < 0)
			return -1;
		return  numero * calcularFatorial(numero - 1);
		
	}
}
