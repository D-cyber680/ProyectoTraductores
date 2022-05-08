import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Move {
    String nDescrip;
    String nAlgebr;
    int tjugada; // 0: Non capture, 1: Capture, 2: Castling, 3: Promotion, 4: Invalid
    Boolean isWhite; //False: Black, True: White

    //"^[P|K|Q|R|B][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$" -> 0
    //"^[P|K|Q|R|B][x][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$" -> 1
    // "^O-O$|^O-O-O$" -> 2
    // "^P-(R|K(?!K|Q)|B|N|Q(?!K|Q))8/(Q|B|R|N)$" -> 3


    public Move(String nDescrip,String nAlgebr ,Boolean isWhite)
    {

        this.nDescrip = nDescrip;
        this.nAlgebr = nAlgebr;
        this.isWhite = isWhite;
    //if(nAlgebr == null && nDescrip != null) {
        if (Pattern.compile(nDescrip).matcher("^[P|K|Q|R|B|N][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$").matches()) {
            this.tjugada = 0;
        } else if (Pattern.compile(nDescrip).matcher("^[P|K|Q|R|B|N][x][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$").matches()) {
            this.tjugada = 1;
        } else if (Pattern.compile(nDescrip).matcher("^O-O$|^O-O-O$").matches()) {
            this.tjugada = 2;
        } else if (Pattern.compile(nDescrip).matcher("^P-([KQ]|(R[KQ]|N[KQ]|B[KQ]))8\\/([QRBN])$").matches()) {
            this.tjugada = 3;
        } else {
            this.tjugada = 4;
        }
    //}

    }
    // Hacer uso de Maquina traductora para convertirlo a nAlgebraica
    // Si un movimiento tirar una Excepcion y decir donde esta el error
}
