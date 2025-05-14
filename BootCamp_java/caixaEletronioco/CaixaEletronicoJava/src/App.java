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
                    contas[contaContas] = criarConta(scanner, new Conta());
                    contaContas++;
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

    public static Conta criarConta(Scanner scanner, Conta conta){
        printLinhas();
        System.out.println("Cadastro de conta");
        printLinhas();

        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do titular da conta: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite a senha da conta: ");
        String senha = scanner.nextLine();
        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        conta.setNome(nome);
        conta.setCpf(cpf);
        conta.setSenha(senha);
        conta.setSaldo(saldo);

        printLinhas();
        System.out.println("Conta criada com sucesso!");
        printLinhas();
        return conta;
    }

    public static void printLinhas(){
        System.out.println("------------------------------------");
    }
}
