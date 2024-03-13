package br.com.caelum.sistemaBancario.testes;

import br.com.caelum.sistemaBancario.Autenticavel;
import br.com.caelum.sistemaBancario.Gerente;

public class Teste {
    public static void main (String[] args) {
        Gerente gerente = new Gerente();

        gerente.setSenha(123);

        System.out.println(gerente.autentica(4353));
    }
}
