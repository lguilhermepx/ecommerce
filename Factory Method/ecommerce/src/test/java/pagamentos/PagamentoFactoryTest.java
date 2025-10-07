package pagamentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// ServicoFactoryTest.java
class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        try {
            IProcessadorPagamento processador = PagamentoFactory.obterProcessador("Cheque");
            fail("Uma exceção lançada.");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pagamento inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {
        try {
            IProcessadorPagamento processador = PagamentoFactory.obterProcessador("Invalido");
            fail("Uma exceção lançada.");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pagamento inválido", e.getMessage());
        }
    }
}