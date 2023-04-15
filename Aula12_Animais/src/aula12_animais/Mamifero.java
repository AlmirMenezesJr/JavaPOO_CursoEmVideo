/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_animais;

/**
 *
 * @author jr_jm
 */
public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }
    
    
}
