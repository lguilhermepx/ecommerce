package pagamentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// ServicoMatriculaTest.java
class PagamentoPixTest {

    @Test
    void deveProcessarPagamentoPix() {
        IProcessadorPagamento processador = PagamentoFactory.obterProcessador("Pix");
        assertEquals("Pagamento de R$ 100.0 com PIX efetivado.", processador.processar(100.0));
    }

    @Test
    void deveCancelarPagamentoPix() {
        IProcessadorPagamento processador = PagamentoFactory.obterProcessador("Pix");
        assertEquals("Pagamento com PIX cancelado.", processador.cancelar());
    }
}