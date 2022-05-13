package pl.edu.pw.medcomplexsoft.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Database {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static void initialize()
    {
            if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("medcomplexsoft");
            entityManager = entityManagerFactory.createEntityManager();
        }
    }

    public static void close()
    {
        entityManager.close();
        entityManagerFactory.close();
    }

    public static EntityManager getEntityManager()
    {
        return entityManager;
    }
}
