package eshop.models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private String password;
}
