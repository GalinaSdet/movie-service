package movieTheater;

public class Regal extends Theater{

    public String secondFloor;

    public Regal(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, String secondFloor) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D);
        this.secondFloor=secondFloor;
    }

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }
}
