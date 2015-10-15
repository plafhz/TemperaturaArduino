package temperaturaarduino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Vista extends javax.swing.JFrame {
    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelSensor1 = new javax.swing.JLabel();
        sensor1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        labelSensor2 = new javax.swing.JLabel();
        sensor2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        labelSensor3 = new javax.swing.JLabel();
        sensor3 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        labelSensor4 = new javax.swing.JLabel();
        sensor4 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        labelSensor5 = new javax.swing.JLabel();
        sensor5 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        labelSensor6 = new javax.swing.JLabel();
        sensor6 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        labelSensor7 = new javax.swing.JLabel();
        sensor7 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        labelSensor8 = new javax.swing.JLabel();
        sensor8 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        guardarOpcion = new javax.swing.JCheckBox();
        filePath = new javax.swing.JTextField();
        botonExplorar = new javax.swing.JButton();
        temporizadorOpcion = new javax.swing.JCheckBox();
        tiempoHoras = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        tiempoMinutos = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        tiempoSegundos = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        botonIniciar = new javax.swing.JButton();
        listaPuertos = new javax.swing.JComboBox();
        botonActualizar = new javax.swing.JButton();

        jLabel12.setText("Minutos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperatura");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setLayout(new java.awt.GridBagLayout());

        labelSensor1.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel3.add(labelSensor1, gridBagConstraints);

        sensor1.setMaximum(150);
        sensor1.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel3.add(sensor1, gridBagConstraints);

        jLabel1.setText("T1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        labelSensor2.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel3.add(labelSensor2, gridBagConstraints);

        sensor2.setMaximum(150);
        sensor2.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel3.add(sensor2, gridBagConstraints);

        jLabel2.setText("T2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        labelSensor3.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel3.add(labelSensor3, gridBagConstraints);

        sensor3.setMaximum(150);
        sensor3.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        jPanel3.add(sensor3, gridBagConstraints);

        jLabel3.setText("T3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        labelSensor4.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 0, 0);
        jPanel3.add(labelSensor4, gridBagConstraints);

        sensor4.setMaximum(150);
        sensor4.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 0);
        jPanel3.add(sensor4, gridBagConstraints);

        jLabel4.setText("T4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        labelSensor5.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 22, 0, 0);
        jPanel3.add(labelSensor5, gridBagConstraints);

        sensor5.setMaximum(150);
        sensor5.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 0, 0);
        jPanel3.add(sensor5, gridBagConstraints);

        jLabel5.setText("T5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 0, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        labelSensor6.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel3.add(labelSensor6, gridBagConstraints);

        sensor6.setMaximum(150);
        sensor6.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel3.add(sensor6, gridBagConstraints);

        jLabel6.setText("T6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 17, 0, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        labelSensor7.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel3.add(labelSensor7, gridBagConstraints);

        sensor7.setMaximum(150);
        sensor7.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        jPanel3.add(sensor7, gridBagConstraints);

        jLabel7.setText("T7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 16, 0, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        labelSensor8.setText("000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 0, 218);
        jPanel3.add(labelSensor8, gridBagConstraints);

        sensor8.setMaximum(150);
        sensor8.setOrientation(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 136;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 218);
        jPanel3.add(sensor8, gridBagConstraints);

        jLabel8.setText("T8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 19;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 15, 0, 0);
        jPanel3.add(jLabel8, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("Programar");
        jPanel4.add(jLabel9, new java.awt.GridBagConstraints());

        guardarOpcion.setText("guardar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jPanel4.add(guardarOpcion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jPanel4.add(filePath, gridBagConstraints);

        botonExplorar.setText("Explorar");
        botonExplorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonExplorarMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 35);
        jPanel4.add(botonExplorar, gridBagConstraints);

        temporizadorOpcion.setText("temporizador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 0);
        jPanel4.add(temporizadorOpcion, gridBagConstraints);

        tiempoHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tiempoHoras.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel4.add(tiempoHoras, gridBagConstraints);

        jLabel10.setText("Horas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 4, 0, 0);
        jPanel4.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 4, 10, 0);
        jPanel4.add(tiempoMinutos, gridBagConstraints);

        jLabel11.setText("Minutos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 4, 0, 0);
        jPanel4.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 4, 10, 0);
        jPanel4.add(tiempoSegundos, gridBagConstraints);

        jLabel13.setText("Segundos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 4, 0, 0);
        jPanel4.add(jLabel13, gridBagConstraints);

        botonIniciar.setText("Iniciar");
        botonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIniciarMousePressed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonActualizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonActualizar))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciar)
                    .addComponent(listaPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMousePressed
        listaPuertos.removeAllItems();
        for(String puerto : SerialData.getSerialList()){
            listaPuertos.addItem(puerto);
        }
    }//GEN-LAST:event_botonActualizarMousePressed

    private void botonIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMousePressed
        String puertoSeleccionado;
        try{
            puertoSeleccionado = listaPuertos.getSelectedItem().toString();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Seleccione un puerto valido.");
            return;
        }
        JProgressBar sensores[] = {
            sensor1,sensor2,sensor3,sensor4,
            sensor5,sensor6,sensor7,sensor8
        };
        JLabel sensoresLabel[] = {
            labelSensor1, labelSensor2, labelSensor3, labelSensor4,
            labelSensor5, labelSensor6, labelSensor7, labelSensor8
        };        
        SerialData serial = new SerialData(puertoSeleccionado, sensores, sensoresLabel);
        
        int errores = 0; // se acumula segun encuentra errores para saber si ejecutar la lectura
        if(guardarOpcion.isSelected()){
            try {
                BufferedWriter archivo = new BufferedWriter(new FileWriter(filePath.getText()));
                serial.setFile(archivo);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar el fichero.");
                errores++;
            }
        }
        
        if(temporizadorOpcion.isSelected()){
            try{
                int tiempo = (Integer)tiempoHoras.getValue() * 3600 + 
                             (Integer)tiempoMinutos.getValue() * 60 +
                             (Integer)tiempoSegundos.getValue();
                if(tiempo > 0){
                    serial.setSegundos(tiempo);
                }else{
                    JOptionPane.showMessageDialog(this, "El tiempo debe ser mayor que 0");
                    errores++;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error en el temporizador.");
                errores++;
            }
        }
        
        if(errores == 0){
            serial.setBotonInicio(botonIniciar);
            serial.execute();
            botonIniciar.setEnabled(false);
        }
    }//GEN-LAST:event_botonIniciarMousePressed
    
    private void botonExplorarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExplorarMousePressed
        JFileChooser saveFile = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("csv", "csv");
        saveFile.setFileFilter(filtro);
        int returnValor = saveFile.showSaveDialog(this);
        if(returnValor == JFileChooser.APPROVE_OPTION){
            filePath.setText(saveFile.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_botonExplorarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonExplorar;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JTextField filePath;
    private javax.swing.JCheckBox guardarOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelSensor1;
    private javax.swing.JLabel labelSensor2;
    private javax.swing.JLabel labelSensor3;
    private javax.swing.JLabel labelSensor4;
    private javax.swing.JLabel labelSensor5;
    private javax.swing.JLabel labelSensor6;
    private javax.swing.JLabel labelSensor7;
    private javax.swing.JLabel labelSensor8;
    private javax.swing.JComboBox listaPuertos;
    private javax.swing.JProgressBar sensor1;
    private javax.swing.JProgressBar sensor2;
    private javax.swing.JProgressBar sensor3;
    private javax.swing.JProgressBar sensor4;
    private javax.swing.JProgressBar sensor5;
    private javax.swing.JProgressBar sensor6;
    private javax.swing.JProgressBar sensor7;
    private javax.swing.JProgressBar sensor8;
    private javax.swing.JCheckBox temporizadorOpcion;
    private javax.swing.JSpinner tiempoHoras;
    private javax.swing.JSpinner tiempoMinutos;
    private javax.swing.JSpinner tiempoSegundos;
    // End of variables declaration//GEN-END:variables
}
