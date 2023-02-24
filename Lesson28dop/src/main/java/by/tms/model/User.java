package by.tms.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {
    private String email;
    private String password;

    public User() {
        email = "test@gmail.com";
        password = "12345";
    }
}
