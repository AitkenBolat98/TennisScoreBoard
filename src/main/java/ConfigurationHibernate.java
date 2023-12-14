import module.Matches;
import module.Players;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ConfigurationHibernate {
    private static SessionFactory sessionFactory;

    private ConfigurationHibernate(){}

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
        }try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Players.class);
            configuration.addAnnotatedClass(Matches.class);
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception e){
            System.out.println("hiber exception" + e);
        }
        return sessionFactory;
    }



}

