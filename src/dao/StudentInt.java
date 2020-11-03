/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author emmanuel
 */
public interface StudentInt extends Remote{
    public boolean saveStudent(String fname, String lname, int sem) throws RemoteException;
    public boolean deleteStudent() throws RemoteException;
    public boolean updateStudent() throws RemoteException;
}
