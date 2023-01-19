import by.tms.model.Book;
import by.tms.model.EmailAddress;
import by.tms.model.Library;
import by.tms.model.Reader;

import java.util.List;
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
        Book book1 = new Book("Стивен Кинг", "Зелёная миля", 2014);
        Book book2 = new Book("Маргарет Митчелл", "Унесённым ветром", 2012);
        Book book3 = new Book("Артур Конан Дойл", "Шерлок Холмс", 2011);
        Book book4 = new Book("Нора Сакавич", "Свита короля", 2010);
        Book book5 = new Book("Кэтрин Скоттен", "Прислуга", 2013);
        Book book6 = new Book("Джон Толкиен", "Возвращение государя", 2015);
        Book book7 = new Book("Мишель Пейер", "Гарри потер", 2016);
        Book book8 = new Book("Александр Дюма", "Граф Монте Кристо", 2017);

        Reader reader1 = new Reader("Вадим", "Амбрашкевич", new EmailAddress("vadimambr@bk.ru", "reader"), false, List.of(book1, book2, book3));
        Reader reader2 = new Reader("Антон", "Коледа", new EmailAddress("krylada@mail.ru", "reader"), false, List.of(book1, book2, book3));
        Reader reader3 = new Reader("Макс", "Миронь", new EmailAddress("miron@rambler.ru", "reader"), true, List.of(book4));
        Reader reader4 = new Reader("Джек", "Баулин", new EmailAddress("daniel@list.ru", "reader"), true, List.of(book5));
        Reader reader5 = new Reader("Даниил", "Григорьевич", new EmailAddress("123123123@mail.ru", "reader"), true, List.of(book1, book7, book8));

        Library library = new Library(List.of(book1, book2, book3, book4, book5, book6, book7, book8), List.of(reader1, reader2, reader3, reader4, reader5));

        List<Book> bookList = library.getBookList().stream().sorted(new Book.BookComparator()).toList();
        bookList.forEach(System.out::println);

        List<EmailAddress> emailAddressList = library.getReaderList().stream().map(reader -> reader.getEmail()).collect(Collectors.toList());
        emailAddressList.forEach(System.out::println);
//                List.of(new EmailAddress("vadimambr@bk.ru", "reader"),
//                new EmailAddress("krylada@mail.ru", "reader"),
//                new EmailAddress("miron@rambler.ru", "reader"),
//                new EmailAddress("miron@rambler.ru", "reader"),
//                new EmailAddress("daniel@list.ru", "reader"),
//                new EmailAddress("123123123@mail.ru", "reader"));
        System.out.println("--------------------------------");
        List<EmailAddress> emailAddressList1 = library.getReaderList()
                .stream().filter(Reader::getAgreed)
                .filter(reader -> reader.getBookList().size() > 1)
                .map(Reader::getEmail).toList();
        emailAddressList1.forEach(System.out::println);
    }
}
