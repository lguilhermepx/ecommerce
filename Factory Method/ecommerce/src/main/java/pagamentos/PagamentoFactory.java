// ServicoFactory.java
package pagamentos;

public class PagamentoFactory {

    public static IProcessadorPagamento obterProcessador(String tipoDePagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            // Formar o nome completo da classe
            // Ex: "pagamentos.ecommerce.Pagamento" + "Pix" -> "pagamentos.ecommerce.PagamentoPix"
            classe = Class.forName("pagamentos.ecommerce.Pagamento" + tipoDePagamento);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de pagamento inexistente");
        }
        if (!(objeto instanceof IProcessadorPagamento)) {
            throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
        return (IProcessadorPagamento) objeto;
    }
}