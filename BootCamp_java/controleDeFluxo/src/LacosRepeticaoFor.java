import java.util.Scanner;

public class LacosRepeticaoFor {

    //Contador de Carneirinhos
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Contando carneirinhos");
        System.out.println("Quantos carneirinhos você tem?");
        int quantCaneirinhos = leitor.nextInt();

        for (int i = 1; i <= quantCaneirinhos; i++) {
            System.out.println(i + " Carneirinho(s)");
            linhasBrancas();
        }
    }

    public static void linhasBrancas() {
        System.out.println("______________________________");
    }   

}

