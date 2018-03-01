public class Coord {


    int x;
    int y;

    public int distTo(Coord o) {
        return Math.abs(this.x - o.x) + Math.abs(this.y - o.y);
    }
}
