/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_animais;

/**
 *
 * @author jr_jm
 */
public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("O peixe está soltando bolhas!");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som. dÂ.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias aquaticas");
    }

    @Override
    public void locomover() {
        System.out.println("nadando");
    }
    
    
    
}
