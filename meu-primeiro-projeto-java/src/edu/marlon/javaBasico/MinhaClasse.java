package edu.marlon.javaBasico;
public class MinhaClasse {
    public static void main(String[] args) {
       String primeiroNome = "Marlon";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        String nomeCompleto2 = primeiroNome.concat(" ").concat(segundoNome);

        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
