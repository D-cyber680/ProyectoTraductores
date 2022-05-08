import java.util.regex.Pattern;

public class Traductor {
    public static void main(String[] args) {
        String str = "P-Q8/R";
        System.out.println(str.matches("^P-([KQ]|(R[KQ]|N[KQ]|B[KQ]))8\\/([QRBN])$"));

    }
}
