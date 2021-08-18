package models;

import java.util.Arrays;

public class Rover {
    private Location location;

    public Rover(Location location) {
        this.location = location;
    }

    public String actualLocation() {
        return this.location.getActualPosition();
    }

    public void move(String... commands) {
        Arrays.asList(commands).forEach(command -> {
            this.location.move(command);
        });
    }

    public void turn() {

    }
}
