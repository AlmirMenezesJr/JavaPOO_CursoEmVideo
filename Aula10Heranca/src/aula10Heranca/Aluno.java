/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author jr_jm
 */
public class Aluno extends Pessoa {
    
    //atributos
    private int matricula;
    private String curso;
    
    //metodos
    public void cancelarMatricula(){
        System.out.println("Matriicula sera cancelada!");
    }

    // metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
