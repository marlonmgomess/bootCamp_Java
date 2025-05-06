import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Conta[] contas = new Conta[100];
        Scanner scanner = new Scanner(System.in);

        int contaContas = 0;
        boolean parar = false;

        do{
            menu();
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:

                break;

                case 2:

                break;

                case 3:

                System.out.println("Saindo do Programa");
                parar = true;
            }

        }while(!parar);
        
    }
    public static void menu(){
        System.out.println("Caixa Eletronico JAVA 2022\n");
        
        System.out.println("[1] Entrar na Connta");
        printLinhas();
        System.out.println("[2] Criar Conta");
        printLinhas();
        System.out.println("[3] Sair (Encerrar o Programa)");
        printLinhas();
    }

    public static void printLinhas(){
        System.out.println("------------------------------------");
    }
}
