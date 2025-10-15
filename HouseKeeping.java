public class HouseKeeping implements HotelService{

    public void cleanRoom(String roomNumber){
        System.out.println("Cleaning room "+roomNumber + "\nDONE CLEANING THE ROOM\n");
    }
    @Override
    public void provideService() {
        System.out.println("Housekeeping service is requested.");
    }
}
