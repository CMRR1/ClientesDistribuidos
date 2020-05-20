/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesdistribuidos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import negociodistribuidos.Asignacion;

/**
 *
 * @author ceccy
 */
public class RevisarFrame extends javax.swing.JFrame {
    private Asignacion asig;
    final String host = "127.0.0.1";
    final int puerto = 5060;
    Asignaciones parent;
    /**
     * Creates new form RevisarFrame
     */
    public RevisarFrame(Asignacion asig, Asignaciones parent) {
        this.asig = asig;
        this.parent = parent;
        
        this.setLocationRelativeTo(this);
        initComponents();
        cursoLabel.setText(asig.getCurso());
        asignacionLabel.setText(asig.getNombre());
        calificacionLabel.setText("Calificacion: "+asig.getCalificacion());
        if(asig.isEstado()){
            revisadoLabel.setText("Revisado");
            btnConfirmar.setEnabled(false);
        }else{
            revisadoLabel.setText("Sin Revisar");
        }
        if(asig.isTipo()){
            tipoLabel.setText("Tarea");
        }else{
            tipoLabel.setText("Ejercicio");
        }
        areaNotas.setEditable(false);
        areaNotas.setLineWrap(true);
        areaNotas.setText(asig.getNotas());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursoLabel = new javax.swing.JLabel();
        asignacionLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        revisadoLabel = new javax.swing.JLabel();
        calificacionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaNotas = new javax.swing.JTextArea();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cursoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cursoLabel.setText("Curso");

        asignacionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        asignacionLabel.setText("Asignacion");

        tipoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLabel.setText("Tipo");

        revisadoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        revisadoLabel.setText("Revisado");

        calificacionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calificacionLabel.setText("Calificacion");

        areaNotas.setColumns(20);
        areaNotas.setRows(5);
        areaNotas.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaNotas);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tipoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(revisadoLabel)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirmar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calificacionLabel)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(asignacionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cursoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cursoLabel)
                .addGap(18, 18, 18)
                .addComponent(asignacionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(revisadoLabel))
                .addGap(37, 37, 37)
                .addComponent(calificacionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            // TODO add your handling code here:
            if(!asig.isEstado()){
              System.out.println("Iniciando conexion con logica");
            DataInputStream in;
            DataOutputStream out;
            ObjectInputStream inObj;
            
            System.out.println("Socket a logica");
            Socket sc = new Socket(host, puerto);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            out.writeInt(3);
            out.writeInt(asig.getId());
//            boolean respuesta = in.readBoolean();
//            
//            if(respuesta){
                System.out.println("Actualizada");
                sc.close();
                parent.actualizarTabla();
                dispose();
//            }else{
//                System.out.println("Error en la revision");
//            }  
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(RevisarFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNotas;
    private javax.swing.JLabel asignacionLabel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel calificacionLabel;
    private javax.swing.JLabel cursoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel revisadoLabel;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}
