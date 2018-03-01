public class Ride {

    public int Time_start;
    public int Time_latest;
    public int potential_score;
    public Coord start;
    public Coord dest;

    public  Ride(Coord start, Coord dest, int T_start, int T_latest) {
        this.Time_start = T_start;
        this.Time_latest = T_latest;
        this.start=start;
        this.dest=dest;

    }


}