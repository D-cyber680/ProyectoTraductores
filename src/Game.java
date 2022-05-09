import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    ArrayList<Move> moves;
    public ArrayList<Move> StringGametolistMoves(String game){
        String[] gamename = game.split("\\s+");
        boolean iswhite = true;
        ArrayList<Move> moves = null;
        for (int i = 0; i < gamename.length; i++)
        {
            if(i % 3 != 0){
                moves.add(new Move(gamename[i],null,iswhite));
                iswhite = !iswhite;
            }
        }
        return moves;
    }

    // This methods takes a list of moves and returns a String with moves
    public String listToGameAlg(ArrayList<String> moves ){
        String game = "";
        //code

        return game;
    }

    // This method takes String with moves and returns a game file in .pgn or .txt
    public void stringToFile(String moves){
        //code

    }
}
