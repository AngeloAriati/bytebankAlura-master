package bytebank.cli;

import bytebank.cli.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAngelo = new Conta();
        Conta contaDoJoao = new Conta();
        contaDoJoao.saldo = 250;
        contaDoAngelo.saldo = 100;
        contaDoAngelo.deposita(50);
        contaDoJoao.deposita(20);
        System.out.println(contaDoAngelo.saldo);
        System.out.println(contaDoJoao.saldo);
        boolean conseguiuRetirar = contaDoAngelo.saca(30);
        System.out.println(contaDoAngelo.saldo);

        Conta contaDoMarcelo = new Conta();
        contaDoMarcelo.deposita(1200);
        contaDoMarcelo.transfere(500, contaDoAngelo);
        System.out.println(contaDoAngelo.saldo);

    }
}
