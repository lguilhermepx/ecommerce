package pagamentos;

public class PagamentoBoleto implements IProcessadorPagamento {

    @Override
    public String processar(double valor) {

        return "Boleto no valor de R$ " + valor + " gerado com sucesso.";
    }

    @Override
    public String cancelar() {
        return "Boleto cancelado.";
    }
}