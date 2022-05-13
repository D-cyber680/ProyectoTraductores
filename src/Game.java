import java.util.ArrayList;

public class Game {
    ArrayList<Move> moves = new ArrayList<>();
    StringBuilder stb_alg = new StringBuilder();

    public Game(String game) {
        StringGametolistMoves(game);
    }

    public void StringGametolistMoves(String game)
    {
        String[] gamename = game.split("\\s+");
        boolean iswhite = true;
        for (int i = 0; i < gamename.length; i++)
        {
            if(i % 3 != 0)
            {
                this.moves.add(new Move(gamename[i],null,iswhite));
                iswhite = !iswhite;
            }
        }
    }

    // This methods takes a list of moves and returns a String with moves
    public String listToGameAlg(){
        //code
        for(Move m : this.moves){
            this.stb_alg.append(m.nAlgebr).append(" ");
        }
        return stb_alg.toString();
    }

    // This method takes String with moves and returns a game file in .pgn or .txt
    public void stringToFile(){
        //code

    }
}
