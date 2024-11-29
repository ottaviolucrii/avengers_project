package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class Thanos extends VilaoForte{

    private static ArrayList<VilaoForte> viloesFortes = new ArrayList<>();

    public Thanos(String nome, int idade, String habilidadeEspecial, boolean capturado, int atrForcaV){

        super(nome, idade, habilidadeEspecial, capturado, atrForcaV);
        viloesFortes.add(this);
    }

    @Override
    public void atacar(){
        System.out.println("Estalo supremo!");
    }

    @Override
    public void exibirInformacoes(boolean detalhado){
        if(detalhado){
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Habilidade especial: " + getHabilidadeEspecial());
            System.out.println("Esta capturado ? : "+ (isCapturado() ? "Sim" : "Não" ));
            System.out.println("Atributo específico do vilao: " + getAtrForcaV());
        }else{
        for (Vilao vilaov : viloesFortes){
            System.out.println("Nome: " + vilaov.getNome());
        }
    }
    }

    @Override
    public void usarArtefato(Artefato artefato) {
        if(artefato instanceof Manopla){
            System.out.println("Thanos esta com a Manopla do Infinito!");
            System.out.println("Vai estalar o dedo! Impeça-o !!!");
    }else{
        System.out.println("Não é a Manopla do Infinito!");
    }
}
}