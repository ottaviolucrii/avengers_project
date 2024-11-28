package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class Heroi extends Personagem{

    
    private boolean emMissao;
    private StatusHeroi status;
    private String habilidadeEspecial;
    private static ArrayList<Heroi> herois = new ArrayList<>();

    public Heroi(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status) {

        super(nome, idade, habilidadeEspecial);
        this.emMissao = emMissao;
        this.status = status;
        herois.add(this); // adiciona cada heroi criado na lista quando criado
    }

    public enum StatusHeroi{
        ATIVO, DESATIVADO, APOSENTADO
    }

    @Override
    public abstract void usarArtefato(Artefato artefato);
    

    @Override
    public void exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Poder principal: " + getHabilidadeEspecial());
            System.out.println("Status: " + status);
            System.out.println("Em missao: " + (emMissao ? "Sim" : "Não"));
        } else {
            System.out.println("Nome: " +getNome());
        }

    }

    @Override
    public void aniversario(){
        setIdade(getIdade() + 1);
        System.out.println("Parabens Heroi!\nAgora " + getNome() + " tem " + getIdade() + "anos!");
    }

    public void iniciarMissao() {

        if (emMissao) {
            throw new IllegalStateException("O heroi ja esta em missão!");
        } else if (getHabilidadeEspecial() == null) {
            throw new IllegalArgumentException("Poder não definido!");
        } else {
            System.out.println("Missão atribuida com sucesso!");
        }
    }

    public static ArrayList<Heroi> getHeroi() {
        return new ArrayList <>(herois);//cria uma copia da lista e retorna a copia
    }


    public void altMissao(Boolean estaEmMissao) {
        this.emMissao = estaEmMissao;
    }

    public abstract void atacar();

    public void altStatus(StatusHeroi novoStatus) {
       this.status = novoStatus;
       System.out.println("Status de " + getNome() + "Atualizado para " + novoStatus);
    }



    

    
    public void limparListaDeHerois(){
        herois.clear();
        System.out.println("A lista de Herois foi limpa, lista vazia!");

    }

    public StatusHeroi getStatusHeroi() {
        return status;
    }

    public static void setHerois(ArrayList<Heroi> herois) {
        Heroi.herois = herois;
    }

    public boolean isEmMissao(){
        return emMissao;
    }
    
}
