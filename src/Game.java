import java.util.ArrayList;

public class Game {
    ArrayList<Move> moves;

    public Game(String game) {
        StringGametolistMoves(game);
    }

    public void StringGametolistMoves(String game){
        String[] gamename = game.split("\\s+");
        boolean iswhite = true;
        for (int i = 0; i < gamename.length; i++)
        {
            if(i % 3 != 0){
                this.moves.add(new Move(gamename[i],null,iswhite));
                iswhite = !iswhite;
            }
        }
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
