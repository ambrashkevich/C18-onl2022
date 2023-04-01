package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private Integer id;
    private String login;
    private String password;
    private ROLE role;

    public User() {

    }

    public enum ROLE {
        USER, ADMIN, UNKNOWN
    }
}
