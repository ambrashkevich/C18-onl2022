package loginform.model;

import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @Size(min = 6, max = 12, message
            = "About Me must be between 10 and 200 characters")
    private String name;
    private String surname;
    private String password;
    private String email;
    private LocalDate birthDay;
}
