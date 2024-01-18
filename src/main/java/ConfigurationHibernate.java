import module.Matches;
import module.Players;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ConfigurationHibernate {

    public static SessionFactory getSessionFactory(){

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Matches.class);
        configuration.addAnnotatedClass(Players.class);
        configuration.configure();
        try {
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            return session;
        }
    }



}

