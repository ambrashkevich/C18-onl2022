package shuttle;

public class SpaceX implements IStart{
    @Override
    public boolean checkSystem() {
        int randomNumber = (int)(Math.random()*11);
        return randomNumber >3;
    }

    @Override
    public void starEngine() {
        System.out.println("Двигатель запущен. Все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Старт spaceX");
    }
}
