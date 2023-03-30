/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pontoeletronico;

import java.util.Scanner;

/**
 *
 * @author jr
 */
public class PontoEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        java.util.Scanner teclado = new Scanner(System.in);     
        Usuario usuario = new Usuario();
        TrincaPonto novo = new TrincaPonto();
        
        usuario.cadastraAtivador();
        
        
        if (usuario.verificaAtivador()){
            usuario.ativaPonto();
            novo.trincaEntrada();
        }
       
        novo.trincaBanheiro();
        
        novo.trincaLanche();
        
        novo.trincaFimDeExpediente();
        
        novo.status();
               
        usuario.desativaPonto();
               
        teclado.close();
    }
    
}
