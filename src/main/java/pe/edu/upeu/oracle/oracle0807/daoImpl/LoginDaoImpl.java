/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.oracle.oracle0807.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import oracle.jdbc.OracleCallableStatement;
import pe.edu.upeu.oracle.oracle0807.config.Conexion;
import pe.edu.upeu.oracle.oracle0807.dao.LoginDao;

/**
 *
 * @author dreyna
 */
public class LoginDaoImpl implements LoginDao{
private CallableStatement cstmt;
private ResultSet rs;
private Connection cx;
    @Override
    public HashMap<String, Object> validar(String user, String pass) {
        String SQL = "{ call PKG_VALIDAR_USER.SP_VALIDAR_USER(?,?,?)}";
        HashMap<String, Object> datos = new HashMap<>();
        try {
            cx = Conexion.getConexion();
            cstmt = cx.prepareCall(SQL);
            cstmt.setString(1, user);
            cstmt.setString(2, pass);
            cstmt.execute();
            rs = ((OracleCallableStatement)cstmt).getCursor(3);            
            while(rs.next()){
                datos.put("idusuario", rs.getInt("idusuario"));
                datos.put("username",  rs.getString("username"));
                datos.put("nombres",  rs.getString("nombres")+" "+rs.getString("apellidos"));
                datos.put("rol",  rs.getString("nomrol"));            
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return datos;
    }
    
}
