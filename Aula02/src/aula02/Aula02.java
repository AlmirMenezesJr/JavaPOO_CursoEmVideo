/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author jr
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        
        c1.cor = "azul";
        c1.ponta = .5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        c1.destampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "junoreta";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
        c2.destampar();
        c2.rabiscar();
        
        
        
        
        
    }
    
}
