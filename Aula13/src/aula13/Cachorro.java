/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author jr_jm
 */
public class Cachorro extends Lobo{
   
    public void abanarRabo(){
        System.out.println("Abanando Rabo!");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("au au au au!!!");
    }
    
       public void reagir(String frase){
        if(frase.equals("toma comida")||frase.equals("Olá")){
           System.out.println("Abanar e Latir");
           this.abanarRabo();
           this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if (hora<12){
             System.out.println("Abanar");
             this.abanarRabo();
        } else if(hora >=18){
            System.out.println("Ignorando o dono!");
        }else {
            System.out.println("Abanar e Latir");
            this.abanarRabo();
            this.emitirSom();
        }
            
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar o rabo");
            this.abanarRabo();
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade <5){
            if(peso<10){
                this.abanarRabo();
            }else{
                this.emitirSom();
            }
        } else {
            if (peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
