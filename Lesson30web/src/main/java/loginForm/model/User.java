package loginForm.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class User {
    private String password;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDay;
}
