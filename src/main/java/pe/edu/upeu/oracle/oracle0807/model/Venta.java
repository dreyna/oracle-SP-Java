/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.oracle.oracle0807.model;

import java.sql.Date;

/**
 *
 * @author dreyna
 */
public class Venta {
    private int venta_id;
    private String fecha;
    private double total;
    private double descuento;
    private int cliente_id;
    private int tipo_comprovante;

    public Venta() {
    }

    public Venta(String fecha, double total, double descuento, int cliente_id, int tipo_comprovante) {
        this.fecha = fecha;
        this.total = total;
        this.descuento = descuento;
        this.cliente_id = cliente_id;
        this.tipo_comprovante = tipo_comprovante;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getTipo_comprovante() {
        return tipo_comprovante;
    }

    public void setTipo_comprovante(int tipo_comprovante) {
        this.tipo_comprovante = tipo_comprovante;
    }
    
    
}
