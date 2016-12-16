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
public class Dormitory extends House {
	private boolean airConditioningSystem = false, windows = false, light = false, tv = false;

	void setAirCS(boolean energy){
		if (energy == true)
			this.airConditioningSystem = !this.airConditioningSystem;
	}
	void setWindows(boolean energy, boolean windowsAll){
		if (energy == true && windowsAll == true)
			this.windows = !this.windows;		
	}
	void setTV(boolean energy){
		if (energy == true)
			this.tv = !this.tv;	
	}
	void setLight(boolean energy){
		if (energy == true)
			this.light = !this.light;
	}
	
}
