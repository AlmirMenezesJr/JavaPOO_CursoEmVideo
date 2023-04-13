/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuaula09;

/**
 *
 * @author jr_jm
 */
public class MeuAula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];
        
        p[0] = new Pessoa("Almir Menezes Jr", 26,"M");
        p[1] = new Pessoa("Alice Silva Menezes", 8,"F");
        p[2] = new Pessoa("Natalia Santos da ilva Menezes", 38,"F");
        
        l[0] = new Livro("Alice no país das Maravílhas","não sei o autor", 300, p[1]);
        l[1] = new Livro ("Biblia Sagrada","Varios autores inspirados por Deus",5000, p[0]);
        l[2] = new Livro ("Atos dos Apostolos","Paulo", 120, p[2]);
        l[3] = new Livro ("Apocalipse", "joão", 100, p[0]);
        
                
        l[0].setAberto(true);
        l[0].folhear(200);
        
        l[1].folhear(150);
        
        l[2].folhear(85);
        
        
        l[1].avancarPagina();
        l[1].avancarPagina();
        
        for (int i = 0; i <= p.length; i++) {
            System.out.println(l[i].detalhes());
        }
        
        
    }
    
}
