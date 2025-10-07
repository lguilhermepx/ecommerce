package pagamentos;

public class PagamentoPix implements IProcessadorPagamento {

    @Override
    public String processar(double valor) {

        return "Pagamento de R$ " + valor + " com PIX efetivado.";
    }

    @Override
    public String cancelar() {
        return "Pagamento com PIX cancelado.";
    }
}