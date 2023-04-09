/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombate;

/**
 *
 * @author jr_jm
 */
public class Lutador implements GerenciadorLutas {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    // construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vit, int der, int emp) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade; 
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    
    // geter e seter métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.getPeso());
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso < 52.2){
            this.categoria = "Invalido - abaixo peso";
        } else if (peso <= 70.3 ){
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Medio";
        } else if (peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido - acima peso";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // Metodos específicos

    @Override
    public void apresentar() {
        System.out.println("______________ LUTADOR _____________");
        System.out.println("Categoria: "+ this.getCategoria());
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem:"+ this.getNacionalidade());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Altura: "+ this.getAltura()+" mts");
        System.out.println("Peso: "+this.getPeso()+ "KG");
        System.out.println("Vitorias: "+ this.getVitorias());
        System.out.println("Derrotas: "+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("------------------------------");
        System.out.println("     Lutador: "+this.getNome()+"     ");
        System.out.println("------------------------------");
        System.out.println("Peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(+this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+ " Empates");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
}
