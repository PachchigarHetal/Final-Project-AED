/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;
import java.util.Date;
/**
 *
 * @author meghi
 */
public class VitalSigns {
        private int BloodPressure;
    private double temperature;
    private int SPO2Level;
    private Date date;

    VitalSigns(int BloodPressure, double temperature, int SPO2Level) {
        this.BloodPressure=BloodPressure;
        this.SPO2Level=SPO2Level;
        this.temperature=temperature;
        this.date=new Date();//To change body of generated methods, choose Tools | Templates.
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getSPO2Level() {
        return SPO2Level;
    }

    public void setSPO2Level(int SPO2Level) {
        this.SPO2Level = SPO2Level;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
