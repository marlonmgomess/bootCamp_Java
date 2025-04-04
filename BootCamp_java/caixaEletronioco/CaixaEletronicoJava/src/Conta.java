public class Conta {

    private String nome;
    private String cpf;
    private String Senha;
    private double saldo;

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }

    public detalhes(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Saldo: R$"+getSaldo());
    }

    public Conta(){

    }

    public Conta(String nome, String cpf, String senha, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        Senha = senha;
        this.saldo = saldo;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getSenha() {
        return Senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    
}
