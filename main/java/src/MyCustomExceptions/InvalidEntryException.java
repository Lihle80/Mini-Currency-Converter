package MyCustomExceptions;
//Used when user input is neither Y/N.
public class InvalidEntryException extends Exception {
    public InvalidEntryException(){
        System.out.println("Your entry is invalid!, please try again");
    }
}
