package br.edu.unifei.ecot12.project;

public class HomemDeFerro extends HeroiInteligente{

    private Artefato artefato;

    public HomemDeFerro(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaIntelig) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaIntelig);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("Homem-De-Ferro esta sem artefato!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Armadura Mark, do toninho!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        if(artefato instanceof MarteloThor){
            System.out.println("Homem-De-Ferro não pode usar o martelo do Thor!");
        }else{
            System.out.println("Homem-De-Ferro esta usando o artefato: " + artefato.getNome());
        }

        
    }

    
}



