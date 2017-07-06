import com.hibernate.demo.Person;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

/**
 * Created by krishan on 6/28/2017.
 */
public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Person person = new Person();
        person.setAge(25);
        person.setName("Ram");
        person.setId(1);
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
//        person=(Person)session.get(Person.class,1);
        System.out.println(person);

    }


//    private static final SessionFactory ourSessionFactory;

    /*static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }*/
   /*Person person= new Person();
    SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();
*/

   /* public static void main(final String[] args) throws Exception {

        createData();
        queryData();


        *//*final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }*//*
    }

    private static void createData(){
        Person person = new Person();

    }

    private static void queryData(){

    }*/
}