public class Cart implements HotelService{

    public void requestCart(int numberOfCarts){
        System.out.println("Cart Service delivering " + numberOfCarts + " cart/s.\nDONE DELIVERING CART\n");
    }
    @Override
    public void provideService() {
        System.out.println("Cart service is requested.");
    }
}
