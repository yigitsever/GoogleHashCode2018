public class Coord {


    int x;
    int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distTo(Coord o) {
        return Math.abs(this.x - o.x) + Math.abs(this.y - o.y);
    }
}
