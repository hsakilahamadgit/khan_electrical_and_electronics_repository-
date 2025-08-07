package khan_electrical_and_electronics.electrical_electronics_service_app.mapper;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.UserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;

public class UserMapper {

    // map to Entity
    public static User mapToEntity( UserDto userDto) {
        User user= new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setPassword(userDto.getPassword());
        user.setRoleId(userDto.getRoleId());
        return user;
    }
public static UserDto mapToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setPassword(user.getPassword());
        userDto.setRoleId(user.getRoleId());
        return userDto;
}


}
