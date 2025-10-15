public class Valet implements HotelService{
    public void pickUpVehicle (String plateNumber){
        System.out.println("Picking up vehicle "+plateNumber + "\nDONE PARKING THE VEHICLE\n");
    }

    @Override
    public void provideService() {
        System.out.println("Valet Service is requested.");
    }
}
