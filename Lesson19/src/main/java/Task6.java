import by.tms.model.Book;
import by.tms.model.EmailAddress;
import by.tms.model.Library;
import by.tms.model.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {
        //6) Пишем библиотеку.
        //     * Для каждой книги библиотечного фонда известны автор, название и год издания.
        //     * Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
        //     * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
        //     * Рассылки организуют сотрудники библиотеки: напоминают о сроке возврата книг, сообщают новости.
        //     * Создаем классы:
        //     *  - Book с полями Автор, Название, Год издания
        //     *  - Reader(читатель) с полями ФИО, электронный адрес, флаг согласия на рассылку, список взятых книг
        //     *  - EmailAddress  с полями электронный адрес, дополнительная информация
        //     *  - Library содержит список книг и список читателей.
        //Задачи:
        //     *  a) Получить список всех книг библиотеки, отсортированных по году издания.
        //     *  b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
        //     *      При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        //     *  c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
        //     *      Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        //     *  d) Получить список всех книг, взятых читателями.
        //     *      Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        //     *  e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
        //*  Задачи со ЗВЕЗДОЧКОЙ:
        //     *  а) Узнать наибольшее число книг, которое сейчас на руках у читателя.
        //     *  b) Необходимо рассылать разные тексты двум группам:
        //     *      * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
        //     *      * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
        //     *      То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
        //     *      или TOO_MUCH — если их две и больше. Порядок групп не важен.
        //     *  с) Для каждой группы (OK, TOO_MUCH) получить списки читателей в каждой группе.
        //     *  d) Для каждой группы (OK, TOO_MUCH) получить ФИО читателей в каждой группе, перечисленные через запятую.
        //     *      И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
        //     *      Пример: TOO_MUCH {Иванов Иван Иванович, Васильев Василий Васильевич}
        //     *              OK {Семёнов Семён Семёнович}
        Book book1 = new Book("Стивен Кинг", "Зелёная миля", 2014);
        Book book2 = new Book("Маргарет Митчелл", "Унесённым ветром", 2012);
        Book book3 = new Book("Артур Конан Дойл", "Шерлок Холмс", 2011);
        Book book4 = new Book("Нора Сакавич", "Свита короля", 2010);
        Book book5 = new Book("Кэтрин Скоттен", "Прислуга", 2013);
        Book book6 = new Book("Джон Толкиен", "Возвращение государя", 2015);
        Book book7 = new Book("Мишель Пейер", "Гарри потер", 2016);
        Book book8 = new Book("Александр Дюма", "Граф Монте Кристо", 2017);

        Reader reader1 = new Reader("Вадим", "Амбрашкевич", new EmailAddress("vadimambr@bk.ru", "reader"), false, List.of(book1, book2, book3, book6));
        Reader reader2 = new Reader("Антон", "Коледа", new EmailAddress("krylada@mail.ru", "reader"), false, List.of(book1, book2, book3));
        Reader reader3 = new Reader("Макс", "Миронь", new EmailAddress("miron@rambler.ru", "reader"), true, List.of(book4));
        Reader reader4 = new Reader("Джек", "Баулин", new EmailAddress("daniel@list.ru", "reader"), true, List.of(book5));
        Reader reader5 = new Reader("Даниил", "Григорьевич", new EmailAddress("123123123@mail.ru", "reader"), true, List.of(book1, book7, book8));

        Library library = new Library(List.of(book1, book2, book3, book4, book5, book6, book7, book8), List.of(reader1, reader2, reader3, reader4, reader5));
        //a) Получить список всех книг библиотеки, отсортированных по году издания.
        List<Book> bookList = library.getBookList()
                                     .stream().sorted(new Book.BookComparator())
                                     .toList();
        bookList.forEach(System.out::println);
//     *  b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
        List<EmailAddress> emailAddressList = library.getReaderList()
                                                     .stream()
                                                     .map(Reader::getEmail)
                                                     .toList();
        emailAddressList.forEach(System.out::println);
        System.out.println("--------------------------------");
        //Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
        // Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        List<EmailAddress> emailList = library.getReaderList()
                                              .stream().filter(Reader::getAgreed)
                                              .filter(reader -> reader.getBookList().size() > 1)
                                              .map(Reader::getEmail).toList();
        emailList.forEach(System.out::println);
        //d) Получить список всех книг, взятых читателями.
        // Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        List<Book> bookList1 = library.getReaderList()
                                      .stream().flatMap(reader -> reader.getBookList().stream())
                                      .distinct()
                                      .toList();
        bookList1.forEach(System.out::println);
        //e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
        Boolean hasStevenKingBooks = library.getReaderList()
                                            .stream()
                                            .flatMap(reader -> reader.getBookList().stream())
                                            .anyMatch(book -> book.getAuthor().equals("Стивен Кинг"));
        System.out.println(hasStevenKingBooks);
        //*  Задачи со ЗВЕЗДОЧКОЙ:
        //     *  а) Узнать наибольшее число книг, которое сейчас на руках у читателя.
        int bookCount = library.getReaderList().stream().map(reader -> reader.getBookList().size()).reduce(Integer::max).get();
        System.out.println(bookCount);
        //     *  b) Необходимо рассылать разные тексты двум группам:
        //     *      * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
        //     *      * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
        //     *      То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
        //     *      или TOO_MUCH — если их две и больше. Порядок групп не важен.
        //     *  с) Для каждой группы (OK, TOO_MUCH) получить списки читателей в каждой группе.
        //     *  d) Для каждой группы (OK, TOO_MUCH) получить ФИО читателей в каждой группе, перечисленные через запятую.
        //     *      И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
        //     *      Пример: TOO_MUCH {Иванов Иван Иванович, Васильев Василий Васильевич}
        //     *              OK {Семёнов Семён Семёнович}
        System.out.println("----------------------------");
        getGroup(library).entrySet().forEach(System.out::println);
        Map<Flag, List<EmailAddress>> map = getGroup(library);
        List<Reader> okReaderList = library.getReaderList().stream().filter(reader -> {
            List<EmailAddress> list = map.get(Flag.OK);
            return list.contains(reader.getEmail());
        }).toList();
        okReaderList.forEach(System.out::println);
        List<Reader> tooMuchReaderList = library.getReaderList().stream().filter(reader -> {
            List<EmailAddress> list = map.get(Flag.TOO_MUCH);
            return list.contains(reader.getEmail());
        }).toList();
        tooMuchReaderList.forEach(System.out::println);
        String okay = okReaderList
                .stream()
                .map(reader -> String.join(" , ", reader.getName() + " " + reader.getSurname()))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(okay);
        String tooMuch = tooMuchReaderList
                .stream()
                .map(reader -> String.join(" , ", reader.getName() + " " + reader.getSurname()))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(tooMuch);
    }

    private static Map<Flag, List<EmailAddress>> getGroup(Library library) {
        List<EmailAddress> tooMuch = library.getReaderList()
                                            .stream()
                                            .filter(reader -> reader.getBookList().size() >= 2)
                                            .map(Reader::getEmail).toList();
        List<EmailAddress> ok = library.getReaderList()
                                       .stream()
                                       .filter(reader -> reader.getBookList().size() < 2)
                                       .map(Reader::getEmail).toList();
        Map<Flag, List<EmailAddress>> result = new HashMap<>();
        result.put(Flag.OK, ok);
        result.put(Flag.TOO_MUCH, tooMuch);
        return result;
    }

    private enum Flag {
        OK,
        TOO_MUCH
    }
}
