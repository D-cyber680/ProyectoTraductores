import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.IOException;

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
        int i = 0,jugada = 1;
        //code
        for(Move m : this.moves)
        {
            MaquinaTraductora.descripToAlgebTransMove(m);
            if(i % 2 == 0){
                this.stb_alg.append(jugada).append(". ").append(m.nAlgebr).append(" ");
                jugada++;
            }else {
                this.stb_alg.append(m.nAlgebr).append(" ");

            }
            i++;
        }
        return stb_alg.toString();
    }

    // This method takes String with moves and returns a game file in .pgn or .txt
    public void stringToFile(String filename,String white, String black, String result,String date){
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile())
            {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write("[White '"+ white + "']\n");
            myWriter.write("[Black '"+ black + "']\n");
            myWriter.write("[Result '"+ result + "']\n");
            myWriter.write("[Date '"+ date + "']\n");
            myWriter.write(stb_alg.toString());
            myWriter.close();
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
