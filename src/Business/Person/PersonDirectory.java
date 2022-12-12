/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author hetalp
 */
public class PersonDirectory {

    ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<Person>();

        Person p1 = new Person(1, "VirendraSehwag", "Delhi", "02120", 44, "Mission Main", "4444444444", "sehwag@gmail.com");
        Person p2 = new Person(2, "Gautam Gambhir", "KKR", "02121", 41, "Mission Main", "5555555555", "gautam@gmail.com");
        Person p3 = new Person(3, "Virat Kohli", "RCB", "02130", 34, "Mission Main", "1818181818", "virat@gmail.com");
        Person p4 = new Person(4, "Surya Kumar Yadav", "MI", "02120", 32, "Mission Main", "6363636363", "surya@gmail.com");
        Person p5 = new Person(5, "Ravindra Jadeja", "CSK", "02120", 34, "Mission Main", "8888888888", "jaddega@gmail.com");
        Person p6 = new Person(6, "LT.COl Mahendra Singh Dhoni", "CSK", "04120", 41, "Mission Main", "7777777777", "mahi@gmail.com");
        Person p7 = new Person(7, "Hardik Pandya", "GT", "02120", 29, "Mission Main", "3333333333", "hardik@gmail.com");
        Person p8 = new Person(8, "Suresh Raina", "CSK", "02180", 36, "Mission Main", "3333333333", "suresh@gmail.com");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public Person newPerson(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {

        Person person = new Person(personID, name, street, zipcode, age, Community, phoneNo, email);
        personList.add(person);
        return person;
    }

    public void updatePerson(Person person, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {
        person.setName(name);
        person.setStreet(street);
        person.setZipcode(zipcode);
        person.setAge(age);
        person.setCommunity(Community);
        person.setPhoneNo(phoneNo);
        person.setEmail(email);
    }

    public Person findPerson(int id) {

        for (Person p : personList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

    public void deletePerson(Person person) {
        personList.remove(person);
    }

    public boolean checkIfNameIsDiff(String name) {
        for (Person p : personList) {
            if (p.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfEmailIsUnique(String email) {
        for (Person p : personList) {
            if (p.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfIDIsDiff(int ID) {
        for (Person p : personList) {
            if (p.getPersonID() == ID) {
                return false;
            }
        }
        return true;
    }

}
