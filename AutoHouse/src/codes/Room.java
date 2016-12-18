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
public class Room extends House{
	private boolean sound = false, windows = false, light = false, tv = false;
	
	public void setSound(boolean sound){
        	this.sound = sound;
	}
	public void setWindow(boolean windows){
		this.windows = windows;		
	}
	public void setTV(boolean tv){
        	this.tv = tv;	
	}
        @Override
	public void setLight(boolean light){
        	this.light = light;
	}
        public boolean getWindow(){
            return this.windows;
        }
        @Override
        public boolean getLight(){
            return this.light;
        }
        @Override
        public boolean mudaLuz(boolean atual){
            boolean light = !atual;
            return light;
        }
        
        public boolean mudaJanela(boolean atual){
            boolean janela = !atual;
            return janela;
        }
}
