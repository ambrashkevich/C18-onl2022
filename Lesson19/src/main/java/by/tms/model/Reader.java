package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;


@AllArgsConstructor
@ToString
public class Reader {
    private String name;
    private String surname;
    private EmailAddress email;
    private Boolean isAgreed;
    private List<Book> bookList;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public EmailAddress getEmail() {
        return email;
    }

    public Boolean getAgreed() {
        return isAgreed;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
