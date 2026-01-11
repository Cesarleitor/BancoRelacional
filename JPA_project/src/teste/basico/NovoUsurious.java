import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usurious;

public class NovoUsurious {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Usurious novoUsurious = new Usurious("Adriana", "adriana@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsurious);
        em.getTransaction().commit();

        em.clear();
        emf.close();
    }
}