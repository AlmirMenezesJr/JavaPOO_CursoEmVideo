/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11_heranca2;

/**
 *
 * @author jr_jm
 */
public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.printf("Bolsa de %s, mat.%s renovada com sucesso!\n",this.nome, this.getMatricula());
    }
    @Override
    public void pagarMensalidade(){
        System.out.printf("%s eh bolsista. Mensalidade OK.\n", this.nome);
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
