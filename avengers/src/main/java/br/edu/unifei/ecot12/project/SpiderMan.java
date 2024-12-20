package br.edu.unifei.ecot12.project;

public class SpiderMan extends HeroiInteligente{


    private Artefato artefato;

    public SpiderMan(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaIntelig) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaIntelig);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("SpiderMan esta sem artefato!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Vai Teia!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        if(artefato instanceof MarteloThor){
            System.out.println("SpiderMan não pode usar o martelo do Thor!");
        }else{
            System.out.println("spiderMan esta usando o artefato: " + artefato.getNome());
        }

        
    }

    
}
