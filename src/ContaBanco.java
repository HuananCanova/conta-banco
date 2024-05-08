public class ContaBanco {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo = 240;


    public ContaBanco(int numero, String agencia, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
    }

    
 
    // Getter para o número da conta
    public int getNumero() {
        return numero;
    }

    // Setter para o número da conta
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter para a agência
    public String getAgencia() {
        return agencia;
    }

    // Setter para a agência
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para o saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}