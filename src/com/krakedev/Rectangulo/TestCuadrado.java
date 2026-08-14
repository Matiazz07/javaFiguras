package com.krakedev.Rectangulo;

public class TestCuadrado {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();

        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println("Lado: " + c.getLado());
        System.out.println("Área: " + c.calcularArea());

        c.setLado(4);

        System.out.println("\n=== VALORES MODIFICADOS ===");
        System.out.println("Lado: " + c.getLado());
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}