package br.edu.unifei.ecot12.project;

public class Hulk extends HeroiForte{

    private Artefato artefato;

    public Hulk(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaH) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaH);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("O Hulk esta sem artefato!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Hulk esmaga!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        if(artefato instanceof MarteloThor){
            System.out.println("Hulk não pode usar o martelo do Thor!");
        }else{
            System.out.println("Hulk esta usando o artefato: " + artefato.getNome());
        }

        
    }

    
}



