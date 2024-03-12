package br.com.caelum.contas;

public class Conta {
    private String titular;
    private String agencia;
    private int numero;
    private double saldo;
    //private String dataDeAbertura;

    //private Data dataDeAbertura;

    public Conta(String titular, String agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        //this.dataDeAbertura = dataDeAbertura;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*public String getDataDeAbertura() {
        return dataDeAbertura.dia + "/" + dataDeAbertura.mes + "/" + dataDeAbertura.ano;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    */

    // Métodos de Funcionalidade
    public boolean saque(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void transferencia(Conta destino, double valor) {
        if (this.saque(valor)) {
            destino.deposito(valor);
        } else {
            System.out.println("Transferência não realizada: Saldo insuficiente.");
        }
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperarDadosParaImpressao() {
        String dados = "Titular: " + this.titular + "\n" +
                "Número da Conta: " + this.numero + "\n" +
                "Saldo: " + this.saldo + "\n";
        return dados;
    }

    public String getTipo() {
        return "Conta";
    }
    // "Data de Abertura: " + this.dataDeAbertura.dia + "/" + this.dataDeAbertura.mes + "/" + this.dataDeAbertura.ano + "\n";

}
