public class HealthBurger extends BaseBurger{
    private String pickAddition1;
    private String pickAddition2;

    public HealthBurger(String meat, int basicPrice) {
        super("Health Burger","Brown rye bread roll", meat, basicPrice);
    }

    public void pick(String pickAddition1, String pickAddition2){
        this.pickAddition1 = pickAddition1;
        this.pickAddition2 = pickAddition2;
    }

    @Override
    public int details() {
        int totalPrice = super.details();
        System.out.println("PickAddition1: " + this.pickAddition1);
        System.out.println("PickAddition2: " + this.pickAddition2);
        return totalPrice;
    }
}
