package by.tms.model;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {

    private String author;
    private String name;
    private int year;

    public static class BookComparator implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getYear() - o2.getYear();
        }
    }
}
