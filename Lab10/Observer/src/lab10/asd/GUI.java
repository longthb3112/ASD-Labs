package lab10.asd;

public class GUI implements Observer {
    public GUI(PersonData personData) {
        personData.attach(this);
    }

    @Override
    public void updateUI() {
        System.out.println("Update UI");
        System.out.println(PersonDB.persons);
    }
}
