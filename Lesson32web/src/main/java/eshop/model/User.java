package eshop.model;

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

    private int id;
    private String password;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDay;
    private int balance;
}
