package com.krakedev.Rectangulo;

public class TestCuadrado {
    public static void main(String[] args) {
        Cuadrado cuad1 = new Cuadrado(4);
        Cuadrado cuad2 = new Cuadrado(3);
        Cuadrado cuad3 = new Cuadrado(7.5);

        System.out.println("--- Test de Cuadrados ---");

        System.out.println("Cuadrado 1 (Lado " + cuad1.getLado() + "):");
        System.out.println("Área: " + cuad1.calcularArea());
        System.out.println("Perímetro: " + cuad1.calcularPerimetro());

        System.out.println("\nCuadrado 2 (Lado " + cuad2.getLado() + "):");
        System.out.println("Área: " + cuad2.calcularArea());
        System.out.println("Perímetro: " + cuad2.calcularPerimetro());

        System.out.println("\nCuadrado 3 (Lado " + cuad3.getLado() + "):");
        System.out.println("Área: " + cuad3.calcularArea());
        System.out.println("Perímetro: " + cuad3.calcularPerimetro());
    }
}