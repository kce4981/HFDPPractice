package src.HFDPPractice.Chpt2;

import java.util.ArrayList;

public class Forecast extends StandardChannel{

    private final ArrayList<String> weather;
    private int index;

    Forecast() {
        this.weather = new ArrayList<>();
        this.weather.add("Sunny");
        this.weather.add("Cloudy");
        this.weather.add("Rainy");
        this.weather.add("ThunderStorm");
        this.index = 0;
    }

    @Override
    public void update() {
        System.out.println("- Weather: Today will be " + weather.get(this.index % weather.size()) + " All day long!");
        this.index++;
    }
}
