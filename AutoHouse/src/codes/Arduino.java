/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author lennon.ribeiro
 */
public class Arduino {
  private ControleSerial arduino;
  
  /**
   * Construtor da classe Arduino
   */
  public Arduino(){
      arduino = new ControleSerial("COM4",9600);//Windows - porta e taxa de transmissão
 }    
 
 
  public void comunicacaoArduino(boolean button) {   
    
        if(button == true)
            arduino.enviaDados(49);
        else if (button == false)
                arduino.enviaDados(50);
        else 
            arduino.close();
   }
}
