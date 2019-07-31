package lab3.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee supervisor = new Employee();
        supervisor.setId(1);
        supervisor.setFirstname("Supervisor");
        supervisor.setLastname("Tran");

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstname("Long");
        employee1.setLastname("Tran");
        employee1.setSupervisor(supervisor);

        supervisor.setStaff(new Employee[]{employee1});

        Employee employeeClone = (Employee) employee1.clone();
        System.out.println(employeeClone);
    }
}
