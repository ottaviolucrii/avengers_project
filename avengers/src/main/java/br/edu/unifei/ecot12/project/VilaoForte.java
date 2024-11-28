package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class VilaoForte extends Vilao{


    private int atrForcaV;
    private static ArrayList<VilaoForte> viloesFortes = new ArrayList<>();

    public VilaoForte(String nome, int idade, String habilidadeEspecial, boolean capturado, int atrForcaV){

        super(nome, idade, habilidadeEspecial, capturado);
        this.atrForcaV = atrForcaV;
        viloesFortes.add(this);
    }

    @Override
    public void atacar(){
        System.out.println("Esmagar!");
    }

    @Override
    public void exibirInformacoes(boolean detalhado){
        if(detalhado){
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Habilidade especial: " + getHabilidadeEspecial());
            System.out.println("Esta capturado ? : "+ (isCapturado() ? "Sim" : "Não" ));
            System.out.println("Atributo específico do vilao: " + atrForcaV);
        }else
        for (Vilao vilaov : viloesFortes){
            System.out.println("Nome: " + vilaov.getNome());
        }
    }
    
    public static void setViloesFortes(ArrayList<VilaoForte> viloesFortes) {
        VilaoForte.viloesFortes = viloesFortes;
    }

    public int getAtrForcaV(){
        return atrForcaV;
    }

    public static ArrayList <VilaoForte> getViloesFortes(){
        return viloesFortes;
    }

    public static void adicionaListaFViloes(ArrayList <VilaoForte> viloesFortes){
        viloesFortes.addAll(viloesFortes);
        System.out.println(" " + viloesFortes.size() + "viloes fortes foram adicionados a lista de VF!");
    }

    public static void removeFVilao(String nome){
        viloesFortes.removeIf(viloes -> viloes.getNome().equals(nome));
    }

    public void limparVFortes(){
        viloesFortes.clear();
        System.out.println("Lista de Herois fortes foi limpa!");
    }

    public void setAtrForcaV(int atrForcaV) {
        this.atrForcaV = atrForcaV;
    }
}
