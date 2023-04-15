/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_animais;

/**
 *
 * @author jr_jm
 */
public class Ave extends Animal{
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("A ave fez o ninho!!");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da Ave");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    
}
