
package aulaexemplo;

public class ExemploBanco{

    public static void main(String[] args) {
        
        ContaBanco user1 = new ContaBanco();
        ContaBanco user2 = new ContaBanco();
        user1.setNumeroConta(0001);
        user1.setNome("Almir Menezes Junior");
        user1.setNumeroConta(0002);
        user2.setNome("Natalia Santos Menezes");
        
        user1.abrirConta("CP");
        user2.abrirConta("CC");
        
        
        
        user1.estadoAtual();
        user2.estadoAtual();
        
        user1.sacar(50);
        user2.fecharConta();
        
        
        
    }
    
}
