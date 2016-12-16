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
public class Room{
	private boolean sound = false, windows = false, light = false, tv = false;
	
	void setSound(boolean energy){
		if (energy == true)
			this.sound = !this.sound;
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
