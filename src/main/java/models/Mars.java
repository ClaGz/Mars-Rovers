package models;
import java.util.ArrayList;
import java.util.List;

public class Mars {
    private static final int START_X = 0;
    private static final int START_Y = 0;
    private static int END_X;
    private static int END_Y;

    //TODO: Tonar mais java8
    private List map = new ArrayList();

    public Mars(int endX, int endY) {
        END_X = endX;
        END_Y = endY;
    }

}
