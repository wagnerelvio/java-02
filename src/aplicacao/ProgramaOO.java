package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Trapezio;

public class ProgramaOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Trapezio t1, t2;

		t1 = new Trapezio();
		t2 = new Trapezio();

		System.out.printf("Digite os valores de Bt1, bt1 e ht1, respectivamente:  ");
		t1.B = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.h = sc.nextDouble();

		System.out.printf("Digite os valores de Bt2, bt2 e ht2, respectivamente :  ");
		t2.B = sc.nextDouble();
		t2.B = sc.nextDouble();
		t2.h = sc.nextDouble();

		double areat1 = (t1.b + t1.b) * t1.h / 2;
		double areat2 = (t2.B + t2.b) * t2.h / 2;
		System.out.printf("Area do trapezio 01: %.2f%n", areat1);
		System.out.printf("Area do trapezio 02: %.2f%n", areat2);

		if (areat1 > areat2) {
			System.out.println("O Trapezio 01 possui a maior area.");
		} else {
			System.out.println("O Trapezio 02 possui a maior area.");
		}

		sc.close();
	}

}
