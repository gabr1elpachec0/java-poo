package br.com.caelum.contas.exceptions;

import br.com.caelum.contas.modelo.ContaCorrente;

class TesteErro {
    public static void main (String[] args) {
        System.out.println("inicio do main");
        try {
            metodo1();
        } catch (NullPointerException e) {
            System.out.println("Erro: "+ e);
        }
        System.out.println("fim do main");
    }
    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        ContaCorrente cc = new ContaCorrente("Gabriel", "1234", 102, 1000);
        for (int i = 0; i <= 15; i++) {
            cc.deposito(i + 1000);
            System.out.println(cc.getSaldo());
            if (i == 5) {
                cc = null;
            }
        }
        System.out.println("fim do metodo2");
    }
}
