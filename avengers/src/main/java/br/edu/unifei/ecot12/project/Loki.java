package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class Loki extends VilaoInteligente{


    private static ArrayList<VilaoInteligente> viloesInteligentes = new ArrayList<>();

    public Loki(String nome, int idade, String habilidadeEspecial, boolean capturado, int atrVIntelig) {

        super(nome, idade, habilidadeEspecial, capturado, atrVIntelig);
        viloesInteligentes.add(this);
    }

    @Override
    public void atacar() {
        System.out.println("Loki atacou usando seu cajado!");
    }

    @Override
    public void exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Habilidade especial: " + getHabilidadeEspecial());
            System.out.println("Esta capturado ? : " + (isCapturado() ? "Sim" : "Não"));
            System.out.println("Atributo específico do vilao: " + getAtrVIntelig());
        } else {
            for (VilaoInteligente viloesInt : viloesInteligentes) {
                System.out.println("Nome: " + viloesInt.getNome());
            }

        }

    }

    @Override
    public void usarArtefato(Artefato artefato) {
        if(artefato instanceof CetroLoki){
            System.out.println("Loki esta com seu cajado!");
        }else{
            System.out.println("Não é seu cajado!");
        }
    }

}

