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

        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        listaPuertos = new javax.swing.JComboBox();
        botonActualizar = new javax.swing.JButton();
        sensor1 = new javax.swing.JProgressBar();
        sensor2 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelSensor1 = new javax.swing.JLabel();
        labelSensor2 = new javax.swing.JLabel();
        sensor3 = new javax.swing.JProgressBar();
        labelSensor3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sensor4 = new javax.swing.JProgressBar();
        labelSensor4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sensor5 = new javax.swing.JProgressBar();
        labelSensor5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sensor6 = new javax.swing.JProgressBar();
        labelSensor6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sensor7 = new javax.swing.JProgressBar();
        labelSensor7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sensor8 = new javax.swing.JProgressBar();
        labelSensor8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        guardarOpcion = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        filePath = new javax.swing.JTextField();
        botonExplorar = new javax.swing.JButton();
        temporizadorOpcion = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tiempoHoras = new javax.swing.JSpinner();
        tiempoMinutos = new javax.swing.JSpinner();
        tiempoSegundos = new javax.swing.JSpinner();

        jLabel12.setText("Minutos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperatura");
        setLocationByPlatform(true);
        setResizable(false);

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

        sensor1.setMaximum(150);
        sensor1.setOrientation(1);

        sensor2.setMaximum(150);
        sensor2.setOrientation(1);

        jLabel1.setText("T1");

        jLabel2.setText("T2");

        labelSensor1.setText("000");

        labelSensor2.setText("000");

        sensor3.setMaximum(150);
        sensor3.setOrientation(1);

        labelSensor3.setText("000");

        jLabel3.setText("T3");

        sensor4.setMaximum(150);
        sensor4.setOrientation(1);

        labelSensor4.setText("000");

        jLabel4.setText("T4");

        sensor5.setMaximum(150);
        sensor5.setOrientation(1);

        labelSensor5.setText("000");

        jLabel5.setText("T5");

        sensor6.setMaximum(150);
        sensor6.setOrientation(1);

        labelSensor6.setText("000");

        jLabel6.setText("T6");

        sensor7.setMaximum(150);
        sensor7.setOrientation(1);

        labelSensor7.setText("000");

        jLabel7.setText("T7");

        sensor8.setMaximum(150);
        sensor8.setOrientation(1);

        labelSensor8.setText("000");

        jLabel8.setText("T8");

        guardarOpcion.setText("guardar");

        jLabel9.setText("Programar");

        botonExplorar.setText("Explorar");
        botonExplorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonExplorarMousePressed(evt);
            }
        });

        temporizadorOpcion.setText("temporizador");

        jLabel10.setText("Horas");

        jLabel11.setText("Minutos");

        jLabel13.setText("Segundos");

        tiempoHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tiempoHoras.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel9))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temporizadorOpcion)
                                .addGap(18, 18, 18)
                                .addComponent(tiempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tiempoSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardarOpcion)
                                .addGap(18, 18, 18)
                                .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonExplorar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sensor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(labelSensor1))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelSensor2)
                                                .addGap(31, 31, 31)
                                                .addComponent(labelSensor3))
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(labelSensor4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(labelSensor5))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(labelSensor6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(labelSensor7))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sensor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(labelSensor8))))
                        .addGap(0, 157, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSensor1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelSensor2)
                                .addComponent(labelSensor3)
                                .addComponent(labelSensor4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSensor5)
                            .addComponent(labelSensor6)
                            .addComponent(labelSensor7)
                            .addComponent(labelSensor8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sensor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sensor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sensor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarOpcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonExplorar)
                        .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(temporizadorOpcion)
                        .addComponent(tiempoHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addComponent(tiempoMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tiempoSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciar)
                    .addComponent(listaPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizar))
                .addContainerGap())
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
