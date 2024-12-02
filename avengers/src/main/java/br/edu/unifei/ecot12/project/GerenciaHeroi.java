package br.edu.unifei.ecot12.project;

import java.util.ArrayList;

public class GerenciaHeroi {
    private static GerenciaHeroi instance;

    private GerenciaHeroi() {
        // Construtor privado para evitar instanciamento
    }

    public static GerenciaHeroi getInstance() {
        if (instance == null) {
            instance = new GerenciaHeroi();
        }
        return instance;
    }

    public void removerHeroi(ArrayList<Heroi> herois, String nome) {
        herois.removeIf(heroi -> heroi.getNome().equals(nome));
    }

    public Heroi buscaHeroi(ArrayList<Heroi> herois, String nome) {
        for (Heroi h : herois) {
            if (h.getNome().equals(nome)) {
                System.out.println("Heroi encontrado!");
                return h;
            }
        }
        System.out.println("Heroi não encontrado!");
        return null;
    }

    public int contarHeroisPorStatus(ArrayList<Heroi> herois, StatusHeroi status) {
        int contador = 0;
        System.out.println("Herois no estado " + status + ":");
        for (Heroi heroiv : herois) {
            if (heroiv.getStatusHeroi().equals(status)) {
                System.out.println("- " + heroiv.getNome());
                contador++;
            }
        }
        return contador;
    }

    public void adicionaListaHerois(ArrayList<Heroi> heroisNovos, ArrayList<Heroi> herois) {
        herois.addAll(heroisNovos);
        System.out.println("" + heroisNovos.size() + " herois foram adicionados a lista principal de herois");
    }

    public void removerHeroisInativos(ArrayList<Heroi> herois) {
        herois.removeIf(heroi -> !heroi.isEmMissao());
        System.out.println("Herois inativos removidos");
        System.out.println("Herois ativos: ");
        for (Heroi heroiv : herois) {
            System.out.println("- " + heroiv.getNome());
        }
    }
}