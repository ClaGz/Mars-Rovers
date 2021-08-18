package models;

public class Location {
    private Mars mars;
    private int x;
    private int y;
    private Facing facing;

    public Location(Mars mars, int x, int y, Facing facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public String getActualPosition() {
        return String.format("%s %s %s", this.x, this.y, this.facing);
    }

    public void move(String command) {
        //TODO: validations em cima do mapa
        //TODO: refactor com design patterns
        if(command.equals("L")) {
            if(facing.equals(Facing.N)){
                facing = Facing.W;
            } else if(facing.equals(Facing.E)){
                facing = Facing.N;
            } else if(facing.equals(Facing.W)){
                facing = Facing.S;
            } else if(facing.equals(Facing.S)){
                facing = Facing.E;
            }
        }
        if(command.equals("R")) {
            if(facing.equals(Facing.N)){
                facing = Facing.E;
            } else if(facing.equals(Facing.E)){
                facing = Facing.S;
            } else if(facing.equals(Facing.W)){
                facing = Facing.N;
            } else if(facing.equals(Facing.S)){
                facing = Facing.W;
            }
        }
        if(command.equals("M")) {
            if(facing.equals(Facing.N)){
                y++;
            } else if(facing.equals(Facing.E)){
                x++;
            } else if(facing.equals(Facing.W)){
                x--;
            } else if(facing.equals(Facing.S)){
                y--;
            }
        }
    }
}
