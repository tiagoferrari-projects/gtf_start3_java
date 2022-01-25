package com.github.tiagoferrari.objeto.exercicio;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Honda New Civic");
        carro1.setTanqueCombustivel(50);
        System.out.println("Cor do carro: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade do tanque de combustível: " + carro1.getTanqueCombustivel() + "L");

        Carro carro2 = new Carro("Grafite", "Chevrolet Onix", 45);
        System.out.println();
        System.out.println(carro2.toString());
        System.out.println();

        carro2.setCor("Azul Safira");
        System.out.println("Nova cor: " + carro2.getCor());
        carro2.setModelo("Fiat Argo");
        System.out.println("Novo modelo: " + carro2.getModelo());
        carro2.setTanqueCombustivel(47);
        System.out.println("Aumento na capacidade do tanque de combustível para " + carro2.getTanqueCombustivel() + "L  ");
    }
}
