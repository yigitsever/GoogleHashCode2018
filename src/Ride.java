public class Ride{
    public int destination;
    public int Time_start;

    public  void Ride(){




    }
    public void find_dest(Coord start ,Coord finish) {

        destination = Math.abs(start.x - finish.x) + Math.abs(start.y - finish.y);

    }



}