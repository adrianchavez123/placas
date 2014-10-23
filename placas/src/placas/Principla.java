/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.DateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author adrian
 */
public class Principla extends javax.swing.JFrame {

    /**
     * Creates new form Principla
     */
    String archivo="";
    Conexion c;
    String nombre = "img/";
    ButtonGroup grupo = new ButtonGroup();
    JRadioButton rmodelo = new JRadioButton("Modelo");
    JRadioButton rmarca = new JRadioButton("Marca");
    JRadioButton rplaca = new JRadioButton("Placa");
    JTextField buscar = new JTextField();
    JButton btnBuscar = new JButton("BUSCAR");
    JTable table = new JTable();
    
    
    public Principla() {
        c = new Conexion();
        c.conectar();
        
        initComponents();
        buttonGroup1.add(infraccion);
        buttonGroup1.add(accidente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        infraccion = new javax.swing.JRadioButton();
        accidente = new javax.swing.JRadioButton();
        fecha = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(965, 444));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Placa automovil");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 38, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 73, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 115, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Color");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Causa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Imagen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        jPanel1.add(placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 42, 296, -1));
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 119, 296, -1));
        jPanel1.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 77, 296, -1));
        jPanel1.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 154, 296, -1));

        jButton1.setText("Cargar imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 360, -1, -1));

        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 394, -1, -1));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 357, 412, 26));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 45, 334, 278));

        infraccion.setText("Infraccion");
        jPanel1.add(infraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        accidente.setText("Accidente");
        jPanel1.add(accidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 190, -1));

        jMenu1.setText("Agregar");

        jMenuItem1.setText("Agregar Registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Buscar");

        jMenuItem2.setText("Buscar Registro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Modificar");

        jMenuItem3.setText("Modificar Registro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:agregar
        mostrarRegistro(1);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here: buscar
        mostrarRegistro(2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            nombre = "img/";
            JFileChooser fileOpen = new JFileChooser();
    //        FileFilter filter = new FileNameExtensionFilter("bmp files", "bmp");
    //        fileOpen.addChoosableFileFilter(filter);
            String[] suffices = ImageIO.getReaderFileSuffixes();

            // Add a file filter for each one
            for (int i = 0; i < suffices.length; i++) {
                FileFilter filter = new FileNameExtensionFilter(suffices[i] + " Archivos", suffices[i]);
                fileOpen.addChoosableFileFilter(filter);
            }
            int ret = fileOpen.showDialog(null, "Abrir Archivo");
            if (ret == JFileChooser.APPROVE_OPTION) {

                File selectedFile = fileOpen.getSelectedFile();
                archivo = selectedFile.getAbsolutePath();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                nombre+= selectedFile.getName();
                imagen.setText(selectedFile.getAbsolutePath());
                ImageIcon img = new ImageIcon(selectedFile.getAbsolutePath());

                
                jLabel8.setIcon(img);
                jLabel8.setBounds(450, 50, 330, 280);
            } else {

            }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Ocurrio un error al cargar la imagen.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(placa.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"El campo placa es obligatorio.");
       }
       else if(modelo.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"El campo modelo es obligatorio.");
       }
       else if(marca.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"El campo marca es obligatorio.");
       }
       else if(color.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this,"El campo color es obligatorio.");
       }
       else if(fecha.getDate().equals(""))
       {
           JOptionPane.showMessageDialog(this,"El campo fecha es obligatorio.");
       }
       else if(!infraccion.isSelected() && !accidente.isSelected())
       {
           JOptionPane.showMessageDialog(this,"El campo accidente es obligatorio.");
       }
       else
       {
           Date date = fecha.getDate();
           String strDate = DateFormat.getDateInstance().format(date);
           java.sql.Date sqlDate = new java.sql.Date(date.getTime());

           //JOptionPane.showMessageDialog(this,sqlDate);
           int r=0;
           if(infraccion.isSelected())
           {
               r=1;
           }
           else
           {    
               r=2;
           }
            if(c.ingresar(placa.getText(), modelo.getText(), marca.getText(), color.getText(),r , sqlDate.toString(),nombre))
           {
               copy(archivo, nombre);
               JOptionPane.showMessageDialog(this,"Registro ingresado.");
               limpiar();
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Ocurrio un error.");
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        mostrarRegistro(3);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    private void copy(String source, String fg)
    {
        InputStream inStream = null;
	OutputStream outStream = null;
 
    	try{
 
    	    File afile =new File(source);
    	    File bfile =new File(fg);
 
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
    private void limpiar()
    {
        placa.setText("");
        modelo.setText("");
        marca.setText("");
        color.setText("");
        fecha.setDate(null);
      /*  propietario.setText("");
        jTextArea1.setText("");*/
        jLabel8.setText("");
        imagen.setText("");
        jLabel8.setIcon(null);
        archivo = "";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton accidente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField color;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel imagen;
    private javax.swing.JRadioButton infraccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField placa;
    // End of variables declaration//GEN-END:variables

    private void mostrarRegistro(int i) {
        
        switch(i)
        {
            case 1:
            {
                jPanel1.setVisible(true);
                break;
            }
            
            case 2:
            {
                
                jPanel1.setVisible(false);
                
                grupo.add(rmarca);
                grupo.add(rmodelo);
                grupo.add(rplaca);
                rmarca.setBounds(50,10,100,48);
                rmodelo.setBounds(50,40,100,48);
                rplaca.setBounds(50,70,100,48);
                buscar.setBounds(200,50,200,48);
                btnBuscar.setBounds(400,50,80,48);
                table.setBounds(50,150,940,300);
                
                rmarca.setVisible(true);
                rmodelo.setVisible(true);
                rplaca.setVisible(true);
                buscar.setVisible(true);
                btnBuscar.setVisible(true);
                table.setVisible(true);
                
                add(rmarca);
                add(rmodelo);
                add(rplaca);
                add(buscar);
                add(btnBuscar);
                add(table);
                this.repaint();
                
                
                
                
                
                break;
            }
        }
    }
}
