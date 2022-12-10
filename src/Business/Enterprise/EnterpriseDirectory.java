/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author japangor
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, int id){
        Enterprise enterprise=null;
        if( null!=type)switch (type) {
                case Hospital:
                    enterprise=new Hospital(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case TestingLab:
                    enterprise=new TestingLab(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case VaccinationCenter:
                    enterprise=new VaccinationCenter(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                case VaccineManufacturer:
                    enterprise=new VaccineManufacturer(name);
                    enterpriseList.add(enterprise);
                    enterprise.setEnterpriseId(id);
                    break;
                default:
                    break;
            }
            return enterprise;
    }
    public boolean checkIfEnterpriseNameIsUnique(String name){
        for (Enterprise e : enterpriseList){
            if (e.getOrganizationDirectory().getOrganization(name).equals(name))
                return false;
        }
        return true;
    }

    
        public boolean checkIfIDIsUnique(int ID){
        for (Enterprise  e : enterpriseList){
            if (e.getEnterpriseId()==ID)
                return false;
        }
        return true;
    }
    
}
