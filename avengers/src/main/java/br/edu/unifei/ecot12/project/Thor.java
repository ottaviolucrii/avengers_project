package br.edu.unifei.ecot12.project;

public class Thor extends HeroiForte{

    private Artefato artefato;

    public Thor(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaH) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaH);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("Thor esta sem seu martelo!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Thor atacou com seu martelo!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        if(artefato instanceof MarteloThor){    
            System.out.println("Thor esta com seu martelo! Deus trovão!");
            this.artefato = artefato;
        }else{
            System.out.println("Não é seu martelo!");
        }
    }

    
}
