/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import persistence.ConexaoMysql;

/**
 *
 * @author Bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, UnknownHostException {
        ConexaoMysql c = null;
        c.getConexao();
        new GUIInsertFile().setVisible(true);
    }
    
}
