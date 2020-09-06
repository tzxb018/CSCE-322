import java.io.IOException;
import org.antlr.v4.runtime.*;

public class csce322hmwrk01prt02driver {
    public static void main(String args[])
    {
	CharStream input = null;
	if( args.length == 1 )
	    {
		try {
		    input = new ANTLRFileStream(args[0]);
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	else
	    {
		System.err.println( "File Not Provided" );
		System.exit(0);
	    }
	
	csce322hmwrk01prt02Lexer lexer = new csce322hmwrk01prt02Lexer( input );
	CommonTokenStream tokens = new CommonTokenStream( lexer );
	csce322hmwrk01prt02Parser parser = new csce322hmwrk01prt02Parser( tokens );
	lexer.removeErrorListeners();
	parser.removeErrorListeners();
	lexer.addErrorListener( new csce322hmwrk01prt02error() );
	parser.addErrorListener( new csce322hmwrk01prt02error() );
	parser.boss();
    }
}
