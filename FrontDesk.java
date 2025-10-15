public class FrontDesk {
    private Cart cart;
    private HouseKeeping houseKeeping;
    private Valet valet;

    public FrontDesk(HouseKeeping houseKeeping, Cart cart, Valet valet) {
        this.cart = cart;
        this.houseKeeping = houseKeeping;
        this.valet = valet;
    }
    public void  callCart (int numberOfCarts) {
        cart.provideService();
        cart.requestCart(numberOfCarts);
    }
    public void callHouseKeeping(String roomNumber) {
        houseKeeping.provideService();
        houseKeeping.cleanRoom(roomNumber);
    }
    public void callValet(String plateNumber) {
        valet.provideService();
        valet.pickUpVehicle(plateNumber);
    }
}
