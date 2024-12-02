package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class Vilao extends Personagem {

    private String habilidadeEspecial;
    private boolean capturado;
    private static ArrayList<Vilao> viloes = new ArrayList<>();

    public Vilao(String nome, int idade, String habilidadeEspecial, boolean capturado) {
        super(nome, idade, habilidadeEspecial);
        this.capturado = capturado;
        viloes.add(this);
    }

    public void capturarVilao() {
        if (!capturado) {
            capturado = true;
            System.out.println("Vilao " + getNome() + " foi capturado com sucesso!");
        } else {
            System.out.println("Vilao " + getNome() + " ja esta capturado!");
        }
    }

    @Override
    public void exibirInformacoes(boolean detalhado){
        if(detalhado){
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Habilidade especial: " + getHabilidadeEspecial());
            System.out.println("Esta capturado ? : "+ (isCapturado() ? "Sim" : "Não" ));
        }else
        for (Vilao vilaov : viloes){
            System.out.println("Nome: " + vilaov.getNome());
        }
    }

    @Override
    public void aniversario(){
        setIdade(getIdade() + 1);
        System.out.println("Parabens vilao!\nAgora " + getNome() + " tem " + getIdade() + " anos!");
    }

    public void fugir() {
        if (capturado) {
            capturado = false;
            System.out.println(getNome() + " fugiu!");
        } else {
            System.out.println(getNome() + " esta a solta!");
        }
    }
    public static void adicionaListaVilao(ArrayList<Vilao> viloesNovos){
        viloesNovos.addAll(viloesNovos);
        System.out.println("" + viloesNovos.size() + " foram adicionados a lista pricipal");
    }

    public static void removeVilao(String nome){
        viloes.removeIf(vilao -> vilao.getNome().equals(nome));
    }

    @Override
    public abstract void usarArtefato(Artefato artefato);

    public abstract void atacar();

    public boolean isCapturado() {
        return capturado;
    }

    public String getHabilidade() {
        return habilidadeEspecial;
    }

    
    public static void setViloes(ArrayList<Vilao> viloes) {
        Vilao.viloes = viloes;
    }
}

