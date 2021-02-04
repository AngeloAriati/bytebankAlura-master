package bytebank.cli;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo da Silva";
        paulo.cpf = "678904545";
        paulo.profissao = "Maconheiro";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        //associa o cliente "paulo" a contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        contaDoPaulo.deposita(20);
        contaDoPaulo.saca(110);
        System.out.println(contaDoPaulo.saldo);
    }
}
