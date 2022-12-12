/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TestReport;

import Business.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hetalp
 */
public class TestRepDirectory {
    
   ArrayList<TestReport> testReportList=new ArrayList<TestReport>();

    public ArrayList<TestReport> getTestReportList() {
        return testReportList;
    }

    public void setTestReportList(ArrayList<TestReport> testReportList) {
        this.testReportList = testReportList;
    }
   
   public TestReport newTestReport(Boolean result){
       TestReport testReport = new TestReport(result);
       testReportList.add(testReport);
       return testReport;
   }
   
   
   
    
    
            
            
}
