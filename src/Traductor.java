import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Traductor {
    public static void main(String[] args) {

        String game_desc = "1. P4K P4K 2. N3BK B3BQ 3. B4BQ B4BQ 4. P4NQ Bx4NQ 5. P3BQ B4BQ 6. P4Q Px4Q 7. O-O P6Q ";
        Game new_game = new Game(game_desc);
        System.out.println(new_game.moves.toString());
        System.out.println(new_game.listToGameAlg());

//        Move movimiento = new Move("P6Q",null,false);
//        MaquinaTraductora.descripToAlgebTransMove(movimiento);
//        System.out.println(movimiento.nAlgebr);
    }
}
