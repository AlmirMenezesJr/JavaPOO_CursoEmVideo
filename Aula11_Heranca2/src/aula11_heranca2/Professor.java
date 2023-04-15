/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11_heranca2;

/**
 *
 * @author jr_jm
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberSalario(){
        System.out.printf("Olá, %s. Sálario de R$%s,00 recebido com sucesso!\n",this.nome,this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
