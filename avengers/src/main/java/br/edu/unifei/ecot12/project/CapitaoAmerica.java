package br.edu.unifei.ecot12.project;

public class CapitaoAmerica extends HeroiForte{

     private Artefato artefato;

    public CapitaoAmerica(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaH) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaH);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("O Capitao esta esta sem seu escudo!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Capitao atacou com seu escudo!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        if(artefato instanceof EscudoCapitao){
            System.out.println("Capitao esta com seu escudo!");
            this.artefato = artefato;
        }else {
            System.out.println("Não é seu escudo!");
        }

    }

    
}

