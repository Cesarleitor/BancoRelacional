package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Pantera Sentada M", 1249.99);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("ID do produto: " + produto.getId());
    }
}
