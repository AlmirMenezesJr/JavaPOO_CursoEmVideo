/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author jr
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Carga: "+ this.carga+"%");
        System.out.println("Ponta: "+ this.ponta); 
        System.out.println(" está tampada? " + this.tampada);
    }
    
    public void rabiscar(){
        if (this.tampada){
            System.out.println("Erro, não posso rabiscar");
        } else {
            System.out.println("rabiscando...");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
