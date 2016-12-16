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
public class House{
    	private boolean alarm = false, gate = true, windows_all = true, energy = false; 
	
	public void setAlarm(boolean io){
		this.alarm = !io;		
	}
	public void setGate(boolean io){
		this.gate = !io;		
	}
	public void setWindowsAll(boolean io){
		this.windows_all = !io;		
	}
	public void setEnergy(boolean io){
		this.energy = !io;		
	}
	public boolean getEnergy(){
		return energy;		
	}
	public boolean getWindowsAll(){
		return windows_all;		
	}
        public boolean getAlarm(){
            return this.alarm;
        }
        public boolean getGate(){
            return this.gate;
        }
        //problema
        
}