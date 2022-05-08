import java.util.ArrayList;
import java.lang.StringBuilder;
public class MaquinaTraductora {

    public MaquinaTraductora() {

    }

    // This method accepts a move in string format with descriptive notation and returns it
    // into algebraic notation
    public String descripToAlgebTransMove(Move move) {
        String piece, col = null, row;
        switch (move.tjugada) {
            case 0:
                if (Character.toString(move.nDescrip.charAt(0)).equals("P")) {
                    piece = "";
                } else {
                    piece = Character.toString(move.nDescrip.charAt(0)).toLowerCase();
                }
                row = Character.toString(move.nDescrip.charAt(1));
                switch (move.nDescrip.substring(2, 4)) {
                    case "RQ":
                        col = "a";
                        break;
                    case "NQ":
                        col = "b";
                        break;
                    case "BQ":
                        col = "c";
                        break;
                    case "BK":
                        col = "f";
                        break;
                    case "NK":
                        col = "g";
                        break;
                    case "RK":
                        col = "h";
                        break;
                    default:
                        switch (move.nDescrip.substring(2, 3)) {
                            case "K":
                                col = "e";
                                break;
                            case "Q":
                                col = "d";
                                break;
                            default:
                                col = "";
                        }
                        move.nAlgebr = piece + col + row;
                }
                break;
            case 1:
                if (Character.toString(move.nDescrip.charAt(0)).equals("P")) {
                    piece = "";
                } else {
                    piece = Character.toString(move.nDescrip.charAt(0)).toLowerCase();
                }
                row = Character.toString(move.nDescrip.charAt(2));
                switch (move.nDescrip.substring(3, 5)) {
                    case "RQ":
                        col = "a";
                        break;
                    case "NQ":
                        col = "b";
                        break;
                    case "BQ":
                        col = "c";
                        break;
                    case "BK":
                        col = "f";
                        break;
                    case "NK":
                        col = "g";
                        break;
                    case "RK":
                        col = "h";
                        break;
                    default:
                        switch (move.nDescrip.substring(3, 4)) {
                            case "K":
                                col = "e";
                                break;
                            case "Q":
                                col = "d";
                                break;
                            default:
                                col = "";
                        }
                }
                move.nAlgebr = piece + "x" + col + row;
                break;
            case 2:
            case 4:
                move.nAlgebr = move.nDescrip;
                break;
            case 3:
                piece = "";
                switch (move.nDescrip.length()) {
                    case 6:
                        if (Character.toString(move.nDescrip.charAt(2)).equals("K")) {
                            col = "e";
                        } else {
                            col = "d";
                        }
                        break;
                    case 7:
                        switch (move.nDescrip.substring(2, 4))
                        {
                            case "RK":
                                col = "h";
                                break;
                            case "NK":
                                col = "g";
                                break;
                            case "BK":
                                col = "f";
                                break;
                            case "RQ":
                                col = "a";
                                break;
                            case "NQ":
                                col = "b";
                                break;
                            case "BQ":
                                col = "c";
                                break;
                        }
                }
                if (move.isWhite){
                    row = "8";
                }else{
                    row = "1";
                }
                move.nAlgebr = col + row + "=" + move.nDescrip.charAt(move.nDescrip.length() - 1);
                break;
        }

        return move.nAlgebr;
    }

    // This method takes List of moves in descriptive notation and returns a list
    // of moves in algebraic notation
    public String descripToAlgebTransGame(ArrayList<String> game) {
        String movAlg = "";

        return movAlg;
    }
}


//   public String algebToDescripTrans(String mov){
//        String movDescrip = "";
//
//        return movDescrip;
//    }

