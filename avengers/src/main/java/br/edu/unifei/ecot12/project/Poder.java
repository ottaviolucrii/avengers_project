package br.edu.unifei.ecot12.project;

public class Poder {

    private String nome;
    private int intensidade;
    private String descricao;
    private TipoPoder tipo;

    public enum TipoPoder{
        FISICO, MENTAL, MAGICO, ENERGETICO, TECNOLOGICO
    }

    public Poder (String nome, int intensidade, String descricao, TipoPoder tipo){
        this.nome = nome;
        this.intensidade = intensidade;
        this.descricao = descricao;
        this.tipo = tipo;
    }



    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIntensidade(){
        return intensidade;
    }

    public void setIntensidade(int intensidade){
        this.intensidade = intensidade;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public TipoPoder getTipo(){
        return tipo;
    }

    public void setTipo(TipoPoder tipo){
        this.tipo = tipo;
    }


}
