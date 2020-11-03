/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author emmanuel
 */
public class StudentImpl extends UnicastRemoteObject implements StudentInt{
    public StudentImpl() throws RemoteException{
        super();
    }

    @Override
    public boolean saveStudent(String fname, String lname, int sem) throws RemoteException {
        // Block of code
        Student student = new Student(fname, lname, sem);
        
        Session session = util.Connect.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
            session.save(student);
            transaction.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteStudent() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateStudent() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
