/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Organization;



import Business.Organization.Organization.Type;
import java.util.ArrayList;



/**
*
* @author hetalp
*/
public class OrganizationDirectory {

private ArrayList<Organization> organizationList;



    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }



    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

public Organization createOrganization(Type type, String name){
    Organization organization = null;
    if (type.getValue().equals(Type.Doctor.getValue())){
        organization = new DoctorOrganization(name);
        organizationList.add(organization);
       }
    else if (type.getValue().equals(Type.DeliveryManager.getValue())){
        organization = new DeliveryManOrganization(name);
        organizationList.add(organization);
       }
    else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
        organization = new HospitalAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.HospitalStaff.getValue())){
        organization = new HospitalStaffOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.Patient.getValue())){
        organization = new PatientOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.SystemAdmin.getValue())){
        organization = new SystemAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.TestingLabAdmin.getValue())){
        organization = new TestingLabAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccinationCenterAdmin.getValue())){
        organization = new VaccinationCenterAdminOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccinationCenterStaff.getValue())){
        organization = new VaccineCenterStaffOrganization(name);
        organizationList.add(organization);
        }
    else if (type.getValue().equals(Type.VaccineManufacturerAdmin.getValue())){
        organization = new VaccineManufacturerOrganization(name);
        organizationList.add(organization);
        }

    return organization;
    }

    public void removeOrganization(Organization org){
        organizationList.remove(org);
    }

    public Organization getOrganization(String name){
        for(Organization o : organizationList){
        if(o.getName().equalsIgnoreCase(name)){
            return o;
    }
        }
        return null;
    }
    }