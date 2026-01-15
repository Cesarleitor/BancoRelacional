package teste.consulta;

import infra.DAO;
import modelo.muitopramuitos.Ator;
import modelo.muitopramuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

        //CONSULTA FILME COM NOTA ACIMA DE => A 8.5
        for (Filme filme: filmes) {
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for (Ator ator: filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }

    }
}
