/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface ObradaInterface<T> {
    
    public T create(T entitet) throws EdunovaException;
    public List<T> read();
    public void update(T entitet) throws EdunovaException;
    public boolean delete(T entitet);
    
}
