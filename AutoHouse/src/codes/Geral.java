/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author lennon
 */
public class Geral extends House{
    private boolean alarm = false, gate = true;
        
	
    @Override
	public void setAlarm(boolean alarm){
		this.alarm = alarm;		
	}
    @Override
	public void setGate(boolean gate){
		this.gate = gate;		
	}
    @Override
	public boolean getAlarm(){
            return this.alarm;
        }
    @Override
        public boolean getGate(){
            return this.gate;
        }
        //mudanças
    @Override
        public boolean mudaPortao(boolean atual){
            boolean gate = !atual;
            return gate;
        }
    @Override
        public boolean mudaAlarme(boolean atual){
            boolean alarme = !atual;
            return alarme;
        }
}
