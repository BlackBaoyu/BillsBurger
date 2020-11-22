public class DeluxeBurger extends BaseBurger{
    private String regularAddition1;
    private String regularAddition2;

    public DeluxeBurger(String rollType, String meat, int basicPrice) {
        super("Deluxe Burger", rollType, meat, basicPrice);
        this.regularAddition1 = "Chips";
        this.regularAddition2 = "Drinks";
    }

    @Override
    public void setAddition(String addition1, String addition2, String addition3, String addition4) {
        System.out.println("Cannot add additional items!");
        super.setAddition(null, null, null, null);
    }

    @Override
    public void setAddition(String addition1, String addition2, String addition3) {
        System.out.println("Cannot add additional items!");
        super.setAddition(null, null, null);
    }

    @Override
    public void setAddition(String addition1, String addition2) {
        System.out.println("Cannot add additional items!");
        super.setAddition(null, null);
    }

    @Override
    public void setAddition(String addition1) {
        System.out.println("Cannot add additional items!");
        super.setAddition(null);
    }

    @Override
    public int details() {
        int totalPrice = super.details();
        System.out.println("RegularAddition1: " + this.regularAddition1);
        System.out.println("RegularAddition2: " + this.regularAddition2);
        return totalPrice;
    }
}
