package khan_electrical_and_electronics.electrical_electronics_service_app.service;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.UserDto;

public interface UsersService {
    UserDto saveUser(UserDto usersRegisterRequest) throws Exception;
}
