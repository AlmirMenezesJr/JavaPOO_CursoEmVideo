/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhaabstracao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author jr
 */
public class TrincaPonto {
    Scanner teclado = new Scanner(System.in);
           
    String horaEntrada;
     String horaSaida;
     String horaLanche;
     String pausaBanheiro;
     boolean trincouNoHorario;
     
     void trincaEntrada(){
        System.out.println("Deseja marcar a entrada? (s/n)");
        String resp = teclado.next();
        if (resp.equals("s")){
            this.horaEntrada = pegaHora();
            System.out.println("Entrada marcada em: "+ pegaHora());
        }
     }
     
     void trincaLanche(){
        System.out.println("Deseja trincar lanche? (s/n)");
        String resp = teclado.next();
        if (resp.equals("s")){
            this.horaLanche = pegaHora();
            System.out.println("Lanche marcado em: "+ pegaHora());
        }
    }
     
     void trincaBanheiro(){
        System.out.println("Deseja trincar Pausa Banheiro? (s/n)");
        String resp = teclado.next();
        if (resp.equals("s")){
            this.pausaBanheiro = pegaHora();
            System.out.println("Pausa Banheiro marcada em: "+ pegaHora());
        }
     }
     void trincaFimDeExpediente(){
        System.out.println("Deseja trincar Saida? (s/n)");
        String resp = teclado.next();
        if (resp.equals("s")){
            this.horaSaida = pegaHora();
            System.out.println("Fim de Expediente marcado em: "+ pegaHora());
        }
     }
     
     void status(){
         System.out.printf("Entrada: %S \nLanche: %S \nBanheiro: %S\nFim de Expediente: %S", this.horaEntrada, this.horaLanche, this.pausaBanheiro, this.horaSaida);
     }

    public String pegaHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String Nhora = dtf.format(now);
        return Nhora;
    }
     
}
