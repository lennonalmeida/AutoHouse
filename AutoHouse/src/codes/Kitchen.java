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
public class Kitchen{
	private boolean eletricOven = false, alarm = false, light = false, refrigerator = false;
	
	void setEletricOven(boolean energy){
		if (energy == true)
			this.eletricOven = !this.eletricOven;
	}
	void setAlarm(boolean energy){
		if (energy == true)
			this.alarm = !this.alarm;		
	}
	void setRefrigerator(boolean energy){
		if (energy == true)
			this.refrigerator = !this.refrigerator;	
	}
	void setLight(boolean energy){
		if (energy == true)
			this.light = !this.light;
	}
	
	
}