
package aulaexemplo;

public class ExemploBanco{

    public static void main(String[] args) {
        
        Conta user1 = new Conta("Almir Menezes");
        Conta user2 = new Conta("natinha");
        user1.abrirConta("CP");
        user2.abrirConta("CC");
        user1.status();
        user2.status();
        
        
        
    }
    
}
