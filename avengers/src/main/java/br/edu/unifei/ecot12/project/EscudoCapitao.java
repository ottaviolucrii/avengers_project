package br.edu.unifei.ecot12.project;

public class EscudoCapitao extends Artefato {

    public EscudoCapitao(String nome, String descricao, Personagem usuario) {
        super(nome, descricao, usuario);
    }

    @Override
    public void whoIsUsing(Personagem usuario) {
        if (usuario instanceof CapitaoAmerica) {
            System.out.println("Capitao America esta com seu escudo!");
        } else {
            System.out.println("O personagem: " + usuario.getNome() + " esta com o escudo do Capitao America!");

        }

    }

}
