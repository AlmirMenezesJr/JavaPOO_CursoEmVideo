/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11_heranca2;

/**
 *
 * @author jr_jm
 */
public class Aula11_Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Professor prof = new Professor();
        prof.setNome("G. Guanabara");
        prof.setIdade(53);
        prof.setEspecialidade("TI");
        prof.setSalario(2500f);
        prof.setSexo("M, eu acho");
        
        // Pessoa pessoa1 = new Pessoa();
        
        Aluno al = new Aluno();
        al.setNome("aluno Junior");
        al.setIdade(36);
        al.setSexo("M");
        al.setCurso("Direito");
        al.setMatricula(1231234);
        
        Visitante vi = new Visitante();
        vi.setIdade(20);
        vi.setNome("VIsitor Natalia");
        vi.setSexo("F");
                
        Bolsista bol = new Bolsista();
        bol.setNome("Alice Bolsista");
        bol.setBolsa(100);
        bol.setCurso("4 ano");
        bol.setIdade(8);
        bol.setMatricula(123441233);
        bol.setSexo("F");
        
        Tecnico tec = new Tecnico();
        tec.setNome("Aluno técnico");
        tec.setIdade(30);
        tec.setCurso("ADS 2");
        tec.setMatricula(762349823);
        tec.setRegistroProfissional("registrado no conselho de classe");
        tec.setSexo("Binário");
        
        System.out.println(tec.toString());
        tec.pagarMensalidade();
        tec.fazerAniversario();
        tec.praticar();
        System.out.println("_______________________________");
        
        System.out.println(bol.toString());
        bol.pagarMensalidade();
        bol.fazerAniversario();
        bol.renovarBolsa();
        System.out.println("_______________________________");

        
        System.out.println(al.toString());
        al.pagarMensalidade();
        al.fazerAniversario();
        System.out.println("_______________________________");
        
        System.out.println(prof.toString());
        prof.fazerAniversario();
        prof.receberSalario();
        System.out.println("_______________________________");
        
        System.out.println(vi.toString());
        vi.fazerAniversario();
        System.out.println("_______________________________");
        
        
        
    }
    
}
