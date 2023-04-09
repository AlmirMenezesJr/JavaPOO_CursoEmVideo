/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombate;

/**
 *
 * @author jr_jm
 */
public class UltraEmojiCombate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador [6];


        //Competidores - 
        l[0] = new Lutador("Almir Menezes Jr", "Brasil", 26, 1.71f, 80f, 15, 1, 2);
        l[1] = new Lutador("Putscrypt", "EUA", 29, 1.68f, 57.8f, 14,2,3);
        l[2] = new Lutador("Snapshadow","England", 35,1.65f, 68.9f, 12, 2,1);
        l[3] = new Lutador("DEad Code", "Australia", 28, 1.93f, 81.6f, 13,0,2);
        l[4] = new Lutador("Nerdart", "EUA", 30, 1.91f, 105.7f, 12,2,4);
        l[5] = new Lutador("Demolidor","China", 40, 2.00f, 120f, 20,0,0);
        
        l[5].perderLuta();
        l[5].status();
        
        l[0].ganharLuta();
        l[0].status();
        
        
    }
    
}
