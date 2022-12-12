/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccinationCenter;
import Business.Person.Person;

/**
 *
 * @author meghi
 */
public class VaccinationCenterStaff extends Person{
public VaccinationCenterStaff(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {
        super(personID, name, street, zipcode, age, Community, phoneNo, email);
    }
    
     
}
