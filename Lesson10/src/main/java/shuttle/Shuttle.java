package shuttle;

public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        int randomNumber = (int) (Math.random() * 11);
        return randomNumber > 3;
    }

    @Override
    public void starEngine() {
        System.out.println("«Двигатели Шатл запущены.\n" +
                "Все системы в норме.»");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");
    }
}
