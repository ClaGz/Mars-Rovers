import models.Facing;
import models.Mars;
import models.Location;
import models.Rover;

public class Application {
    public static void main(String[] args) {
        Mars mars = new Mars(5, 5);

        int roverStartX = 1;
        int roverStartY = 2;
        Facing facing = Facing.N;

        Location location = new Location(mars, roverStartX, roverStartY, facing);

        Rover rover = new Rover(location);
        rover.move("L","M","L","M","L","M","L","M","M");

        System.out.println(rover.actualLocation());
    }
}