package pagamentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// ServicoFormaturaTest.java
class PagamentoCartaoCreditoTest {

    @Test
    void deveProcessarPagamentoCartaoCredito() {
        IProcessadorPagamento processador = PagamentoFactory.obterProcessador("CartaoCredito");
        assertEquals("Pagamento de R$ 150.75 com Cartão de Crédito efetivado.", processador.processar(150.75));
    }

    @Test
    void deveCancelarPagamentoCartaoCredito() {
        IProcessadorPagamento processador = PagamentoFactory.obterProcessador("CartaoCredito");
        assertEquals("Pagamento com Cartão de Crédito cancelado.", processador.cancelar());
    }
}