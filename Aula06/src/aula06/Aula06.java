/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author jr_jm
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.maisVolume();
        
        c.abrirMenu();
        c.desligar();
        
        
    }
    
}
