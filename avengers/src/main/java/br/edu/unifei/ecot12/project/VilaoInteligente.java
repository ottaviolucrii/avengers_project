package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class VilaoInteligente extends Vilao {


    private int atrVIntelig;
    private static ArrayList<VilaoInteligente> viloesInteligentes = new ArrayList<>();

    public VilaoInteligente(String nome, int idade, String habilidadeEspecial, boolean capturado, int atrVIntelig) {

        super(nome, idade, habilidadeEspecial, capturado);
        this.atrVIntelig = atrVIntelig;
        viloesInteligentes.add(this);
    }

    @Override
    public void atacar() {
        System.out.println("Distrair!");
    }

    @Override
    public void exibirInformacoes(boolean detalhado) {
        if (detalhado) {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Habilidade especial: " + getHabilidadeEspecial());
            System.out.println("Esta capturado ? : " + (isCapturado() ? "Sim" : "Não"));
            System.out.println("Atributo específico do vilao: " + atrVIntelig);
        } else {
            for (VilaoInteligente viloesInt : viloesInteligentes) {
                System.out.println("Nome: " + viloesInt.getNome());
            }

        }

    }

    public static void removeIVilao(String nome){
        viloesInteligentes.removeIf(vilaoInteligente -> vilaoInteligente.getNome().equals(nome));
    }

    public void setAtrVIntelig(int atrVIntelig) {
        this.atrVIntelig = atrVIntelig;
    }

    public static void setViloesInteligentes(ArrayList<VilaoInteligente> viloesInteligentes) {
        VilaoInteligente.viloesInteligentes = viloesInteligentes;
    }

    public int getAtrVIntelig() {
        return atrVIntelig;
    }

}
