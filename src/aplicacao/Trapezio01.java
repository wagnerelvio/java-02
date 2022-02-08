package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Trapezio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double Bt1, bt1, ht1, Bt2, bt2, ht2;
		System.out.printf("Digite os valores de Bt1, bt1 e ht1, respectivamente:  ");
		Bt1 = sc.nextDouble();
		bt1 = sc.nextDouble();
		ht1 = sc.nextDouble();

		System.out.printf("Digite os valores de Bt2, bt2 e ht2, respectivamente :  ");
		Bt2 = sc.nextDouble();
		bt2 = sc.nextDouble();
		ht2 = sc.nextDouble();

		double areat1 = (Bt1 + bt1) * ht1 / 2;
		double areat2 = (Bt2 + bt2) * ht2 / 2;
		System.out.printf("Area do trapezio 01: %.2f%n", areat1);
		System.out.printf("Area do trapezio 02: %.2f%n", areat2);

		if (areat1 > areat2) {
			System.out.println("O Trapezio 01 possui a maior area");
		} else {
			System.out.println("O Trapezio 02 possui a maior area");
		}

		sc.close();
	}

}
