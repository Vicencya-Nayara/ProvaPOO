package Q2;

public class Main {
     public static void main(String[] args) {
        Conta conta1 = new Conta(1, 3500.0, "Vicencya Nayara");
        Conta conta2 = new Conta(2, 2000.0, "Jussivan Bezerra");

        CadastroDeContas cadastro = new CadastroDeContas();

        cadastro.cadastrar(conta1);
        cadastro.cadastrar(conta2);

        System.out.println("Quantidade de contas cadastradas: " + cadastro.qtdCadastradas());

        Conta contaEncontrada = cadastro.procurar(1);
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada: " + contaEncontrada.numero + ", Saldo: " + contaEncontrada.saldo);
        } else {
            System.out.println("Conta não encontrada.");
        }

        boolean excluiuConta = cadastro.excluir(2);
        if (excluiuConta) {
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("Falha ao excluir a conta.");
        }

        System.out.println("Quantidade de contas cadastradas: " + cadastro.qtdCadastradas());
    }

}
