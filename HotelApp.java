public class HotelApp {
    public static void main(String[] args) {
    Cart cart = new Cart();
    HouseKeeping houseKeeping = new HouseKeeping();
    Valet valet = new Valet();
    FrontDesk frontDesk = new FrontDesk(houseKeeping, cart, valet);

    frontDesk.callCart(4);
    frontDesk.callValet("ILYALAN9");
    frontDesk.callHouseKeeping("EA-12");
    }
}
