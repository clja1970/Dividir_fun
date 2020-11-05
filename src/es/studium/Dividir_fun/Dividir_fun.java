package es.studium.Dividir_fun;

import java.util.Scanner;

public class Dividir_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerador, denominador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el numerador ");
		numerador = teclado.nextInt();
		System.out.println("Dame el denominador ");
		denominador = teclado.nextInt();
		teclado.close();
		if (denominador == 0)
			System.out.println("No se puede dividir por 0");
		else
			System.out.println("El resultado de la división es: " + division(numerador, denominador));
	}

	public static double division(double numerador, double denominador) {
		double resultado;
		resultado = numerador / denominador;
		return resultado;
	}
}
