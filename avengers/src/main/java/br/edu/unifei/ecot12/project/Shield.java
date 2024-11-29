package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class Shield implements Organizacao{

    private String nome;
    private LiderOrg lider;
    private ArrayList<Personagem> membros = new ArrayList<>();

    public Shield(String nome, LiderOrg lider) {
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
        if(membros.removeIf(membro -> membro.getNome().equals(nome))){
            System.out.println("Membro removido com sucesso!");
        } else {
            System.out.println("Membro não encontrado!");
        }
        
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
    public LiderOrg getLider() {
        return lider;
    }
    @Override
    public void setLider(LiderOrg lider) {
        this.lider = lider;
    }
    @Override
    public ArrayList<Personagem> getMembros() {
        return new ArrayList<>(membros);
    }
    @Override
    public void getMembros(boolean detalhado) {
        if (membros.isEmpty()) {
            System.out.println("Não há membros na organização.");
            return;
        }

        for (Personagem membro : membros) {
            membro.exibirInformacoes(detalhado);
        }
    }
}
