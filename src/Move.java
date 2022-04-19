import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Move {
    String nDescrip;
    String nAlgebr;
    int tjugada; // 0: Non capture, 1: Capture, 2: Castling, 3: Promotion, 4: Invalid
    Boolean isWhite; //False: Black, True: White
    Pattern patt1 = Pattern.compile("^[P|K|Q|R|B][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$");
    Pattern patt2 = Pattern.compile("^[P|K|Q|R|B][x][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$");
    Pattern patt3 = Pattern.compile("^O-O$|^O-O-O$");
    Pattern patt4 = Pattern.compile("^P-(R|K(?!K|Q)|B|N|Q(?!K|Q))8/(Q|B|R|N)$");
    //"^[P|K|Q|R|B][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$" -> 0
    //"^[P|K|Q|R|B][x][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$" -> 1
    // "^O-O$|^O-O-O$" -> 2
    // "^P-(R|K(?!K|Q)|B|N|Q(?!K|Q))8/(Q|B|R|N)$" -> 3


    public Move(String nDescrip, Boolean isWhite, String patt)
    {
        this.nDescrip = nDescrip;
        this.nAlgebr = null;
        this.isWhite = isWhite;

        if(Pattern.compile(nDescrip).matcher("^[P|K|Q|R|B][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$").matches()){
             this.tjugada = 0;
        }else if(Pattern.compile(nDescrip).matcher("^[P|K|Q|R|B][x][1-8][RQ|NQ|BQ|Q|K|BK|NK|RK]$").matches() ){
             this.tjugada = 0;
        }else if(Pattern.compile(nDescrip).matcher("^O-O$|^O-O-O$" ).matches()){
             this.tjugada = 1;
        }else if(Pattern.compile(nDescrip).matcher("^P-(R|K(?!K|Q)|B|N|Q(?!K|Q))8/(Q|B|R|N)$").matches()){
             this.tjugada = 2;
        }else{
            this.tjugada = 3;
        }
    }
    // Hacer uso de Maquina traductora para convertirlo a nAlgebraica

}
