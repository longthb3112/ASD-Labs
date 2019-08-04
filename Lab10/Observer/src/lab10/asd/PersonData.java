package lab10.asd;

import java.util.ArrayList;
import java.util.List;

public class PersonData implements Subject {
    List<Observer> observerList;
    private final Object MUTEX = new Object();

    public PersonData() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        synchronized (MUTEX) {
            if (!observerList.contains(observer)) {
                observerList.add(observer);
            }
        }
    }

    @Override
    public void detach(Observer observer) {
        synchronized (MUTEX) {
            if (observerList.contains(observer)) {
                observerList.remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.updateUI();
        }
    }

    public void addPerson(Person person) {
        synchronized (MUTEX) {
            if (!PersonDB.persons.contains(person)){
                PersonDB.persons.add(person);
                System.out.println("Add Person");
            }

            notifyObservers();
        }
    }

    public void removePerson(Person person) {
        synchronized (MUTEX) {
            if (PersonDB.persons.contains(person)){
                System.out.println("Remove Person");
                PersonDB.persons.remove(person);
            }

            notifyObservers();
        }
    }
}
