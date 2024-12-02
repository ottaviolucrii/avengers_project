package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class Loki extends VilaoInteligente {

    private Artefato artefato;

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
        super.exibirInformacoes(detalhado);
        if (detalhado) {
            if (artefato != null) {
                System.out.println("Artefato: " + artefato.getNome());
            } else {
                System.out.println("Loki esta esta sem seu cetro!");
                for (VilaoInteligente viloesInt : viloesInteligentes) {
                    System.out.println("Nome: " + viloesInt.getNome());
                }

            }

        }
    }

    @Override
    public void usarArtefato(Artefato artefato) {
        if (artefato instanceof CetroLoki) {
            System.out.println("Thanos esta com a Manopla do Infinito!");
            System.out.println("Vai estalar o dedo! Impeça-o !!!");
            this.artefato = artefato;
        } else {
            System.out.println("Não é a Manopla do Infinito!");
        }

    }
}
