package br.edu.unifei.ecot12.project;

public class MarteloThor extends Artefato{

    
    public MarteloThor(String nome, String descricao, Personagem usuario){
        super(nome,descricao, usuario);
    }


    @Override
    public void whoIsUsing(Personagem usuario){
        if(usuario.getNome().equals("Thor")){
            System.out.println("Thor esta com seu martelo! Deus trovão!");
        }else{
            System.out.println(usuario.getNome()+ "não pode usar o martelo, Apenas Thor é digno!");
        }
    }
    
}
