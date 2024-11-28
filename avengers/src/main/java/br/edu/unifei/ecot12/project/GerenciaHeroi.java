package br.edu.unifei.ecot12.project;

import java.util.ArrayList;


public abstract class GerenciaHeroi {

    public static void removerHeroi(ArrayList <Heroi> herois, String nome) {

        herois.removeIf(heroi -> heroi.getNome().equals(nome));
    }

    public static Heroi buscaHeroi(ArrayList <Heroi> herois, String nome) {
        for (Heroi h : herois) {
            if (h.getNome().equals(nome)) {
                System.out.println("Heroi encontrado!");
                return h;
            }
        } 
        System.out.println("Heroi não encontrado!");
        return null;
    }

    public static int contarHeroisPorStatus(ArrayList <Heroi> herois, Heroi.StatusHeroi status){
        int contador = 0 ;

        System.out.println("Herois no estado " + status+ ":");
        for(Heroi heroiv : herois){
            if(heroiv.getStatusHeroi().equals(status)){
                System.out.println("- " + heroiv.getNome());
                contador++;
            }
        }
        return contador;
    }

    public static void adicionaListaHerois(ArrayList<Heroi> heroisNovos, ArrayList <Heroi> herois){
        herois.addAll(heroisNovos);
        System.out.println("" + heroisNovos.size() + " foram adicionados a lista pricipal de herois");
    }

    public static void removerHeroisInativos(ArrayList <Heroi> herois){

        herois.removeIf( heroi -> !heroi.isEmMissao());

        System.out.println("Herois inativos removidos");
        System.out.println("Herois ativos: ");

        for(Heroi heroiv : herois){
            System.out.println("- " + heroiv.getNome());
        }
    }

}
