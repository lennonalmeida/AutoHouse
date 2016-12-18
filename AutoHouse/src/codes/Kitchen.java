/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import GUI.TelaAlarme;

/**
 *
 * @author lennon
 */
public class Kitchen extends House{
	private boolean eletricOven = false, alarm = false, light = false, refrigerator = false;
        private short temperature, time, temprefri;
	
	public void setEletricOven(boolean forno){
		this.eletricOven = forno;
	}
        public boolean getEletricOven(){
            return this.eletricOven;
        }
        public void setTemperature(short temp){
            this.temperature = temp;
        }
        public short getTemperature(){
            return this.temperature;
        }
        
        public void setTime(short time){
            this.time = time;
        }
        public short getTime(){
            return this.time;
        }
                
        @Override
	public void setAlarm(boolean alarme){
		this.alarm = alarme;		
	}
        @Override
        public boolean getAlarm(){
            return this.alarm;
        }
        public boolean mudaAlarm(boolean atual){
            boolean alarme = !atual;
            return alarme;
        }
        public boolean alarme(short temperatura, short time){
            boolean active = false;
            
            if (temperatura > 50 && time > 3)
                active = true;
            
            
            return active;
        }
        
        
        
	public void setRefrigerator(boolean refrigerator){
		this.refrigerator = refrigerator;	
	}
        public boolean getRefrigerator(){
            return this.refrigerator;
        }
        public boolean mudaRefrigerator(boolean atual){
            boolean refrigerator = !atual;
            return refrigerator;
        }
        public void setTemp(short temp){
            this.temprefri =  temp;
        }
        public short getTemp(){
            return this.temprefri;
        }
        
	public void setLight(boolean luz){
		this.light = luz;
	}
        public boolean getLight(){
            return this.light;
        }
        public boolean mudaLight(boolean light){
            boolean luz = !light;
            return luz;
        }
}