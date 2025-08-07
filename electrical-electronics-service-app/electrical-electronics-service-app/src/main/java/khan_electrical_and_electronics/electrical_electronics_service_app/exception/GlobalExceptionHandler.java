package khan_electrical_and_electronics.electrical_electronics_service_app.exception;

import khan_electrical_and_electronics.electrical_electronics_service_app.ExceptionDetail;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationErrors(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

       /* BindingResult bindingResult = ex.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
        String field  =fieldError.getField();
        String message = fieldError.getDefaultMessage();
            errors.put(field, message);*/
           // errors.put(fieldError.getField(), fieldError.getDefaultMessage());
       // }

        return errors;
    }
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, ExceptionDetail> handleUserNotFound(UserNotFoundException ex) {
       /* ExceptionDetail exceptionDetail = new ExceptionDetail(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                "User Not Found",
                ex.getMessage()
        );*/
        ExceptionDetail exceptionDetail=new ExceptionDetail();

        exceptionDetail.setTimestamp(LocalDateTime.now());
        exceptionDetail.setHttpStatus(HttpStatus.NOT_FOUND.value());
        exceptionDetail.setError("User Not Found");
        exceptionDetail.setMessage(ex.getMessage());
        // Create a map to hold the error details
        Map<String, ExceptionDetail> error = new HashMap<>();
        error.put("Error detail", exceptionDetail);

        return error;
    }
}
