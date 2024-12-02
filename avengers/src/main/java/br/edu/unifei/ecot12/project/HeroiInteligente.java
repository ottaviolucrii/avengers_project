package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class HeroiInteligente extends Heroi {

    private double atrHIntelig;
    private static ArrayList<HeroiInteligente> heroisInteligentes = new ArrayList<>();

    public HeroiInteligente(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, double atrHIntelig) {
        super(nome, idade, habilidadeEspecial, emMissao, status);
        this.atrHIntelig = atrHIntelig;
        heroisInteligentes.add(this);
    }

    @Override
    public void usarArtefato(Artefato artefato) {
        // Implementação do uso do artefato
        System.out.println(getNome() + " está usando o artefato: " + artefato.getNome());
    }

    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if (detalhado) {
            System.out.println("Atributo de Inteligência: " + atrHIntelig);
        }
    }

    public void limparHInteligente(){
        heroisInteligentes.clear();
        System.out.println("Lista de Herois fortes foi limpa!");
    }
     public static void adicionaListaHeroisI(ArrayList<HeroiInteligente> novosHerois){
        heroisInteligentes.addAll(novosHerois);
        System.out.println("" + novosHerois.size() + " foram adicionados a lista de HF!");
    }

    public static void removeIHeroi(String nome){
        heroisInteligentes.removeIf(heroi -> heroi.getNome().equals(nome));
    }

    public static ArrayList<HeroiInteligente> getHeroiInteligente(){
        return heroisInteligentes;
    }


    public double getAtrHIntelig() {
        return atrHIntelig;
    }

    public void setAtrHIntelig(double atrHIntelig) {
        this.atrHIntelig = atrHIntelig;
    }
}