package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public interface Organizacao {

    void adicionaMembro(Personagem membro);

    void removeMembro(String nome);

    void setNome(String nome);

    String getNome();

    LiderOrg getLider();

    void setLider(LiderOrg lider);

    ArrayList<Personagem> getMembros();

    void getMembros(boolean detalhado);
}