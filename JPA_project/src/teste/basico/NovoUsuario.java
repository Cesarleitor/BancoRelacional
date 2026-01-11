import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Adriana", "adriana@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        em.clear();
        emf.close();
    }
}