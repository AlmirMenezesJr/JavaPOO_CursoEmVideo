/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_animais;

/**
 *
 * @author jr_jm
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Enterrando osso!");
    }
    public void abanarRabo(){
        System.out.println("abanando o rabo!");
    }
    @Override
    public void emitirSom() {
         System.out.println("Au au au");
    }
    @Override
    public void alimentar() {
        System.out.println("comendo ração e carninha");
    }
        
}
