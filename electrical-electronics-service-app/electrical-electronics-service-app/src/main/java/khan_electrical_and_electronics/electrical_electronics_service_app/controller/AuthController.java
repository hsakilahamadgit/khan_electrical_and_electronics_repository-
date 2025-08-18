package khan_electrical_and_electronics.electrical_electronics_service_app.controller;


import jakarta.validation.Valid;
import khan_electrical_and_electronics.electrical_electronics_service_app.dto.LoginUserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.UserRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthController {


    @Autowired
  private LoginUserService loginUserService;


    @PostMapping("/api/auth/login")
    public ResponseEntity<String> loginUser(@RequestBody @Valid LoginUserDto loginUserDto) {
       String loginUserResponse= loginUserService.loginUser(loginUserDto) ;
        // Logic to authenticate user
        // This is a placeholder; actual implementation will depend on your authentication mechanism
        return ResponseEntity.ok(loginUserResponse);
    }
}
