//Задача1: Времена года
// * 1) Создать перечисление(enum), содержащее названия времен года.
// * 2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
// * 3) Создать метод, который принимает на вход переменную созданного вами enum типа.
// *  Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
// * 4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
// * 5) Добавить конструктор принимающий на вход среднюю температуру.
// * 6) Создать метод getDescription, возвращающий строку “Холодное время года”.
// *  Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
// * 7) В цикле распечатать все времена года, среднюю температуру и описание времени года.
package season;

public class SeasonDemo {
    public static void main(String[] args) {
        Seasons seasons = Seasons.WINTER;
        System.out.println(seasons);
        print(Seasons.SUMMER);
        printAllValues();
        Seasons seasons1 = Seasons.valueOf("SUMMER");
        System.out.println("Любимая время года:" + " " + seasons1);
    }

    public static void print(Seasons seasons) {
        switch (seasons) {
            case AUTUMN -> System.out.println("Я люблю осень");
            case SUMMER -> System.out.println("Я люблю лето");
            case SPRING -> System.out.println("Я люблю весну");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }

    public static void printAllValues() {
        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + "Температура" + " " + s.getAvgTemp() + " " + s.getDescription());
        }

    }


}


