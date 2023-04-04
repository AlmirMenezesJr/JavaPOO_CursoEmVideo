package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada; 
    private String cor;
    
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void rabiscar(){
        if (this.tampada){
            System.out.println("Erro, Não posso Rabiscar...");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    public void status(){
        System.out.println("Caneta");
        System.out.println("modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("tampada? "+ this.tampada);
        System.out.println("escrever... ");
    }
    
}

