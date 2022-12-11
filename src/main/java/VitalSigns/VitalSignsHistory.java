package Business.VitalSigns;

import Business.Vaccine.Vaccine;
import java.util.ArrayList;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meghi
 */
public class VitalSignsHistory {
 private ArrayList<VitalSigns> vitalDir; 
    
    public VitalSignsHistory(){
        vitalDir = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalDir() {
        return vitalDir;
    }

    public void setVitalDir(ArrayList<VitalSigns> vitalDir) {
        this.vitalDir = vitalDir;
    }

    public VitalSigns addVitalDir(int BloodPressure, double temperature, int SPO2Level) {
        VitalSigns v = new VitalSigns(BloodPressure, temperature, SPO2Level);
        vitalDir.add(v);
        return v;
    }
}
