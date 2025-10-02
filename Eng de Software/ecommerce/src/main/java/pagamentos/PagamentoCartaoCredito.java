// ServicoMatricula.java
package pagamentos;

public class PagamentoCartaoCredito implements IProcessadorPagamento {

    @Override
    public String processar(double valor) {

        return "Pagamento de R$ " + valor + " com Cartão de Crédito efetivado.";
    }

    @Override
    public String cancelar() {
        return "Pagamento com Cartão de Crédito cancelado.";
    }
}