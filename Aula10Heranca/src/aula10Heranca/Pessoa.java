/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author jr_jm
 */
public class Pessoa {
    
    //atributos
    
    private String Nome;
    private int idade;
    private String Sexo;
    
    //metodos especiais

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    //metodos 
    
    public void fazerAniversário(){
        this.setIdade(this.getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", idade=" + idade + ", Sexo=" + Sexo + '}';
    }
    
    
    
}
