package simplecrudapi.model;

import java.io.Serializable;

public class Error implements Serializable {

    private String error;

    public Error(String error){
        this.setError(error);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Error{" +
                "error='" + error + '\'' +
                '}';
    }
}
