import java.io.*;
import java.util.ArrayList;
import java.util.Queue;

public class Parser {


    private String fileName = "tests/a.in";
    private String line = null;

    public ArrayList<Car> cars;
    public Queue<Ride> passengers;
    public int T;
    public int B;

    public Parser() {
        try

        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();

            String valS[] = line.split(" ");

            int val[] = new int[valS.length];
            int i = 0;
            for (String s : valS) {
                val[i++] = Integer.parseInt(s);
            }

            int R = val[0]; // city height (rows)
            int C = val[1]; // city width (cols)
            int F = val[2]; // Number of cars
            int N = val[3]; // Number of rides
            this.B = val[4]; // City bonus
            this.T = val[5]; // Simulation time

            for (int j = 0; j < N; j++) {
                String rideline = bufferedReader.readLine();
                String rideVals[] = rideline.split(" ");
                passengers.add(
                        new Ride(
                                new Coord(Integer.parseInt(rideVals[0]), Integer.parseInt(rideVals[1])),
                                new Coord(Integer.parseInt(rideVals[2]), Integer.parseInt(rideVals[3])),
                                Integer.parseInt(rideVals[4]),
                                Integer.parseInt(rideVals[5])
                        )
                );
            }

            for (int j = 0; j < F; j++) {
                cars.add(new Car());
            }


            // Always close files.
            bufferedReader.close();
        } catch (
                FileNotFoundException ex)

        {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (
                IOException ex)

        {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }


    public Queue<Ride> getPassengers() {
        return passengers;
    }


    public int getT() {
        return T;
    }


    public int getB() {
        return B;
    }


}
