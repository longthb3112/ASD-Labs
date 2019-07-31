package lab8.asd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static List<User> users = new ArrayList<User>();
    public static void main(String[] args) {

	// write your code here
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        System.out.println("Load action");
        User user = loadUser("test","123");
        originator.setExternalizedState(user.Clone());
        careTaker.add(originator.saveStateToMemento());
        System.out.println("current user step 0: " + originator.getExternalizedState());

        System.out.println("Save action after edit user");
        user.setUsername("user 1");
        users.add(user);
        originator.setExternalizedState(user.Clone());
        careTaker.add(originator.saveStateToMemento());
        System.out.println("current user step 1: " + originator.getExternalizedState());

        System.out.println("Undo action");
        user = careTaker.get(0).getState();
        originator.setExternalizedState(user.Clone());
        System.out.println("current user step 2: " + originator.getExternalizedState());



    }
    private static User loadUser(String userName, String password){
        Optional<User> user = users.stream().findFirst();
        if(user.isPresent()){
            return user.get();
        }else{
            return new User(userName,password );
        }
    }
}
