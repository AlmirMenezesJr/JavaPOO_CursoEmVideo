/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

/**
 *
 * @author jr_jm
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero m = new Mamifero();
        Lobo lob = new Lobo();
        Cachorro cao = new Cachorro();
        
        m.setNome("maminha");
        cao.setNome("lulu");
        lob.setNome("grandão");
        
        System.out.print(m.getNome()+" fala assim: ");
        m.emitirSom();
        System.out.println("");
        
        System.out.print(cao.getNome()+" fala assim: ");
        cao.emitirSom();
        System.out.print("\n");
        
        System.out.print(lob.getNome()+" fala assim: ");
        lob.emitirSom();
        System.out.print("\n");
        
        System.out.println("reações de cachorro!");
        
        System.out.println("reação ao Ola");
        cao.reagir("Ola");
        System.out.println("reação a vai apanhar");
        cao.reagir("Vai apanhar");
        System.out.println("reação ao horario 11h45");
        cao.reagir(11, 45);
        System.out.println("reação ao horario 21h00");
        cao.reagir(21,00);
        System.out.println("reação a dono verdadeiro");
        cao.reagir(true);
        System.out.println("reacao a dono falso");
        cao.reagir(false);
       System.out.println("reacao por idade 2 peso 12.5");
        cao.reagir(2, 12.5f);
        System.out.println("reação por idade 10 peso 4.5");
        cao.reagir(10,4.5f);
    }
    
}
