package com.krakedev.Rectangulo;

public class TestRectangulo {
	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo(4, 2);

		double perimetro = rec1.calcularPerimetro();

		System.out.println("--- Test de Rectángulo ---");
		System.out.println("El perímetro del rectángulo es: " + perimetro);

	}
}
