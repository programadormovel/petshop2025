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
    private IServico servico;

    /**
     * Constructor for objects of class Gerente
     */
    public Gerente(IServico servico)
    {
        // initialise instance variables
        this.servico = servico;
    }

    public void aplicarTosa(Animal animalAgendado)
    {
        // put your code here
        boolean resultado = servico.tosa(animalAgendado);
        
        if(resultado == true){
            System.out.println("Tosa aplicada com sucesso no animal " + animalAgendado.getNome());
        }
    }
}
