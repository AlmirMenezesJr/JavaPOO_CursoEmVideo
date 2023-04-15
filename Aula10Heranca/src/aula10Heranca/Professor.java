/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author jr_jm
 */
public class Professor extends Pessoa{
    //atributos
    private String expecialidade;
    private float salario;
    
    
    //metodo 
    public void aumentarSalario(float v){
        this.setSalario(this.getSalario() + v);
    }
    
    //metodos especiais
    public String getExpecialidade() {
        return expecialidade;
    }

    public void setExpecialidade(String expecialidade) {
        this.expecialidade = expecialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
