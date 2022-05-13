import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Traductor {
    public static void main(String[] args) {

        Move movimiento = new Move("B4RQ",null,false);
        MaquinaTraductora.descripToAlgebTransMove(movimiento);
        System.out.println(movimiento.nAlgebr);
    }
}
