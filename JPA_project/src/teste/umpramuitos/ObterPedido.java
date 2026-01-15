package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        //PERCORRER OS ITENS
        for (ItemPedido item: pedido.getItens()) {
            System.out.println(item.getQuantidade()); //IMPRIME A QUANTIDADE DE PRODUTOS
            System.out.println(item.getProduto().getNome()); //IMPRIME O NOME DO PRODUTO
        }

        dao.fechar();


    }
}
