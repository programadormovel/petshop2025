package br.com.mongreltech.model;
import java.util.*;
/**
 * Write a description of class Selvagem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Selvagem extends Animal
{
    // instance variables - replace the example below with your own
    private String regiaoOrigem;

    /**
     * Constructor for objects of class Animal
     */
    public Selvagem(String nome)
    {
        // initialise instance variables
        super(nome, "Não definido");
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void emitirSom()
    {
        // put your code here
        System.out.println("Emite som como Animal Selvagem!!!");
    }
    
        public void comer(){
        System.out.println("Comendo a caça obtida!!!");
    }
}
