/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.oracle.oracle0807.config;

import java.util.List;
import pe.edu.upeu.oracle.oracle0807.daoImpl.VentasDaoImpl;
import pe.edu.upeu.oracle.oracle0807.model.Venta;

/**
 *
 * @author dreyna
 */
public class Test {

    static VentasDaoImpl vdao = new VentasDaoImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //conexion();
        //listar();
       // create();
        //update();
       delete();
       // buscar();
    }

    static void conexion() {
        if (Conexion.getConexion() != null) {
            System.out.println("conectado");
        } else {
            System.out.println("No conectado");
        }
    }

    static void listar() {
        List<Venta> lista;
        lista = vdao.readAll();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getTotal());
        }
    }

    static void create() {
        int x = vdao.create(new Venta("22/06/2021", 2340, 10, 5, 1));//
        System.out.println(x);
    }

    static void update() {
        Venta venta = new Venta("10/07/2021", 3000, 0, 10, 2);
        venta.setVenta_id(4);
        int x = vdao.update(venta);
        System.out.println(x);
    }
    static void delete() {
        int x = vdao.delete(4);
        System.out.println(x);
    }
    static void buscar(){
    Venta venta = vdao.read(2);
        System.out.println(venta.getTotal());
    }
}
