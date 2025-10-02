// IServico.java
package pagamentos;

public interface IProcessadorPagamento {
    String processar(double valor);
    String cancelar();
}