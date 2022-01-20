package com.github.tiagoferrari;

public class Mensagem {

    public static void mensagemSaudacao(int hora){
        if (hora >= 12 && hora < 18){
            System.out.println("Boa tarde!");
        } else if (hora >= 18){
            System.out.println("Boa noite!");
        } else if (hora >= 0) {
            System.out.println("Bom dia!");
        }
    }
}
