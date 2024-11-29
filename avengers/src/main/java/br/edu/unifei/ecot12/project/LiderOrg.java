package br.edu.unifei.ecot12.project;

public class LiderOrg extends Personagem{

    public LiderOrg (String nome, int idade, String habilidadeEspecial){
        super(nome, idade, habilidadeEspecial);
    }

    @Override
    public void aniversario() {
        setIdade(getIdade() + 1);
    }

    @Override
    public void exibirInformacoes(boolean detalhado) {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habilidade Especial: " + getHabilidadeEspecial());
        if (detalhado){
            System.out.println("Lider da Organizacao");
        }
    }

    @Override
    public void usarArtefato(Artefato artefato) {
        System.out.println("Lider nao usa artefato");
    }
    

    

}
