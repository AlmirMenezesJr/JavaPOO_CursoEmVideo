/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pontoeletronico;

import java.util.Scanner;

/**
 *
 * @author jr
 */
public class Usuario {
    Scanner teclado = new Scanner(System.in);
    String nome;
    int id;
    boolean ativo;
    
    public Usuario(){
        this.ativo = false;
    }
    
    void cadastraAtivador(){
        
        System.out.println("Cadastre o nome: ");
        this.nome = teclado.next();
        System.out.println("Cadastre o id: ");
        this.id = teclado.nextInt();
        
    }
    
    public boolean verificaAtivador(){
        String vNome;
        int vId;
        String resp;
        
        do {
            
            System.out.println("Digite o nome: ");
            vNome = teclado.next();
            System.out.println("Digite o id: ");
            vId = teclado.nextInt();
            
            if (vId == this.id && vNome.equals(this.nome)){
                System.out.println("Validado");
                return true;
            } else {
                System.out.println("nome ou id inválido!");
                System.out.println("Quer tentar novamente?(s/n)");
                resp = teclado.next();
            }  
                  
        } while (resp.equals("s"));
        System.out.println("Não validado");
        teclado.close();
        return false;
    } 
    
    void ativaPonto(){
       this.ativo = true;
    }
    
    void desativaPonto(){
        this.ativo = false;
    }
   
}
