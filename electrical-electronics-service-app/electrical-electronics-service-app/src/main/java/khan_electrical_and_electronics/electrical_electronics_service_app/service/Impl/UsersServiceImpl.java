package khan_electrical_and_electronics.electrical_electronics_service_app.service.Impl;

import khan_electrical_and_electronics.electrical_electronics_service_app.dto.UserDto;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.Role;
import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;
import khan_electrical_and_electronics.electrical_electronics_service_app.exception.EmailAlreadyExistsException;
import khan_electrical_and_electronics.electrical_electronics_service_app.mapper.UserMapper;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.RoleRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.repository.UserRepository;
import khan_electrical_and_electronics.electrical_electronics_service_app.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDto saveUser(UserDto usersRegisterRequest) throws Exception {
     // method 1 to to covert UserDto to User entity
        /*User user = new User();
        user.setEmail(usersRegisterRequest.getEmail());
        user.setName(usersRegisterRequest.getName());*/
        // method 2 to convert UserDto to User entity
   /*    User savedUser= userRepository.save(new User(
                usersRegisterRequest.getName(),
                usersRegisterRequest.getEmail(),
                usersRegisterRequest.getPhone(),
                usersRegisterRequest.getPassword(),
               usersRegisterRequest.getRoleId()
        ));*/
     // method 3 to convert UserDto to User entity using mapper
     User user= UserMapper.mapToEntity(usersRegisterRequest);
     String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

          if(userRepository.existsByEmail(user.getEmail())){
            throw new EmailAlreadyExistsException("Email already exists"+ user.getEmail());
          }
        Role defaultRole = roleRepository.findById(1L).orElseThrow(()-> new RuntimeException("Default role not found"));
        System.out.println("Role Id----------"+defaultRole.getId()+" Role Name-------"+  defaultRole.getName());
        System.out.println("role obj---------"+defaultRole);
        user.setRole(defaultRole); // Set default role to Customer (roleId = 1)


        User savedUser=userRepository.save(user);

        // return UserDto
        UserDto userDto= UserMapper.mapToDto(savedUser);


       return userDto;

    }
}
