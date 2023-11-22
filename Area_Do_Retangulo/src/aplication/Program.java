package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("------Calculos de um retangulo-------");
		System.out.print("Digite o valor da base: ");
		retangulo.b = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		retangulo.h = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n",retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n",retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n",retangulo.diagonal());
		
		sc.close();
	}
}
