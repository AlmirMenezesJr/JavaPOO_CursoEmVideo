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
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("junior");
        p2.setNome("Marcia");
        p3.setNome("Claudio");
        p4.setNome("fabiana");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(36);
        p2.setIdade(22);
        p3.setIdade(40);
        p4.setIdade(50);
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        
       // p1.receberAumento(540);
        //p2.mudaTrabalho();
        //p4.cancelarMatricula();
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
