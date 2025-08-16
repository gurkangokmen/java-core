package checked_exceptions;

//
// YOU HAVE TO INDICATE CHECKED EXCEPTIONS USING "throws" KEYWORD
//


/**
 * A developer throw checked or unchecked exceptions.
 *
 * <p> If exception is checked,
 * <p> 1: method have to has throws declaration.
 * <p> 2: we must handle with try-catch.
 *
 * <p><p>  InterruptedException is an checked exception.
 */
public class Main {

	public static void main(String[] args)  {


        try {
            runMyMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
	
	static void runMyMethod() throws InterruptedException {
		throw new InterruptedException();
    }


	

}
