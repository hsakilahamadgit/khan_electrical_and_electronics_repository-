package khan_electrical_and_electronics.electrical_electronics_service_app.controller;

import jakarta.validation.Valid;
import khan_electrical_and_electronics.electrical_electronics_service_app.dto.UserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;
import khan_electrical_and_electronics.electrical_electronics_service_app.exception.EmailAlreadyExistsException;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("/users/register")
    public ResponseEntity<?> UserRegistrationRequest(@RequestBody @Valid UserDto userRegisterRequest) throws Exception {
        try {


            UserDto returnUserRequest = usersService.saveUser(userRegisterRequest);
            return new ResponseEntity<>(returnUserRequest, org.springframework.http.HttpStatus.CREATED);
        } catch (EmailAlreadyExistsException ex) {

            Map<String, Object> error = new HashMap<>();
            error.put("timestamp", LocalDateTime.now());
            error.put("status", HttpStatus.BAD_REQUEST.value());
            error.put("message: ", ex.getMessage());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);


        }
    }
}
