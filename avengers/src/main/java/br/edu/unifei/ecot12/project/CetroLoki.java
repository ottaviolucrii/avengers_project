package br.edu.unifei.ecot12.project;

public class CetroLoki extends Artefato{
    
        public CetroLoki(String nome, String descricao, Personagem usuario) {
            super(nome, descricao, usuario);
        }
    
        @Override
        public void whoIsUsing(Personagem usuario) {
            if (usuario instanceof Loki) {
                System.out.println("Loki esta com seu cetro!");
            } else {
                System.out.println("O personagem: " + usuario.getNome() + " esta com o cetro do Loki!");
    
            }
    
        }
}
