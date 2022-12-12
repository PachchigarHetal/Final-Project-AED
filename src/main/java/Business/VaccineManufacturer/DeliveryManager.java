/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineManufacturer;

/**
 *
 * @author meghi
 */
public class DeliveryManager extends Person{
    private int DeliveryManagerId;

    public DeliveryManager(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {
        super(personID, name, street, zipcode, age, Community, phoneNo, email);
    }
    
    public int getDeliveryManagerId() {
        return DeliveryManagerId;
    }

    public void setDeliveryManagerId(int DeliveryManagerId) {
        this.DeliveryManagerId = DeliveryManagerId;
    }
    
    
}
