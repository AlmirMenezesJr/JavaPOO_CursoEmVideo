/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author jr_jm
 */
public class ControleRemoto implements Controlador  {
   
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean mudo;
    private int volumeMudo;
    

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.mudo = false;
    }
    
// geter e seter métodos

    public int getVolumeMudo() {
        return volumeMudo;
    }

    public void setVolumeMudo(int volumeMudo) {
        this.volumeMudo = volumeMudo;
    }

    
    
    public boolean getMudo() {
        return mudo;
    }

    public void setMudo(boolean mudo) {
        this.mudo = mudo;
    }
    
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.fecharMenu();
        this.setLigado(false);
        System.out.println("Aparelho Desligado");
        
    }

    @Override
    public void abrirMenu() {
        if (getLigado()){
            System.out.println("------ MENU -------");
            System.out.println("Está ligado?" + this.getLigado());
            if (this.getMudo() == false) {
                System.out.println("Está Tocando?" + this.getTocando());
                System.out.println("Volume: "+ this.getVolume());
                for (int i = 1; i <= this.getVolume(); i+=10) {
                System.out.print("|");
                }
                System.out.println("");
            } else {
                System.out.println("Mudo");
            }
            
            
        } else { 
            System.out.println("Erro. Aparelho deligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechar Menu.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getMudo() == false) {
            this.setVolumeMudo(getVolume());
            this.setVolume(0);
            this.setMudo(true);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getMudo() == true) {
            this.setVolume(getVolumeMudo());
            this.setMudo(false);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    
    
    
    
}
