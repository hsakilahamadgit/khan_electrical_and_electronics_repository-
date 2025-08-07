package khan_electrical_and_electronics.electrical_electronics_service_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name = "email",nullable = false, unique = true)
    private String email;

    @Column(name="phone",nullable = false)
    private String phone;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name = "role_id", nullable = false)
    private  Integer roleId;

   /* @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


*/

    public User() {
    }
    public User(String name, String email, String phone, String password, Integer roleId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.roleId = roleId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
