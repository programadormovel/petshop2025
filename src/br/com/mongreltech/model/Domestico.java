package br.com.mongreltech.model;
import java.util.*;
/**
 * Write a description of class Domestico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Domestico extends Animal
{
    // instance variables - replace the example below with your own
    private Date dataUltimoBanho;

    /**
     * Constructor for objects of class Animal
     */
    public Domestico(String nome, String tutor)
    {
        // initialise instance variables
        super(nome, tutor);
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
        System.out.println("Emite som como Animal Doméstico!!!");
    }
    
    public void comer(){
        System.out.println("Comendo ração!!!");
    }
}
