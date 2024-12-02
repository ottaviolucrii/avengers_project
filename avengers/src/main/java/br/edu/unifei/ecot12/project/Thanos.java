package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class Thanos extends VilaoForte {

    private static ArrayList<VilaoForte> viloesFortes = new ArrayList<>();
    private Artefato artefato;

    public Thanos(String nome, int idade, String habilidadeEspecial, boolean capturado, int atrForcaV) {

        super(nome, idade, habilidadeEspecial, capturado, atrForcaV);
        viloesFortes.add(this);
    }

    @Override
    public void atacar() {
        System.out.println("Estalo supremo!");
    }

    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if (detalhado) {
            if (artefato != null) {
                System.out.println("Artefato: " + artefato.getNome());
            } else {
                System.out.println("Thanos esta sem sua manopla!");
            }
        }
    }

    @Override
    public void usarArtefato(Artefato artefato) {
        if (artefato instanceof Manopla) {
            System.out.println("Thanos esta com a Manopla do Infinito!");
            System.out.println("Vai estalar o dedo! Impeça-o !!!");
            this.artefato = artefato;
        } else if (artefato instanceof MarteloThor) {
            System.out.println("Thanos nao é digno!");
        } else {
            System.out.println("Não é a Manopla do Infinito!");
        }
    }
}
