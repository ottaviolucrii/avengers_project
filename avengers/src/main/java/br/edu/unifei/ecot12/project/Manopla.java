package br.edu.unifei.ecot12.project;

public class Manopla extends Artefato{

    public Manopla(String nome, String descricao, Personagem usuario) {
        super(nome, descricao, usuario);
    }

    @Override
    public void whoIsUsing(Personagem usuario) {
        if (usuario instanceof Thanos) {
            System.out.println("Thanos esta com a manopla!");
        }else
            System.out.println("O personagem: " + usuario.getNome() + " esta com a manopla do Thanos!");
    }
}