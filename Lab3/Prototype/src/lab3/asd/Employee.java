package lab3.asd;

import java.util.Arrays;

public class Employee implements  Cloneable {
    private int id;
    private String lastname;
    private String firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", supervisor=" + supervisor +
                '}';
    }

    @Override
    public Object clone(){
        Employee employee = new Employee();
        employee.id = this.id;
        employee.lastname = this.lastname;
        employee.firstname = this.firstname;
        employee.streetAddress = this.streetAddress;
        employee.city = this.city;
        employee.state = this.state;
        employee.zipcode = this.zipcode;
        if(supervisor != null){
            employee.supervisor = (Employee) this.supervisor.clone();
        }
        if(this.staff  != null && this.staff.length > 0){
            employee.staff = new Employee[10];
            for(int i=0;i< this.staff.length;i++){
                if(this.staff[i].id != this.id){
                    employee.staff[i] = (Employee) this.staff[i].clone();
                }else{
                    employee.staff[i] = this;
                }

            }
        }
        return employee;
    }
}
