package br.edu.unifei.ecot12.project;

public class ArmaduraMarkHF extends Artefato{

    public ArmaduraMarkHF(String nome, String descricao, Personagem usuario) {
        super(nome, descricao, usuario);
    }

    @Override
    public void whoIsUsing(Personagem usuario) {
        if (usuario instanceof HomemDeFerro) {
            System.out.println("Homem de Ferro esta com sua armadura!");
        } else {
            System.out.println("O personagem: " + usuario.getNome() + " esta com a armadura do Homem de Ferro!");
        }
    }
}
