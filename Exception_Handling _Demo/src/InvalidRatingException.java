/**
 * Created by malviyas on 7/26/2017.
 */
public class InvalidRatingException extends Exception {
    public InvalidRatingException (){
    }

    public InvalidRatingException (String message){
        super(message);
    }
}
