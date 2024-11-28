package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public abstract class Hydra implements Organizacao{
    
        private String nome;
        private Personagem lider;
        private ArrayList<Personagem> membros = new ArrayList<>();
    
        public Hydra(String nome, Personagem lider) {
            this.nome = nome;
            this.lider = lider;
            this.membros = new ArrayList<>();
        }
        @Override
        public void adicionaMembro(Personagem membro) {
            this.membros.add(membro);
        }
        @Override
        public void removeMembro(String nome){
            membros.removeIf(membro -> membro.getNome().equals(nome));
        }
        @Override
        public void setNome(String nome) {
            this.nome = nome;
        }
        @Override
        public String getNome() {
            return nome;
        }
        @Override
        public Personagem getLider() {
            return lider;
        }
        @Override
        public void setLider(Personagem lider) {
            this.lider = lider;
        }
        @Override
        public ArrayList<Personagem> getMembros() {
            return new ArrayList<>(membros);
        }
        @Override
        public void getMembros(boolean detalhado) {
            if (detalhado) {
                for (Personagem membro : membros) {
                    membro.exibirInformacoes(true);
                }
            } else {
                for (Personagem membro : membros) {
                    membro.exibirInformacoes(false);
                }
            }
        }
}
