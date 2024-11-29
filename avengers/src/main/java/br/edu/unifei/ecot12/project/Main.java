package br.edu.unifei.ecot12.project;

public class Main {

    public static void main(String[] args) {

        //Criando herois

        Thor thor = new Thor("Thor", 200, "Deus-Trovao", true, Thor.StatusHeroi.ATIVO, 5000);
        MarteloThor martelo = new MarteloThor("martelo", "Martelo do Thor", thor);
        thor.usarArtefato(martelo);
        thor.exibirInformacoes(true);

        Thanos thanos = new Thanos("Thanos", 90, "Manopla do infinito!", false, 10000);
        thanos.usarArtefato(martelo);
        thanos.exibirInformacoes(true);
        Manopla manopla = new Manopla("Manopla do Infinito", "Destroi o universo se Thanos estalar os dedos", thanos);
        thanos.exibirInformacoes(true);
        thanos.usarArtefato(manopla);

        Shield shield = new Shield("S.H.I.E.L.D", "Nick Furry");
        shield.getMembros(true);
    }
}
