package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Library {
    private List<Book> bookList;
    private List<Reader> readerList;
}
