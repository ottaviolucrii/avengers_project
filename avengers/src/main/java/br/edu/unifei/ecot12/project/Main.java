package br.edu.unifei.ecot12.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Criando herois
        HeroiFactory thorFactory = new ThorFactory();
        Heroi thor = thorFactory.criarHeroi();
        MarteloThor martelo = new MarteloThor("martelo", "Martelo do Thor", thor);

        thor.exibirInformacoes(true);
        thor.usarArtefato(martelo);

        System.out.println("\n\n");


        
        Hulk hulk = new Hulk("Hulk", 50, "Esmagar", false, Hulk.StatusHeroi.DESATIVADO, 10000);
        HomemDeFerro homemDeFerro = new HomemDeFerro("Homem de Ferro", 40, "Voar", true, HomemDeFerro.StatusHeroi.ATIVO, 5000);



        Thanos thanos = new Thanos("Thanos", 90, "Manopla do infinito!", false, 10000);
        Manopla manopla = new Manopla("Manopla do Infinito", "Destroi o universo se Thanos estalar os dedos", thanos);
        
        thanos.exibirInformacoes(true);
        thanos.usarArtefato(martelo);
        thanos.usarArtefato(manopla);
        thanos.capturarVilao();
        thanos.exibirInformacoes(true);

        System.out.println("\n\n");



        LiderOrg nick = new LiderOrg("Nick Fury", 50, "Inteligencia");

        Shield shield = new Shield("S.H.I.E.L.D", nick);
        shield.getMembros(true);
        System.out.println("\n");

        shield.adicionaMembro(thor);
        shield.adicionaMembro(hulk);
        shield.adicionaMembro(homemDeFerro);
        shield.getMembros(false);
        shield.getLider();

        System.out.println("\n\n");


        // Usando o Singleton GerenciaHeroi
        GerenciaHeroi gerenciaHeroi = GerenciaHeroi.getInstance();
        gerenciaHeroi.adicionaListaHerois(new ArrayList<>(List.of(thor, hulk, homemDeFerro)), Heroi.getHeroi());
        gerenciaHeroi.removerHeroisInativos(Heroi.getHeroi());

        System.out.println("\n");


        Heroi.getHeroi();

    }
}
