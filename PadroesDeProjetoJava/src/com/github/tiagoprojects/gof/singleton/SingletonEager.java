package com.github.tiagoprojects.gof.singleton;

/**
 * Singleton"apressado".
 *
 * @author tiagoferrari-projects
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
