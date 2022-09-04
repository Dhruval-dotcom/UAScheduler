package net.project1.conmanagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.project1.conmanagement.model.User;
import net.project1.conmanagement.util.HibernateUtil;

/**


 * CRUD database operations
 * @author
 *
 */
public class UserDao {

    /**
     * Save product
     * @param product
     */
    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            
            transaction = session.beginTransaction();
           
            session.save(user);
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Update 
     * @param product
     */
    public void updateUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
           
            transaction = session.beginTransaction();
          
            session.update(user);
           
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Delete 
     * @param id
     */
    public void deleteUser(int id) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            
            transaction = session.beginTransaction();

           
            User user = session.get(User.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("user is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Get product By ID
     * @param id
     * @return
     */
    public User getUser(int id) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            
            transaction = session.beginTransaction();
           
            user = session.get(User.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return user;
    }

    /**
     * Get all product
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < User > getAllUser() {

        Transaction transaction = null;
        List < User > listOfUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user activity object

            listOfUser = session.createQuery("from User").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfUser;
    }
}