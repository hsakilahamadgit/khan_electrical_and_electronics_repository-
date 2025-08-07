package khan_electrical_and_electronics.electrical_electronics_service_app;

import java.time.LocalDateTime;

public class ExceptionDetail {

    LocalDateTime timestamp;

    int HttpStatus;

    String error;

    String message;
public ExceptionDetail() {
        // Default constructor
    }

 /* */  public ExceptionDetail(LocalDateTime timestamp, int httpStatus, String error, String message) {
        this.timestamp = timestamp;
        HttpStatus = httpStatus;
        this.error = error;
        this.message = message;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public int getHttpStatus() {
        return HttpStatus;
    }
    public void setHttpStatus(int httpStatus) {
        HttpStatus = httpStatus;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
