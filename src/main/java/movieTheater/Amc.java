package movieTheater;

public class Amc extends Theater implements MovieService{

    private boolean hasVr;
 //   private  Faker faker;

    public Amc(int numOfSeats, boolean hasPopcorn, int numOfRooms, int numOfRestrooms, boolean has3D, boolean hasVr) {
        super(numOfSeats, hasPopcorn, numOfRooms, numOfRestrooms, has3D);
        this.hasVr=hasVr;
    }

    public boolean isHasVr() {
        return hasVr;
    }

    public void setHasVr(boolean hasVr) {
        this.hasVr = hasVr;
    }



    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to AMC!");
    }

    @Override
    public void showAvailableMovies() {
        String [] movies= {"one1","two2"};


        System.out.println("Abvailable "+movies[0]+" and "+movies[1]+".");
        }



    @Override
    public void showAvailableSeats(String movie) {
        System.out.println((int)(Math.random()+100));
        }



    @Override
    public void showTheaterInfo() {
        System.out.println(this);
    }
    @Override
    public String toString(){
       return "AMC INFO"+
               "Number of Seats: "+getNumOfSeats();
    }
}
