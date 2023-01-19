package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private int year;

    @Override
    public int compareTo(Book o1) {
        return this.getYear() > o1.getYear() ? 1 : 0;
    }

    public static class BookComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getYear() - o2.getYear();
        }
    }
}
