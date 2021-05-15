package simplecrudapi.exception;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String message){
        super(message);
    }

    public MovieNotFoundException(Long id){
        this("Movie with ID " + id + " does not exist");
    }

}
