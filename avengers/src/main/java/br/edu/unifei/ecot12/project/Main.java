package br.edu.unifei.ecot12.project;

public class Main {

    public static void main(String[] args) {

        //Criando herois

        Thor thor = new Thor("Thor", 200, "Deus-Trovao", true, Thor.StatusHeroi.ATIVO, 5000);
        MarteloThor martelo = new MarteloThor("martelo", "Martelo do Thor", thor);
        thor.atacar();
        thor.usarArtefato(null);
        thor.exibirInformacoes(true);


    }
}
