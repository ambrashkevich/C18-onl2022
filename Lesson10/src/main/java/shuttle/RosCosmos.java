package shuttle;

public class RosCosmos implements IStart {
    @Override
    public boolean checkSystem() {
        int randomNumber1 = (getRandom());
        boolean checkController1 = check(randomNumber1);
        int randomNumber2 = (getRandom());
        boolean checkController2 = check(randomNumber1);
        int randomNumber3 = (getRandom());
        boolean checkController3 = check(randomNumber1);
        return checkController1 && checkController2 && checkController3;

    }

    private boolean check(int number) {
        return number % 2 == 0;
    }

    private int getRandom() {
        return (int) (Math.random() * 11);
    }

    @Override
    public void starEngine() {
        System.out.println("Двигатель запущен. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт роскосмос");
    }
}
