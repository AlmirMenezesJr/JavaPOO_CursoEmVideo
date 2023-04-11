/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09;

/**
 *
 * @author jr_jm
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        
        p[0]= new Pessoa("Almir Menezes Junior", 26,"M");
        p[1]= new Pessoa("Alice S Menezes", 8, "F");
        
        l[0]= new Livro("aprendendo Java", "jose da silva", 500, p[0]);
        l[1]= new Livro("Poo para iniciantes","maria jose",230, p[1]);
        l[2]= new Livro("java avançado","maria candido", 300, p[0]);
        
        System.out.println(l[0].detalhes());
        
        System.out.println(l[2].detalhes());
        
    }
    
}
