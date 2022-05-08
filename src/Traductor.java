import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Traductor {
    public static void main(String[] args) {

        Move movimiento = new Move("P4K",null,true);
        MaquinaTraductora trad = new MaquinaTraductora();
        trad.descripToAlgebTransMove(movimiento);
        System.out.println(movimiento.nAlgebr);
    }
}
