package khan_electrical_and_electronics.electrical_electronics_service_app.service.Impl;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.LoginUserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;
import khan_electrical_and_electronics.electrical_electronics_service_app.exception.UserNotFoundException;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.UserRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginUserImpl implements LoginUserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Override
    public String loginUser(LoginUserDto loginUserDto) {
        User user = userRepository.findByEmail(loginUserDto.getEmail()).orElseThrow(() ->
                new UserNotFoundException("User not found with email: " + loginUserDto.getEmail()));
        System.out.println("User found:---------- " + user.getEmail() + "user password----------" + user.getPassword());

       /* if (optionalUser == null || !passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return ResponseEntity.badRequest().body("Invalid email or password");
        }*/
        if (loginUserDto.getPassword() == null || loginUserDto.getPassword().isBlank()) {
            return "Password cannot be null or empty";
        }
        if (passwordEncoder.matches(loginUserDto.getPassword(), user.getPassword())) {
            System.out.println("checking password " + loginUserDto.getPassword() + " and " + user.getPassword());
            return "Login successful for user: " + user.getEmail();
        } else {
            return "Invalid email or password";
        }


    }
}
