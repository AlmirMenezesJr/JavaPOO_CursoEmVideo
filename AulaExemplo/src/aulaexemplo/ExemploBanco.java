
package aulaexemplo;

public class ExemploBanco{

    public static void main(String[] args) {
        
        ContaBanco user1 = new ContaBanco();
        ContaBanco user2 = new ContaBanco();
        user1.setNumeroConta(0001);
        user1.setNome("Almir Menezes Junior");
        user2.setNumeroConta(0002);
        user2.setNome("Natalia Santos Menezes");
        
        user1.abrirConta("CC");
        user2.abrirConta("CP");
        
        user1.depositar(100);
        user2.depositar(500);
        
        user2.sacar(100);
        user1.sacar(150);
        
        user1.fecharConta();
        
        user1.estadoAtual();
        user2.estadoAtual();
        
        
        
        
        
    }
    
}
