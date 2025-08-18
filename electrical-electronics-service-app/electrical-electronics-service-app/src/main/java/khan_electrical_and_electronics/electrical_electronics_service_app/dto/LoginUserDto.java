package khan_electrical_and_electronics.electrical_electronics_service_app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginUserDto {
    @NotBlank(message = "Email is required")
    private String email;


    @NotBlank(message = "Password must be at least 6 characters long")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    public LoginUserDto() {
    }

    public LoginUserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
