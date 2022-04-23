package movieTheater;

public class Emagine extends Theater{

    private String specialEvent;
    public Emagine(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, String specialEvent) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D);
        this.specialEvent=specialEvent;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }
}
