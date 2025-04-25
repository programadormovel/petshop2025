package br.com.mongreltech.model;
/**
 * Write a description of class Funcionario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Funcionario
{
    // instance variables - replace the example below with your own
    private String nome;
    private IServico servico;

    /**
     * Constructor for objects of class Funcionario
     */
    public Funcionario(IServico servico)
    {
        // initialise instance variables
        this.servico = servico;
    }

    public void aplicarBanhoAnimal(Animal animalAgendado)
    {
        // put your code here
        boolean resultado = servico.banho(animalAgendado);
        
        if(resultado == true){
            System.out.println("Banho aplicado com sucesso no animal " + animalAgendado.getNome());
        }
    }
}
