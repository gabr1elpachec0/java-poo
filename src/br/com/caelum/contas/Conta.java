package br.com.caelum.contas;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public abstract class Conta {
    private String titular;
    private String agencia;
    private int numero;
    private double saldo;

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

    // Métodos de Funcionalidade
    public void saque(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente, tente um valor menor");
        } else if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo informado, tente novamente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void deposito(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo informado, tente novamente");
        } else {
            this.saldo += valor;
        }
    }

    public void transferencia(Conta destino, double valor) {
        destino.deposito(valor);
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

    public abstract String getTipo();
    // "Data de Abertura: " + this.dataDeAbertura.dia + "/" + this.dataDeAbertura.mes + "/" + this.dataDeAbertura.ano + "\n";

}
