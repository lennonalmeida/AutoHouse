/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import javax.swing.JOptionPane;

/**
 *
 * @author lennon
 */
public class Dormitory extends House implements TV{
	private boolean airConditioningSystem = false, windows = false, light = false, tv = false;
        private int temperatura, channel;
        private String canal[] = {"Globo", "Band", "Record", "Projeto Newtom"};
        private int vol[] = {0,1,2,3,4,5,6,7,8,9,10};
        
        public String getCanal(int canal){
            return this.canal[canal];
        }
        public int getVolume(int volume){
            return this.vol[volume];
        }
        
        public void setTemp(int temp){
            this.temperatura = temp;
        }
        public int getTemp(){
            return this.temperatura;
        }

	public boolean mudaJanela(boolean atual){
            boolean janela = !atual;
            return janela;
        }
        @Override
        public boolean mudaLuz(boolean atual){
            boolean light = !atual;
            return light;
        }

    public boolean getAirConditioningSystem() {
        return this.airConditioningSystem;
    }

    public void setAirConditioningSystem(boolean airConditioningSystem) {
        this.airConditioningSystem = airConditioningSystem;
    }

    public boolean getWindows() {
        return this.windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }
    @Override
    public boolean getLight() {
        return this.light;
    }
    @Override
    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean getTv() {
        return this.tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    

    @Override
    public int mudaVolume(int volume) {
        int retorno = volume;
        try{
            this.getVolume(volume);
        }catch(ArrayIndexOutOfBoundsException e){
            if (volume > 10){
                JOptionPane.showMessageDialog(null, "Volume maximo");
                retorno = 10;
            }
            else if(volume < 0){
                JOptionPane.showMessageDialog(null, "Mudo");
                retorno = 0;
            }
        }
        return retorno;
    }
    @Override
    public int mudaCanal(int canal) {
        int retorno = canal;
        canal -= 1;
            try{
                this.getCanal(canal);
            }catch(ArrayIndexOutOfBoundsException e){
                 if (canal < 0) retorno = 4;
                 else retorno = 1;
            }
        return retorno;
    }
}
