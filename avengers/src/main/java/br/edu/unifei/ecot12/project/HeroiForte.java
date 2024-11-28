package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class HeroiForte extends Heroi {

    private int atrForcaH;
    private static ArrayList<HeroiForte> heroisFortes = new ArrayList<>();

    public HeroiForte(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaH) {
        super(nome, idade, habilidadeEspecial, emMissao, status);
        this.atrForcaH = atrForcaH;
        heroisFortes.add(this);
    }

    @Override
    public void exibirInformacoes(boolean detalhado){
        if (detalhado) {
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Poder principal: " + getHabilidadeEspecial());
            System.out.println("Status: " + getStatusHeroi());
            System.out.println("Em missao: " + (isEmMissao() ? "Sim" : "Não"));
            System.out.println("Atributo específico de força: " + atrForcaH);
        } else {
            System.out.println("Nome: " + getNome());
        }

    }

    public void limparHFortes(){
        heroisFortes.clear();
        System.out.println("Lista de Herois fortes foi limpa!");
    }
     public static void adicionaListaHeroisF(ArrayList<HeroiForte> novosHerois){
        heroisFortes.addAll(novosHerois);
        System.out.println("" + novosHerois.size() + " foram adicionados a lista de HF!");
    }

    public static void removeFHeroi(String nome){
        heroisFortes.removeIf(heroi -> heroi.getNome().equals(nome));
    }

    public static ArrayList<HeroiForte> getHeroiFortes(){
        return heroisFortes;
    }

    public void setAtrForcaH(int atrForcaH) {
        this.atrForcaH = atrForcaH;
    }

    @Override
    public abstract void usarArtefato(Artefato artefato);

    public static void setHeroisFortes(ArrayList<HeroiForte> heroisFortes) {
        HeroiForte.heroisFortes = heroisFortes;
    }

    public int getAtrForcaH() {
        return atrForcaH;
    }

    

}
