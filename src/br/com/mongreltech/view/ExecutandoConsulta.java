package br.com.mongreltech.view;

import br.com.mongreltech.model.*;

import java.util.*;
/**
 * Write a description of class ExecutandoConsulta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExecutandoConsulta
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Animal animalQualquer = new Domestico("Fofo", "Adriano");
        animalQualquer.emitirSom();
        Animal animalDaSelva = new Selvagem("Caverninha");
        animalDaSelva.emitirSom();
        
        Servico servicosDisponiveis = new Servico();
        Funcionario pessoaQualquer = new Funcionario(servicosDisponiveis);
        pessoaQualquer.aplicarBanhoAnimal(animalQualquer);
        
        Gerente gerentePet = new Gerente(servicosDisponiveis);
        gerentePet.aplicarTosa(animalDaSelva);
        
    }
}
