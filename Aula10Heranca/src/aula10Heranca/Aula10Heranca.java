/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10Heranca;

/**
 *
 * @author jr_jm
 */


public class Aula10Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa1 = new Pessoa();
        Aluno aluno2 = new Aluno();
        Professor professor3 = new Professor();
        Funcionario funconario4 = new Funcionario();
        
        
        pessoa1.setNome("junior");
        aluno2.setNome("Marcia");
        professor3.setNome("Claudio");
        funconario4.setNome("fabiana");
        
        pessoa1.setSexo("M");
        aluno2.setSexo("F");
        professor3.setSexo("M");
        funconario4.setSexo("F");
        
        pessoa1.setIdade(36);
        aluno2.setIdade(22);
        professor3.setIdade(40);
        funconario4.setIdade(50);
        
        aluno2.setCurso("Informatica");
        professor3.setSalario(2500.75f);
        funconario4.setSetor("estoque");
        
       // p1.receberAumento(540);
        //p2.mudaTrabalho();
        //p4.cancelarMatricula();
        
        
        System.out.println(pessoa1.toString());
        System.out.println(aluno2.toString());
        System.out.println(professor3.toString());
        System.out.println(funconario4.toString());
        
    }
    
}
