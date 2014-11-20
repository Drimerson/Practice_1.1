/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kereia;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Администратор
 */
@Named(value = "customerInfo")
@Stateless
public class CustomerInfo implements Serializable {

    @Inject
    private NewClass nc;
    
    /**
     * Creates a new instance of CustomerInfo
     */
    public CustomerInfo() {
    }
    
    public String info() {
        return nc.getString();
    }
    
}
