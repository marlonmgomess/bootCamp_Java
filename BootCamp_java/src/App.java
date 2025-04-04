import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int saldo = 1000;
        int retirar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor que deseja retirar?");
        retirar = scanner.nextInt();
        if(retirar <= saldo){
            saldo -= retirar;
            System.out.println("Retirada realizada com sucesso!\nSaldo atual: " + "R$: " +saldo);
        }else{
            System.out.println("Saldo insuficiente! \nSaldo atual: " + "R$: " +saldo);
        }
        scanner.close();
    }
}
