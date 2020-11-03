/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import dao.StudentImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author emmanuel
 */
public class Server {
    public static void main(String[] args) {
        
        try {
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("saveStudentService", new StudentImpl());
            
            
            
            
            System.out.println("Server is running on Port 2000");
        } catch (Exception e) {
            
        }
    }
}
