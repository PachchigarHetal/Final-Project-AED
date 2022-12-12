/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TestReport;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author hetalp
 */
public class TestReport {
    
//     private Person person;
    private boolean result;

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    
    public TestReport( Boolean result){
        this.result = result;
    }
    
}
