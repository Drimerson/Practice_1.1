/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kereia;

import java.sql.Connection;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Администратор
 */
@Stateless
public class NewClass {
    
    @Inject
    private Connection conn;
    
    public String getString() {
        return "LALA";
    }

    
}
