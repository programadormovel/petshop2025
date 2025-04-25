package br.com.mongreltech.model;
/**
 * Write a description of class Banho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Servico implements IServico
{
    // instance variables - replace the example below with your own
    private Animal animalAgendado;

    /**
     * Constructor for objects of class Banho
     */
    public Servico()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean banho(Animal animal)
    {
        // put your code herea
        System.out.println("Animal tomando banho!!!");
        return true;
    }
    
    public boolean tosa(Animal animal)
    {
        // put your code herea
        System.out.println("Animal sendo tosado!!!");
        return true;
    }
}
