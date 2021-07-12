/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.oracle.oracle0807.dao;

import java.util.HashMap;

/**
 *
 * @author dreyna
 */
public interface LoginDao {
     public HashMap<String, Object> validar(String user, String pass);
}
