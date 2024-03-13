package br.com.caelum.sistemaBancario;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBonificacao() {
        return this.salario * 1.2;
    }
}
