package edu.marlon.javaBasico;

public class MeusStrings {
    public static void main(String[] args) {
        String nome1 = "Condado Simples";
        String nome2 = new String("Condado Simples");

        if(nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        }else{
            System.out.println("Nomes diferentes");
        }

        String nomeCompleto = "Marlon Silva";

        String nomeAlterado = nomeCompleto.toUpperCase();
        String nomeAlterado2 = nomeCompleto.toLowerCase();
        String nomeAlterado3 = nomeCompleto.replace("Silva", "Santos");
        String nomeAlterado4 = nomeCompleto.substring(0, 6);
        int contNomeAlterado5 = nomeCompleto.length();
        String nomeAlterado5 = nomeCompleto.trim();

        System.out.println(nomeAlterado + "\n " + nomeAlterado2 + "\n " + nomeAlterado3 + "\n " + nomeAlterado4 + "\n " + contNomeAlterado5 + "\n " + nomeAlterado5);
    }
}
