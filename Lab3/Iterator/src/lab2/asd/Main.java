package lab2.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] names =  {{"a","b"},{"-","d"},{"e","f"},{"k","-"}};
        NameRepository nameRepository = new NameRepository(names);
        Iterator iterator = nameRepository.getIterator();
        while(iterator.hasNext() == true){
            System.out.println(iterator.next());
        }

    }
}
