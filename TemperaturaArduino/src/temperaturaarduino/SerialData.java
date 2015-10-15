package temperaturaarduino;

import java.io.BufferedWriter;
import jssc.SerialPort;
import jssc.SerialPortList;
import jssc.SerialPortException;

import javax.swing.SwingWorker;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SerialData extends SwingWorker<Void, String>{
    private String nombrePuerto;
    private JProgressBar sensores[];
    private JLabel sensoresLabel[];
    private BufferedWriter file;
    private int segundos;
    private SerialPort puerto;
    
    public SerialData(String nombrePuerto, JProgressBar sensores[], JLabel sensoresLabel[]){
        this.nombrePuerto = nombrePuerto;
        this.sensores = sensores;
        this.sensoresLabel = sensoresLabel;
    }
    
    public void setFile(BufferedWriter file){
        this.file = file;
    }
    
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    @Override
    protected Void doInBackground() throws SerialPortException, InterruptedException, IOException{        
        puerto = new SerialPort(nombrePuerto);
        puerto.openPort();
        puerto.setParams(9600, 8, 1, 0);
        Thread.sleep(2500); // Espera 2 segundos hasta que el arduino este listo
        
        String buffer = "";
        long tiempoInicio = System.currentTimeMillis(); // tiempo de inicio del ciclo
        while( (segundos == 0) || (System.currentTimeMillis() - tiempoInicio < segundos * 1000)){
            String byteActual = puerto.readString(1);
            if(!"\n".equals(byteActual)){
                buffer = buffer + byteActual;
            }else{
                publish(buffer);
                buffer = "";
            }
        }
        return null;
    }
    
    @Override
    protected void process(List<String> chunks) {     
        String[] valores = new String[8];
        for(String letra : chunks){
            valores = letra.split(",");
            if(file != null){
                try {
                    file.append(letra);
                    file.append("\n");
                    file.flush();
                } catch (IOException ex) {
                    
                } 
            }
        }
        for(int i = 0; i < sensores.length; i++){
            sensores[i].setValue((int)Float.parseFloat(valores[i]));
            sensoresLabel[i].setText(valores[i]);
        }
    }
    
    @Override
    protected void done() {
        if(puerto != null){
            try {
                puerto.closePort();
            } catch (SerialPortException ex) {
                JOptionPane.showMessageDialog(null, "Error al cerrar el puerto.");
            }
        }
        for(JProgressBar barra : sensores){
            barra.setValue(0);
        }
        for(JLabel label : sensoresLabel){
            label.setText("000");
        }
        try {
            if(file != null){
                file.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar el archivo.");
        }
        JOptionPane.showMessageDialog(null, "Finalizado.");
    }
    
    public static String[] getSerialList(){
        return SerialPortList.getPortNames();
    }
}
