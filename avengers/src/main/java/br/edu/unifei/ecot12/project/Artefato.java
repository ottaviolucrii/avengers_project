package br.edu.unifei.ecot12.project;

public abstract class Artefato {

    private String nome;
    private String descricao;
    private Personagem usuario;

    public Artefato(String nome, String descricao, Personagem usuario){
        this.nome = nome;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public abstract void whoIsUsing(Personagem usuario);

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public Personagem getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Personagem usuario){
        this.usuario = usuario;
    }



}
