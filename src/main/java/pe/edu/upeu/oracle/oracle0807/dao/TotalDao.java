/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.oracle.oracle0807.dao;

import java.util.List;

/**
 *
 * @author dreyna
 * @param <T>
 */
public interface TotalDao<T> {
    int create(T t);
    int update(T t);
    int delete(int id);
    T read(int id);
    List<T> readAll();
}
