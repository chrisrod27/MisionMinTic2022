package com.mycompany.reto5.modelo.DAO;

import com.mycompany.reto5.modelo.VO.Compra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TerceraConsulta {
    
    public void terceraconsulta(DefaultTableModel modelo){
        
        Compra compra = new Compra();
        
        try{
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery ("SELECT ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c JOIN Proyecto p ON (c.ID_Proyecto = p.ID_Proyecto) WHERE Proveedor = 'Homecenter' AND p.Ciudad = 'Salento'");
             
            while(rs.next()){
                
                compra.setId_compra(rs.getInt(1));
                compra.setConstructora(rs.getString(2));
                compra.setBanco_vinculado(rs.getString(3));
                
                modelo.addRow(new Object[]{compra.getId_compra(), compra.getConstructora(), compra.getBanco_vinculado()});                
            }
            
            rs.close();
            cn.close();
        }
        catch(SQLException ex){
            Logger.getLogger(TerceraConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
