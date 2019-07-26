package lab3.asd;

public abstract class TemplateLetter {
    public void drawLetter(String[][] array){
        String type = getType(array);
        Letter letter = reconstructLetter(type,array);
        print(letter);
    }
    public abstract String getType(String[][] array);
    public abstract Letter reconstructLetter(String type,String[][] array);
    public abstract void print(Letter letter);
}
