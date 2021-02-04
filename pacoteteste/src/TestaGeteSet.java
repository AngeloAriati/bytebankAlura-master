public class TestaGeteSet {
        public static void main(String[] args) {
            Conta conta = new Conta(12, 1337);


            System.out.println(conta.getNumero());

            Cliente paulo = new Cliente();
            paulo.setNome("Paulo Paulao");
            paulo.setCpf("4567834576");
            paulo.setProfissao("engenheiro no hawai");
            conta.setTitular(paulo);
            conta.getTitular().setProfissao("maconheiro");

           }
        }


