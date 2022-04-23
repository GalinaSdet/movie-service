package movieTheater;

public class Ipic extends Theater{

    private String dinner;



    public Ipic(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, String dinner)
    {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D);
        this.dinner = dinner;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
}
