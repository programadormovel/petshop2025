package br.com.mongreltech.model;
/**
 * Write a description of class Gerente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gerente
{
    // instance variables - replace the example below with your own
    private String nome;
    private Servico servico;

    /**
     * Constructor for objects of class Gerente
     */
    public Gerente(Servico servico)
    {
        // initialise instance variables
        this.servico = servico;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void aplicarTosa(Animal animalAgendado)
    {
        // put your code here
        boolean resultado = servico.tosa(animalAgendado);
        
        if(resultado == true){
            System.out.println("Tosa aplicada com sucesso no animal " + animalAgendado.getNome());
        }
    }
}
