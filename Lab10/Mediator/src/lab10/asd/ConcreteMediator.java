package lab10.asd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcreteMediator implements Mediator {
    List<Player> players;

    public ConcreteMediator() {
        players = new ArrayList<Player>();
    }

    @Override
    public void updateUI(int x,int y,int color) {
        Chess.chess[x][y] = color;
        scanDirectionEast(x,y,color);
        scanDirectionWest(x,y,color);
        scanDirectionSouth(x,y,color);
        scanDirectionNorth(x,y,color);

        scanDirectionNorthEast(x,y,color);
        scanDirectionNorthWest(x,y,color);
        scanDirectionSouthWest(x,y,color);
        scanDirectionSouthEast(x,y,color);
        System.out.println("Client played");
        for (int[] arr : Chess.chess) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public void scanDirectionEast(int x,int y,int color){
        int yCursor = y;
        while(yCursor < Chess.colLength){
            yCursor++;
            if(yCursor == Chess.colLength || yCursor <0) return;
            if(Chess.chess[x][yCursor] == 0) return;
            if(Chess.chess[x][yCursor] == color){
                for(int i=y;i<=yCursor;i++){
                    Chess.chess[x][i] = color;
                }
            }
        }
    }
    public void scanDirectionWest(int x,int y,int color){
        int yCursor = y;
        while(yCursor >= 0){
            yCursor--;
            if(yCursor == Chess.colLength || yCursor <0) return;
            if(Chess.chess[x][yCursor] == 0) return;
            if(Chess.chess[x][yCursor] == color){
                for(int i=yCursor;i<=y;i++){
                    Chess.chess[x][i] = color;
                }
            }
        }
    }
    public void scanDirectionSouth(int x,int y,int color){
        int xCursor = x;
        while(xCursor < Chess.rowLength){
            xCursor++;
            if(xCursor == Chess.rowLength || xCursor <0) return;
            if(Chess.chess[xCursor][y] == 0) return;
            if(Chess.chess[xCursor][y] == color){
                for(int i=x;i<=xCursor;i++){
                    Chess.chess[i][y] = color;
                }
            }
        }
    }
    public void scanDirectionNorth(int x,int y,int color){
        int xCursor = x;
        while(xCursor >= 0){
            xCursor--;
            if(xCursor == Chess.rowLength || xCursor <0) return;
            if(Chess.chess[xCursor][y] == 0) return;
            if(Chess.chess[xCursor][y] == color){
                for(int i=xCursor;i<=x;i++){
                    Chess.chess[i][y] = color;
                }
            }
        }

    }
    public void scanDirectionNorthEast(int x,int y,int color){
        int xCursor = x;
        int yCursor = y;
        while(xCursor >=0 && yCursor < Chess.colLength){
            xCursor--; yCursor++;
            if(xCursor == Chess.rowLength || xCursor <0 || yCursor == Chess.colLength || yCursor < 0) return;
            if(Chess.chess[xCursor][yCursor] == 0) return;
            if(Chess.chess[xCursor][yCursor] == color){
                for(int i=y,j=xCursor;i<=yCursor && x<=x;i++,j++){
                    Chess.chess[j][i] = color;
                }
            }
        }
    }
    public void scanDirectionNorthWest(int x,int y,int color){
        int xCursor = x;
        int yCursor = y;
        while(xCursor >=0 && yCursor < Chess.colLength){
            xCursor--; yCursor--;
            if(xCursor == Chess.rowLength || xCursor <0 || yCursor == Chess.colLength || yCursor < 0) return;
            if(Chess.chess[xCursor][yCursor] == 0) return;
            if(Chess.chess[xCursor][yCursor] == color){
                for(int i=yCursor,j=xCursor;i<=y && x<=x;i++,j++){
                    Chess.chess[j][i] = color;
                }
            }
        }
    }
    public void scanDirectionSouthWest(int x,int y,int color){
        int xCursor = x;
        int yCursor = y;
        while(xCursor >=0 && yCursor < Chess.colLength){
            xCursor++; yCursor--;
            if(xCursor == Chess.rowLength || xCursor <0 || yCursor == Chess.colLength || yCursor < 0) return;
            if(Chess.chess[xCursor][yCursor] == 0) return;
            if(Chess.chess[xCursor][yCursor] == color){
                for(int i=yCursor,j=x;i<=y && x<=xCursor;i++,j++){
                    Chess.chess[j][i] = color;
                }
            }
        }
    }
    public void scanDirectionSouthEast(int x,int y,int color){
        int xCursor = x;
        int yCursor = y;
        while(xCursor >=0 && yCursor < Chess.colLength){
            xCursor++; yCursor++;
            if(xCursor == Chess.rowLength || xCursor <0 || yCursor == Chess.colLength || yCursor < 0) return;
            if(Chess.chess[xCursor][yCursor] == 0) return;
            if(Chess.chess[xCursor][yCursor] == color){
                for(int i=y,j=x;i<=yCursor && x<=xCursor;i++,j++){
                    Chess.chess[j][i] = color;
                }
            }
        }
    }
    @Override
    public void sendMessage() {

    }
}
