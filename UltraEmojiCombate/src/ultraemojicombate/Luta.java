/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombate;

import java.util.Random;

/**
 *
 * @author jr_jm
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //métodos publicos
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2){
            setAprovada(true);
            setDesafiante(l1);
            setDesafiado(l2);
        }else {
            setAprovada(false);
            setDesafiante(l1);
            setDesafiado(l2);
        }
    }
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("##DESAFIANTE##");
            this.desafiante.apresentar();
            System.out.println("##DESAFIADO##");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random(); // classe para gerar numeros aleatorios
            
            int vencedor = aleatorio.nextInt(3);// 0, 1 ou 2
            
            System.out.println("#######################################");
            System.out.println("          RESULTADO DA LUTA ");
            
            switch (vencedor){
                case 0 -> {
                    //empate
                    System.out.println("Empatou.");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                }
                case 1 -> {
                    //desafiante vence
                    System.out.println(this.desafiante.getNome() + " Wins!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                case 2 -> {
                    // desafiado vence
                    System.out.println(this.desafiado.getNome() + " Wins!!!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                }
            }
            
            System.out.println("########################################");
            
            this.desafiante.status();
            this.desafiado.status();
            
        }else {
            System.out.printf("Luta entre %s e %s não pode acontecer...",this.desafiado.getNome(),this.desafiante.getNome());
        }
    }
}
