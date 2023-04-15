/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11_heranca2;

/**
 *
 * @author jr_jm
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("Feliz aniversário, "+this.getNome()+". Nova idade "+this.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
