package br.com.mongreltech.model;

/**
 * Write a description of class Animal here.
 *
 * @author Adriano/Marcelo
 * @version 1.0.0
 */

import java.util.Date;

public abstract class Animal
{
    // instance variables - replace the example below with your own
    private String nome;
    private String raca;
    private boolean pedigree = false;
    private Date dataDeNascimento;
    private double peso;
    private String tutor;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(String nome, String tutor)
    {
        // initialise instance variables
        this.nome = nome;
        this.tutor = tutor;
    }
    
    public String getNome(){
        return this.nome;
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
        System.out.println("Som emitido pelo Animal!!!");
    }
    
    public abstract void comer();
}
