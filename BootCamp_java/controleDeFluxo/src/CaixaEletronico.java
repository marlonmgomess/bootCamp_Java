public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSaque = 20.01;

        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente \nSaldo atual: " + saldo);
            
        }

    }
}
