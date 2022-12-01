package Military;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Address {
    private String country;
    private String city;

    @Override
    public String toString() {
        return "country='" + country + '\'' +
                ", city='" + city + '\'';
    }
}

