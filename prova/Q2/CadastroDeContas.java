package Q2;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeContas {
    private List<Conta> contas;

    public CadastroDeContas() {
        this.contas = new ArrayList<Conta>();
    }

    public boolean cadastrar(Conta novaConta) {
        return contas.add(novaConta);
    }

    public Conta procurar(int numeroConta) {
        for (Conta conta : contas) {
            if (conta != null && conta.numero == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public boolean excluir(int numeroConta) {
        Conta contaParaExcluir = null;
        for (Conta conta : contas) {
            if (conta != null && conta.numero == numeroConta) {
                contaParaExcluir = conta;
                break;
            }
        }
        return contas.remove(contaParaExcluir);
    }

    public int qtdCadastradas() {
        return contas.size();
    }

}
