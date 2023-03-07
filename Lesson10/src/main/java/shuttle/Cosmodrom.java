package shuttle;

public class Cosmodrom {
    private IStart rocket;

    public void start(IStart rocket) {
        if (rocket.checkSystem()) {
            rocket.starEngine();
            countdown();
            rocket.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }


    private void countdown() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
