package season;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public enum Seasons {
    AUTUMN(12),
    WINTER(-20),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    SPRING(10);
    private final int avgTemp;

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}


