
package aulaexemplo;

public class ContaBanco {
    //atributos
    public int numeroConta;
    private String nome;
    protected String tipo;
    private double saldo;
    private boolean status;
    
    //construtor
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
        
    }
        
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        if (t.equals("CC")){
            this.setTipo("CC");
            this.setSaldo(50);
        } else if (t.equals("CP")){
            this.setTipo("CP");
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
           System.out.println("Impossível fechar conta com saldo positivo.");
        } else if(this.getSaldo() < 0){
            System.out.println("Impossível fechar conta com saldo negativo.");
        } else{    
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double v){
        if(getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado no valor R$"+v);
        } else {
            System.out.println("Erro. conta Fechada.");
        }
    }
    
    public void sacar(double v){
        if(getStatus() && this.getSaldo()>=v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("saque realizado no valor R$"+v);
        } else if(this.getSaldo() < v){
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Erro. conta fechada.");
        }
    }
    
    public void pagarMensalidade(){
        if (getStatus() && this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 12);
        } else if(getStatus() && this.getTipo().equals("CP")){
            this.setSaldo(this.getSaldo() - 20);
        }
    }
    
     public void estadoAtual(){
         System.out.printf("Ola %s, como vai? %n", this.nome);
         System.out.printf("Conta: %s%n", this.numeroConta);
         System.out.printf("O tipo da conta e:  %s%n", this.getTipo());
         System.out.printf("Seu saldo e R$: %s%n", this.getSaldo()); 
         System.out.printf("Estado da conta %s%n", this.getStatus());
         System.out.println(getTipo());
         
     }
             
     
}