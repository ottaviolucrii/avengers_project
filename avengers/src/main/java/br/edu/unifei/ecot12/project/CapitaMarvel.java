package br.edu.unifei.ecot12.project;

public class CapitaMarvel extends HeroiForte{

    private Artefato artefato;

    public CapitaMarvel(String nome, int idade, String habilidadeEspecial, boolean emMissao, StatusHeroi status, int atrForcaH) {
        super(nome, idade, habilidadeEspecial, emMissao,status, atrForcaH);
    }


    @Override
    public void exibirInformacoes(boolean detalhado) {
        super.exibirInformacoes(detalhado);
        if(detalhado){
            if(artefato != null){
            System.out.println("Artefato: " + artefato.getNome());
        }else{
            System.out.println("A capita esta sem artefato!");
        }
    }
    }

    @Override
    public void atacar(){
        System.out.println("Capita atacou com sua superforça!");
    }

    @Override
    public void usarArtefato(Artefato artefato){
        
    }

    
}



