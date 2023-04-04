
package aulaexemplo;

public class Conta {
    public int numeroConta;
    private String nome;
    protected String tipo;
    private double saldo;
    private boolean status;
    
    public Conta(String n){
        this.numeroConta++; 
        this.status = false;
        this.nome = n;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }
        
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.status = true;
        if (t.equals("CC")){
            this.saldo = 50;
        } else if (t.equals("CP")){
            this.saldo = 150;
        }
    }
    
    public void fecharConta(){
        if (this.saldo > 0){
           System.out.println("Impossível fechar conta com saldo positivo.");
        } else if(this.saldo < 0){
            System.out.println("Impossível fechar conta com saldo negativo.");
        } else{    
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double v){
        if(status){
            this.saldo = this.saldo + v;
            System.out.println("Deposito realizado no valor R$"+v);
        } else {
            System.out.println("Erro. conta inativa.");
        }
    }
    
    public void sacar(double v){
        if(status && this.saldo>v){
            this.saldo = this.saldo - v;
            System.out.println("saque realizado no valor R$"+v);
        } else if(this.saldo < v){
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Erro. conta inativa.");
        }
    }
    
    public void pagarMensalidade(){
        if (status && this.tipo.equals("CC")){
            this.saldo = this.saldo - 12;
        } else if(status && this.tipo.equals("CP")){
            this.saldo = this.saldo - 20;
        }
    }
    
     public void status(){
         System.out.printf("Olá %s, como vai?", this.nome);
         System.out.println("Seu saldo é R$:"+ this.getSaldo());          
     }
             
}