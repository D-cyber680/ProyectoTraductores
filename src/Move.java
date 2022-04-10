public class Move {
    String nDescrip;
    String nAlgebr;
    int jugada;
    Boolean isWhite;

    public Move(String nDescrip, int jugada, Boolean isWhite) {
        this.nDescrip = nDescrip;
        this.nAlgebr = null;
        this.jugada = jugada;
        this.isWhite = isWhite;
    }

}
