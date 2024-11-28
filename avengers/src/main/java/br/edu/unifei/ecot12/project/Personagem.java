package br.edu.unifei.ecot12.project;

public abstract class Personagem{
    private final String nome;
    private int idade;
    private String habilidadeEspecial;

    public Personagem (String nome, int idade, String habilidadeEspecial){
        this.nome = nome;
        this.idade = idade;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public abstract void aniversario();

    public abstract void exibirInformacoes(boolean detalhado);

    public abstract void usarArtefato(Artefato artefato);

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getHabilidadeEspecial(){
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    
}
