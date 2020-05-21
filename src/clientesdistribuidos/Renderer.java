/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesdistribuidos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author arand
 */
public class Renderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        Color c = Color.WHITE;
        String texto = jtable.getValueAt(i, 2).toString();
        System.out.println("----------------");
        System.out.println(texto);
        System.out.println("----------------");
        if(texto.equals("6")){
            label.setBackground(Color.RED);
            label.setForeground(Color.WHITE);
        }else if(texto.equals("7")){
           label.setBackground(Color.YELLOW);
           label.setForeground(Color.BLACK);
        }
        
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
