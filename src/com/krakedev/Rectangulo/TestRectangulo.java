package com.krakedev.Rectangulo;

public class TestRectangulo {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();

		System.out.println("=== VALORES POR DEFECTO ===");
		System.out.println("Base: " + r.getBase());
		System.out.println("Altura: " + r.getAltura());
		System.out.println("Área: " + r.calcularArea());

		r.setBase(10);
		r.setAltura(5);

		System.out.println("\n=== VALORES MODIFICADOS ===");
		System.out.println("Base: " + r.getBase());
		System.out.println("Altura: " + r.getAltura());
		System.out.println("Área: " + r.calcularArea());
		System.out.println("Perímetro: " + r.calcularPerimetro());
	}
}
