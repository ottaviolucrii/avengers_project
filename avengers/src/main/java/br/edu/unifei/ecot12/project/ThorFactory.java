package br.edu.unifei.ecot12.project;


public class ThorFactory implements HeroiFactory{

    @Override
    public Heroi criarHeroi() {
        Thor thor = new Thor("Thor", 200, "Deus-Trovao", true, Heroi.StatusHeroi.ATIVO, 5000);
        return thor;
    }
}
