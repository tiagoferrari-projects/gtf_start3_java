package com.github.tiagoferrari.exercicio3;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilateros.calculaQuadrilatero(5);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);

        double areaRetangulo = Quadrilateros.calculaQuadrilatero(25,15);
        System.out.printf("Área do retângulo: %.2f%n", areaRetangulo);

        double areaTrapezio = Quadrilateros.calculaQuadrilatero(45,30,15);
        System.out.printf("Área do trapézio: %.2f%n", areaTrapezio);
    }

}
