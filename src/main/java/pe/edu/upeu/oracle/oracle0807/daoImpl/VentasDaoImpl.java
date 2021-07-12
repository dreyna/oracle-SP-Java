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
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import pe.edu.upeu.oracle.oracle0807.config.Conexion;
import pe.edu.upeu.oracle.oracle0807.dao.TotalDao;
import pe.edu.upeu.oracle.oracle0807.model.Venta;

/**
 *
 * @author dreyna
 */
public class VentasDaoImpl implements TotalDao<Venta>{
private CallableStatement cstmt;
private ResultSet rs;
private Connection cx;
    @Override
    public int create(Venta t) {
        int x = 0;
        String SQL = "{ call PKG_CRUD_VENTA.SP_INS_VENTA(?,?,?,?,?)}";
        try {
            cx = Conexion.getConexion();
            cstmt =cx.prepareCall(SQL);
            cstmt.setString(1, t.getFecha());
            cstmt.setDouble(2, t.getTotal());
            cstmt.setDouble(3, t.getDescuento());
            cstmt.setInt(4, t.getCliente_id());
            cstmt.setInt(5, t.getTipo_comprovante());
            x  = cstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return x;
    }

    @Override
    public int update(Venta t) {
         int x = 0;
        String SQL = "{ call PKG_CRUD_VENTA.SP_UP_VENTA(?,?,?,?,?,?)}";
        try {
            cx = Conexion.getConexion();
            cstmt =cx.prepareCall(SQL);
            cstmt.setInt(1, t.getVenta_id());
            cstmt.setString(2, t.getFecha());
            cstmt.setDouble(3, t.getTotal());
            cstmt.setDouble(4, t.getDescuento());
            cstmt.setInt(5, t.getCliente_id());
            cstmt.setInt(6, t.getTipo_comprovante());
            x  = cstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
         int x = 0;
        String SQL = "{ call PKG_CRUD_VENTA.SP_DEL_VENTA(?)}";
        try {
            cx = Conexion.getConexion();
            cstmt =cx.prepareCall(SQL);
            cstmt.setInt(1, id);
            x  = cstmt.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return x;
    }

    @Override
    public Venta read(int id) {
        String SQL = "{call PKG_CRUD_VENTA.SP_BUS_VENTA(?,?)}";
        Venta v = new Venta();
        try {
            cx = Conexion.getConexion();
            cstmt = cx.prepareCall(SQL);
            cstmt.setInt(1, id);
            cstmt.registerOutParameter(2, OracleTypes.REF_CURSOR);
            cstmt.execute();
            rs = ((OracleCallableStatement)cstmt).getCursor(2);
            while(rs.next()){
                v.setVenta_id(rs.getInt("venta_id"));
                v.setFecha(rs.getString("fecha"));
                v.setTotal(rs.getDouble("total"));
                v.setDescuento(rs.getDouble("descuento"));
                v.setCliente_id(rs.getInt("cliente_id"));
                v.setTipo_comprovante(rs.getInt("tipo_comprobante"));
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }        
        return v;
    }

    @Override
    public List<Venta> readAll() {
        String SQL = "{call PKG_CRUD_VENTA.SP_LISTAR_VENTAS(?)}";
        List<Venta> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cstmt = cx.prepareCall(SQL);
            cstmt.registerOutParameter(1, OracleTypes.REF_CURSOR);
            cstmt.execute();
            rs = ((OracleCallableStatement)cstmt).getCursor(1);
            while(rs.next()){
                Venta v = new Venta();
                v.setVenta_id(rs.getInt("venta_id"));
                v.setFecha(rs.getString("fecha"));
                v.setTotal(rs.getDouble("total"));
                v.setDescuento(rs.getDouble("descuento"));
                v.setCliente_id(rs.getInt("cliente_id"));
                v.setTipo_comprovante(rs.getInt("tipo_comprobante"));
                lista.add(v);
            }            
        } catch (SQLException e) {
            System.out.println(e);
        }        
        return lista;
    }
    
}
