public class MaquinaTraductora {

    public MaquinaTraductora() {

    }

    // This method accepts a move in string format with descriptive notation and returns it
    // into algebraic notation
    public void descripToAlgebTransMove(Move move) {
        String piece, col = null, row;
        switch (move.tjugada) {
            case 0 -> {
                if (Character.toString(move.nDescrip.charAt(0)).equals("P")) {
                    piece = "";
                } else {
                    piece = Character.toString(move.nDescrip.charAt(0));
                }
                row = Character.toString(move.nDescrip.charAt(1));
                switch (move.nDescrip.substring(2, 3)) {
                    case "K" -> col = "e";
                    case "Q" -> col = "d";

                    default -> {
                        col = switch (move.nDescrip.substring(2, 4)) {
                            case "RQ" -> "a";
                            case "NQ" -> "b";
                            case "BQ" -> "c";
                            case "BK" -> "f";
                            case "NK" -> "g";
                            case "RK" -> "h";
                            default -> "";
                        };
                    }
                }
                move.nAlgebr = piece + col + row;
            }
            case 1 -> {
                if (Character.toString(move.nDescrip.charAt(0)).equals("P")) {
                    piece = "";
                } else {
                    piece = Character.toString(move.nDescrip.charAt(0));
                }
                row = Character.toString(move.nDescrip.charAt(2));
                col = switch (move.nDescrip.substring(3, 4)) {
                    case "K" -> "e";
                    case "Q" -> "d";
                    default -> switch (move.nDescrip.substring(3, 5)) {
                        case "RQ" -> "a";
                        case "NQ" -> "b";
                        case "BQ" -> "c";
                        case "BK" -> "f";
                        case "NK" -> "g";
                        case "RK" -> "h";
                        default -> "";
                    };
                };
                move.nAlgebr = piece + "x" + col + row;
            }
            case 2, 4 -> move.nAlgebr = move.nDescrip;
            case 3 -> {
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
                        col = switch (move.nDescrip.substring(2, 4)) {
                            case "RK" -> "h";
                            case "NK" -> "g";
                            case "BK" -> "f";
                            case "RQ" -> "a";
                            case "NQ" -> "b";
                            case "BQ" -> "c";
                            default -> null;
                        };
                }
                if (move.isWhite) {
                    row = "8";
                } else {
                    row = "1";
                }
                move.nAlgebr = col + row + "=" + move.nDescrip.charAt(move.nDescrip.length() - 1);
            }
        }

    }

    // This method takes List of moves in descriptive notation and returns a list
    // of moves in algebraic notation
    public String descripToAlgebTransGame(String[] game) {
        String movAlg = "";

        return movAlg;
    }

    public String[] textToarrayMoves(String gameName) {
        return gameName.split("\\s+");
    }
}
//   public String algebToDescripTrans(String mov){
//        String movDescrip = "";
//
//        return movDescrip;
//    }

