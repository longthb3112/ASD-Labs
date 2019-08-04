package lab10.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PersonData personData = new PersonData();
        new GUI(personData);
        personData.addPerson(new Person("4","person 4"));
        personData.removePerson(new Person("4","person 4"));
    }
}
