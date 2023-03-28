package loginform.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

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
