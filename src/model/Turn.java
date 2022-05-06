package model;

public class Turn {
    private int id;
    private String name;
    private boolean marked;

    public Turn(int id, String name, boolean marked) {
        this.id = id;
        this.name = name;
        this.marked = marked;
    }

    public Turn(String name, boolean marked) {
        this.name = name;
        this.marked = marked;
    }
}
