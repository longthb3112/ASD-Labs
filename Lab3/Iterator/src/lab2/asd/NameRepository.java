package lab2.asd;

public class NameRepository implements Aggregate {
    private String[][] names;

    public NameRepository(String[][] names){
        this.names = names;
    }
    @Override
    public Iterator getIterator() {
      return new NameIterator();


    }
    private class NameIterator implements Iterator{
        int currentRow = 0;
        int currentColumn = -1;
        @Override
        public boolean hasNext() {
            Point nextValue = getNextValue();
            return nextValue != null;
        }

        @Override
        public Object next() {
            Point nextValue = getNextValue();
            if(nextValue != null){
                currentRow = nextValue.rowIndex;
                currentColumn = nextValue.colIndex;
                return names[nextValue.rowIndex][nextValue.colIndex];

            }
            return null;
        }
        private Point getNextValue(){
            int tempCol = currentColumn + 1;
            int tempRow = currentRow;
            if(tempCol == names[0].length){
                tempCol = 0;
                tempRow++;
            }
            while(tempCol < names[0].length && tempRow < names.length){
                String nextValue = names[tempRow][tempCol];
                if( nextValue!= null && nextValue != "-"){
                    return new Point(tempCol,tempRow);
                } else{
                    tempCol++;
                    if(tempCol == names[0].length){
                        tempCol = 0;
                        tempRow++;
                    }
                    if(tempRow == names.length){
                        return null;
                    }
                }
            }
            return null;
        }
        private class Point{
            public int colIndex,rowIndex;
            public Point(int colIndex,int rowIndex){
                this.colIndex = colIndex;
                this.rowIndex = rowIndex;
            }
        }

    }
}
