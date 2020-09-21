import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322hmwrk01prt02error extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int position, String msg,
            RecognitionException e) {
        // replace with code to process syntax errors
        System.out.println(msg);
        System.out.println("Line " + line + " Contains Problem(s)");
        System.exit(1);
        return;
    }
}
