package pagamentos.ecommerce;

public interface IProcessadorPagamento {
    String processar(double valor);
    String cancelar();
}