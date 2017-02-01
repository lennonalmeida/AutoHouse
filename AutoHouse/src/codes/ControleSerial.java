/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author lennon.ribeiro
 */
public class ControleSerial{
  private OutputStream serialOut;
  private int taxa;
  private String portaCOM;
 
   public ControleSerial(String portaCOM, int taxa) {
    this.portaCOM = portaCOM;
    this.taxa = taxa;
    this.initialize();
  }     

  //verifica a situação da porta serial
  private void initialize() {
    try {
      CommPortIdentifier portId = null;
      try {
        //Tenta verificar se a porta COM informada existe
        portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
      }catch (NoSuchPortException npe) {
        //Caso a porta COM não exista será exibido um erro 
        JOptionPane.showMessageDialog(null, "Porta COM não encontrada.",
                  "Porta COM", JOptionPane.PLAIN_MESSAGE);
      }
      //Abre a porta COM 
      SerialPort port = (SerialPort) portId.open("Comunicação serial", this.taxa);
      serialOut = port.getOutputStream();
      port.setSerialPortParams(this.taxa, 
                               SerialPort.DATABITS_8, 
                               SerialPort.STOPBITS_1, 
                               SerialPort.PARITY_NONE); 
    }catch (Exception e) {
      e.printStackTrace();
    }
}
 
   public void close() {
    try {
        serialOut.close();
    }catch (IOException e) {
      JOptionPane.showMessageDialog(null, "Não foi possível fechar porta COM.",
                "Fechar porta COM", JOptionPane.PLAIN_MESSAGE);
    }
  }
 

  public void enviaDados(int opcao){
    try {
      serialOut.write(opcao);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Não foi possível enviar o dado. ",
                "Enviar dados", JOptionPane.PLAIN_MESSAGE);
    }
  } 
}