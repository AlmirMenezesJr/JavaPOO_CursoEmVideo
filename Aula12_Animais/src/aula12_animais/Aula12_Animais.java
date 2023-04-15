/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12_animais;

/**
 *
 * @author jr_jm
 */
public class Aula12_Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero mam = new Mamifero();
        Reptil rep = new Reptil();
        Peixe pei = new Peixe();
        Ave ave = new Ave();
        
        
        mam.setPeso(85.5f);
        mam.setMembros(2);
        mam.setIdade(4);
        System.out.println(mam.toString());
        mam.alimentar();
        mam.emitirSom();
        mam.locomover();
        System.out.print("________________________\n\n");
        
        
        rep.setPeso(85.5f);
        rep.setMembros(2);
        rep.setIdade(4);
        System.out.println(rep.toString());
        rep.alimentar();
        rep.emitirSom();
        rep.locomover();
        System.out.print("________________________\n\n");
        
        
        pei.setPeso(0.35f);
        pei.setMembros(0);
        pei.setIdade(2);
        System.out.println(pei.toString());
        pei.alimentar();
        pei.emitirSom();
        pei.locomover();
        pei.soltarBolha();
        System.out.print("________________________\n\n");
        
        
        ave.setPeso(5);
        ave.setMembros(2);
        ave.setIdade(2);
        System.out.println(ave.toString());
        ave.alimentar();
        ave.emitirSom();
        ave.locomover();
        ave.fazerNinho();
        System.out.print("________________________\n\n");
        
        // objetos de subclasses
        
        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra cob = new Cobra();
        Aguia agu = new Aguia();
        
        can.setIdade(3);
        can.setMembros(2);
        can.setPeso(33);
        System.out.println(can.toString());
        can.emitirSom();
        can.alimentar();
        can.locomover();
        can.usarBolsa();
        System.out.print("________________________\n\n");
        
        
        cac.emitirSom();
        cac.abanarRabo();
        cac.alimentar();
        can.emitirSom();
        
        

        
        
        
        
    }
    
}
