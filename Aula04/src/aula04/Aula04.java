
package aula04;

public class Aula04 {

       public static void main(String[] args) {
       
           Caneta c1 = new Caneta("BIC","AZUL",.5f);
           
          Caneta c2 = new Caneta("KKK","Laranja",.7f);
           
           c1.status();
           c1.rabiscar();
           
           c2.status();
           c2.rabiscar();
           c2.destampar();
           c2.status();
           c2.rabiscar();
           
    }
    
}
