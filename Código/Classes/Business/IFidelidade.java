package Business;

import java.io.Serializable;

public interface IFidelidade extends Serializable {

    /**
     * Calcula o valor do desconto e o insere no valor a ser pago pelo cliente
     * @param pedido Pedido que se deseja calcular o desconnto
     */
    public void calcularDesconto(Pedido pedido);
}