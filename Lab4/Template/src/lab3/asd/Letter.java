package lab3.asd;

import java.util.Arrays;

public class Letter extends TemplateLetter {
    private String[][] values;
    private int width = 0;
    private int height = 0;
    @Override
    public String getType(String[][] array) {
        if(array != null) return array[0][0];
        return null;
    }

    @Override
    public Letter reconstructLetter(String type,String[][] array) {
      Letter letter = new Letter();
      int column = Integer.parseInt(array[1][0]) ;
      int row = Integer.parseInt(array[2][0]);
      int fullColumn = Integer.parseInt(array[3][0]);
      int fullRow = Integer.parseInt(array[4][0]);
      letter.width = fullColumn;
      letter.height = fullRow;
        letter.values = new String[fullRow][fullColumn];
        switch (type){
            case "VERTICAL":
                for (int i = 0;i<fullRow;i++){
                    for (int j=0;j<fullColumn;j++ ){
                        int arrayCol = j;
                        int arrayRow = i + 5;
                        if(i >= row) {
                            break;
                        }
                        if(arrayCol >= column){
                            letter.values[i][j] = array[arrayRow][column - (j - (column - 1))];
                        }else{
                            letter.values[i][j] = array[arrayRow][arrayCol];
                        }
                    }
                }
                break;
            case "HORIZONTAL":
                for(int i =0 ;i<fullRow;i++)
                    for(int j=0;j<fullColumn;j++){
                        int arrayRow = i +5;
                        int arrayCol = j;
                        if(i+5 >= (row * 2) + 5 - 1) break;
                        if(j >= column -1) break;
                        if(arrayRow >= row + 5){
                            letter.values[i][j] = array[row+5 - ((i+5) - (row+5-1))][arrayCol];
                        }else{
                            letter.values[i][j] = array[arrayRow][arrayCol];
                        }
                    }
                break;
            default:
                for (int i = 0;i<fullRow;i++){
                    for (int j=0;j<fullColumn;j++ ){
                        int arrayCol = j;
                        int arrayRow = i + 5;
                        if(i>= row || arrayCol >= column) {
                            break;
                        }
                        letter.values[i][j] = array[arrayRow][arrayCol];
                    }
                }
                break;
        }
        return letter;
    }

    @Override
    public void print(Letter letter) {
        if(letter != null){
            for(int i=0;i<letter.height;i++){
                System.out.println("");
                for (int j=0;j<letter.width;j++){
                    System.out.print(letter.values[i][j]);
                }
            }
            System.out.println(Arrays.toString(values));
        }

    }
}
