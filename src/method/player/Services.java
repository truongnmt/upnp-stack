/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method.player;

/**
 *
 * @author Admins
 */
public interface Services {
    public interface AudioService {
        public int getVolume();
        public void setVolume(int value);
    }
    
    public interface PlayService {
        public void play();
        public void pause();
        public void stop();
        public String getMode();
    }

    public interface LightService {
        public boolean getStatus();
    }

    public interface PowerService {
        public void SwitchPower();
        public boolean getStatus();
        public void PowerOff();
        public void PowerOn();
    }
    
    public void remote(boolean b);
}
