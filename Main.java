
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * atributos radio, es la Radio que funciona dentro del frame
 * NOTA: LAS ESTACIONES DE LA RADIO SON VOLÃ�TILES. AL TERMINAR EL PROGRAMA O APAGAR LA RADIO SE OLVIDAN. ESTO ES PARA NO ENVIAR
 * UN ARCHIVO DE TEXTO EXTRA EN DONDE GUARDE LOS DATOS. EN OTRA VERSIÃ“N SERÃ�A SENCILLO HACER QUE SE GUARDEN EN UN ARCHIVO DE TEXTO
 * @author javi-
 */
/**
 * @author jiio2
 *20/01/2021 - 20:06:39
 * 
 */
public class Main extends javax.swing.JFrame {

    /** The radio. */
    Manager radio = new Manager();
    
    /** The on. */
    boolean on;
    /**
     * enciende la radio, cambia de color el fondo e instancia un objeto Radio que es el atributo de la clase.
     *
     */
    public void encenderRadio() {
        this.on = true;
        this.panel.setBackground(Color.white);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
    }
     /**
     * apaga la radio, cambia de color el fondo y finaliza la aplicaciÃ³n.
     *
     */
    public void apagarRadio() {
        this.panel.setBackground(Color.black);
        tabla.setValueAt(0, 0, 0);
        this.on = false;
    }

    /**
     * Creates new form Main.
     */
    public Main() {
    	setResizable(false);
        initComponents();
    }

    /**Codigo generado por el Editor
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        encendido = new javax.swing.JButton();
        emisora9 = new javax.swing.JButton();
        emisora10 = new javax.swing.JButton();
        emisora11 = new javax.swing.JButton();
        emisora12 = new javax.swing.JButton();
        emisora5 = new javax.swing.JButton();
        emisora6 = new javax.swing.JButton();
        emisora7 = new javax.swing.JButton();
        emisora8 = new javax.swing.JButton();
        emisora1 = new javax.swing.JButton();
        emisora2 = new javax.swing.JButton();
        emisora3 = new javax.swing.JButton();
        emisora4 = new javax.swing.JButton();
        estacion = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        estacionactual = new javax.swing.JTextField();
        estacionactual.setHorizontalAlignment(SwingConstants.CENTER);
        guardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        encendido.setText("Encender/Apagar");
        encendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encendidoActionPerformed(evt);
            }
        });

        emisora9.setText("87.9");
        emisora9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora9ActionPerformed(evt);
            }
        });

        emisora10.setText("87.9");
        emisora10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora10ActionPerformed(evt);
            }
        });

        emisora11.setText("87.9");
        emisora11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora11ActionPerformed(evt);
            }
        });

        emisora12.setText("87.9");
        emisora12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora12ActionPerformed(evt);
            }
        });

        emisora5.setText("87.9");
        emisora5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora5ActionPerformed(evt);
            }
        });

        emisora6.setText("87.9");
        emisora6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora6ActionPerformed(evt);
            }
        });

        emisora7.setText("87.9");
        emisora7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora7ActionPerformed(evt);
            }
        });

        emisora8.setText("87.9");
        emisora8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora8ActionPerformed(evt);
            }
        });

        emisora1.setText("87.9");
        emisora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora1ActionPerformed(evt);
            }
        });

        emisora2.setText("87.9");
        emisora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora2ActionPerformed(evt);
            }
        });

        emisora3.setText("87.9");
        emisora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora3ActionPerformed(evt);
            }
        });

        emisora4.setText("87.9");
        emisora4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisora4ActionPerformed(evt);
            }
        });

        estacion.setText("AM/FM");
        estacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estacionActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        estacionactual.setText("FM");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Emisora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panelLayout.setHorizontalGroup(
        	panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(panelLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(panelLayout.createSequentialGroup()
        					.addGroup(panelLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(panelLayout.createSequentialGroup()
        							.addComponent(encendido)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(estacion, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
        						.addComponent(estacionactual, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
        						.addComponent(guardar, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        						.addGroup(panelLayout.createSequentialGroup()
        							.addComponent(anterior, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(siguiente))))
        				.addGroup(panelLayout.createSequentialGroup()
        					.addGroup(panelLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(emisora5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(emisora1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        						.addComponent(emisora9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(emisora6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(emisora7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(emisora10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(emisora2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        						.addComponent(emisora3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(panelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(emisora4, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        						.addComponent(emisora11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(emisora8, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        						.addComponent(emisora12, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        panelLayout.setVerticalGroup(
        	panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(panelLayout.createSequentialGroup()
        			.addGap(11)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        				.addGroup(panelLayout.createSequentialGroup()
        					.addGroup(panelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(encendido)
        						.addComponent(estacion))
        					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        					.addComponent(estacionactual, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)))
        			.addGap(6)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(anterior)
        				.addComponent(siguiente)
        				.addComponent(guardar))
        			.addGap(18)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emisora1)
        				.addComponent(emisora2)
        				.addComponent(emisora11))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emisora5)
        				.addComponent(emisora3)
        				.addComponent(emisora4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emisora9)
        				.addComponent(emisora10)
        				.addComponent(emisora8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(panelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emisora6)
        				.addComponent(emisora7)
        				.addComponent(emisora12))
        			.addContainerGap())
        );
        panel.setLayout(panelLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * boton que cambia la estacion de AM a FM.
     *
     * @param evt the evt
     */
    private void estacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estacionActionPerformed
        // TODO add your handling code here:
        if(this.on) {
            this.radio.cambiarEstacion();
            this.estacionactual.setText(radio.estacion());
            tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
            this.emisora1.setText(String.format("%.1f", this.radio.getRadio().getBoton(1)));
            this.emisora2.setText(String.format("%.1f", this.radio.getRadio().getBoton(2)));
            this.emisora3.setText(String.format("%.1f", this.radio.getRadio().getBoton(3)));
            this.emisora4.setText(String.format("%.1f", this.radio.getRadio().getBoton(4)));
            this.emisora5.setText(String.format("%.1f", this.radio.getRadio().getBoton(5)));
            this.emisora6.setText(String.format("%.1f", this.radio.getRadio().getBoton(6)));
            this.emisora7.setText(String.format("%.1f", this.radio.getRadio().getBoton(7)));
            this.emisora8.setText(String.format("%.1f", this.radio.getRadio().getBoton(8)));
            this.emisora9.setText(String.format("%.1f", this.radio.getRadio().getBoton(9)));
            this.emisora10.setText(String.format("%.1f", this.radio.getRadio().getBoton(10)));
            this.emisora11.setText(String.format("%.1f", this.radio.getRadio().getBoton(11)));
            this.emisora12.setText(String.format("%.1f", this.radio.getRadio().getBoton(0)));
        } else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }

    }//GEN-LAST:event_estacionActionPerformed
    
    /**
     * boton que enciende o apaga (segÃºn corresponda) la radio.
     *
     * @param evt the evt
     */
    private void encendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encendidoActionPerformed
        // TODO add your handling code here:
        if (this.on) {
            apagarRadio();
        } else {
            encenderRadio();
        }
    }//GEN-LAST:event_encendidoActionPerformed
    
    /**
     * boton que cambia la estacion a la anterior.
     *
     * @param evt the evt
     */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.anterior();
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_anteriorActionPerformed
    
    /**
     * boton que cambia la estacion a la siguiente.
     *
     * @param evt the evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.siguiente();
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_siguienteActionPerformed
    
    /**
     * botones para seleccionar cada emisora.
     *
     * @param evt the evt
     */
    private void emisora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora1ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(1);
        radio.set(1);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        } else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora1ActionPerformed
    
    /**
     * boton para guardar una emisora. Busca el primer boton que estÃ© vacÃ­o
     *
     * @param evt the evt
     */
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if(this.on){
            radio.guardar(radio.getBoton());
            int i = radio.getBoton();
            switch( i ){
                case 1:
                    this.emisora1.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 2:
                    this.emisora2.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 3:
                    this.emisora3.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 4:
                    this.emisora4.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 5:
                    this.emisora5.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 6:
                    this.emisora6.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 7:
                    this.emisora7.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 8:
                    this.emisora8.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 9:
                    this.emisora9.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 10:
                    this.emisora10.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 11:
                    this.emisora11.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
                case 0:
                    this.emisora12.setText(String.format("%.1f",radio.getRadio().getEmisora()));
                    break;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }

    }//GEN-LAST:event_guardarActionPerformed
    
    /**
     * botones para seleccionar cada emisora.
     *
     * @param evt the evt
     */
    private void emisora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora2ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(2);
        radio.set(2);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora2ActionPerformed

    /**
     * Emisora 3 action performed.
     *
     * @param evt the evt
     */
    private void emisora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora3ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(3);
        radio.set(3);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora3ActionPerformed

    /**
     * Emisora 4 action performed.
     *
     * @param evt the evt
     */
    private void emisora4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora4ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(4);
        radio.set(4);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora4ActionPerformed

    /**
     * Emisora 5 action performed.
     *
     * @param evt the evt
     */
    private void emisora5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora5ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(5);
        radio.set(5);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora5ActionPerformed

    /**
     * Emisora 6 action performed.
     *
     * @param evt the evt
     */
    private void emisora6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora6ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(6);
        radio.set(6);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora6ActionPerformed

    /**
     * Emisora 7 action performed.
     *
     * @param evt the evt
     */
    private void emisora7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora7ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(7);
        radio.set(7);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora7ActionPerformed

    /**
     * Emisora 8 action performed.
     *
     * @param evt the evt
     */
    private void emisora8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora8ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(8);
        radio.set(8);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora8ActionPerformed

    /**
     * Emisora 9 action performed.
     *
     * @param evt the evt
     */
    private void emisora9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora9ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(9);
        radio.set(9);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora9ActionPerformed

    /**
     * Emisora 10 action performed.
     *
     * @param evt the evt
     */
    private void emisora10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora10ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(10);
        radio.set(10);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora10ActionPerformed

    /**
     * Emisora 11 action performed.
     *
     * @param evt the evt
     */
    private void emisora11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora11ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(11);
        radio.set(11);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora11ActionPerformed

    /**
     * Emisora 12 action performed.
     *
     * @param evt the evt
     */
    private void emisora12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisora12ActionPerformed
        // TODO add your handling code here:
        if(this.on){
        radio.setBoton(0);
        radio.set(0);
        tabla.setValueAt(radio.getRadio().getEmisora(), 0, 0);
        }else {
            JOptionPane.showMessageDialog(null, "Encienda la radio primero");
        }
    }//GEN-LAST:event_emisora12ActionPerformed

    /**
     * Metodo magico generado para que se muestre en pantalla el JFrame.
     *
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    /** The anterior. */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    
    /** The emisora 1. */
    private javax.swing.JButton emisora1;
    
    /** The emisora 10. */
    private javax.swing.JButton emisora10;
    
    /** The emisora 11. */
    private javax.swing.JButton emisora11;
    
    /** The emisora 12. */
    private javax.swing.JButton emisora12;
    
    /** The emisora 2. */
    private javax.swing.JButton emisora2;
    
    /** The emisora 3. */
    private javax.swing.JButton emisora3;
    
    /** The emisora 4. */
    private javax.swing.JButton emisora4;
    
    /** The emisora 5. */
    private javax.swing.JButton emisora5;
    
    /** The emisora 6. */
    private javax.swing.JButton emisora6;
    
    /** The emisora 7. */
    private javax.swing.JButton emisora7;
    
    /** The emisora 8. */
    private javax.swing.JButton emisora8;
    
    /** The emisora 9. */
    private javax.swing.JButton emisora9;
    
    /** The encendido. */
    private javax.swing.JButton encendido;
    
    /** The estacion. */
    private javax.swing.JButton estacion;
    
    /** The estacionactual. */
    private javax.swing.JTextField estacionactual;
    
    /** The guardar. */
    private javax.swing.JButton guardar;
    
    /** The j button 1. */
    private javax.swing.JButton jButton1;
    
    /** The j scroll pane 1. */
    private javax.swing.JScrollPane jScrollPane1;
    
    /** The j scroll pane 2. */
    private javax.swing.JScrollPane jScrollPane2;
    
    /** The j table 1. */
    private javax.swing.JTable jTable1;
    
    /** The panel. */
    private javax.swing.JPanel panel;
    
    /** The siguiente. */
    private javax.swing.JButton siguiente;
    
    /** The tabla. */
    private javax.swing.JTable tabla;
    
    /**
     * The Class SwingAction.
     */
    // End of variables declaration//GEN-END:variables
	private class SwingAction extends AbstractAction {
		
		/**
		 * Instantiates a new swing action.
		 */
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		
		/**
		 * Action performed.
		 *
		 * @param e the e
		 */
		public void actionPerformed(ActionEvent e) {
		}
	}
}
