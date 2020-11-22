public class BaseBurger {

    private String name;
    private String rollType;
    private String meat;
    private int basicPrice;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private int lettucePrice = 40;
    private int tomatoPrice = 30;
    private int carrotPrice = 20;
    private int picklePrice = 15;
    private int onionPrice = 10;
    private int cheesePrice = 5;

    public BaseBurger(String name, String rollType, String meat, int basicPrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
    }

    public void setAddition(String addition1, String addition2, String addition3, String addition4){
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public void setAddition(String addition1, String addition2, String addition3){
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
    }

    public void setAddition(String addition1, String addition2){
        this.addition1 = addition1;
        this.addition2 = addition2;
    }

    public void setAddition(String addition1){
        this.addition1 = addition1;
    }

    public int details(){
        int totalPrice = this.basicPrice;
        System.out.println("Name: " + this.name);
        System.out.println("RollType: " + this.rollType);
        System.out.println("Meat: " + this.meat);
        System.out.println("Basic price: " + this.basicPrice);

        if(addition1 != null){
            if(addition1 == "lettuce"){
                System.out.println("Addition1: lettuce $" + this.lettucePrice);
                totalPrice = totalPrice + this.lettucePrice;
            }
            else if(addition1 == "tomato"){
                System.out.println("Addition1: tomato $" + this.tomatoPrice);
                totalPrice = totalPrice + this.tomatoPrice;
            }
            else if(addition1 == "carrot"){
                System.out.println("Addition1: carrot $" + this.carrotPrice);
                totalPrice = totalPrice + this.carrotPrice;
            }
            else if(addition1 == "pickle"){
                System.out.println("Addition1: pickle $" + this.picklePrice);
                totalPrice = totalPrice + this.picklePrice;
            }
            else if(addition1 == "onion"){
                System.out.println("Addition1: onion $" + this.onionPrice);
                totalPrice = totalPrice + this.onionPrice;
            }
            else if(addition1 == "cheese"){
                System.out.println("Addition1: cheese $" + this.cheesePrice);
                totalPrice = totalPrice + this.cheesePrice;
            }
        }
        if(addition2 != null){
            if(addition2 == "lettuce"){
                System.out.println("Addition2: lettuce $" + this.lettucePrice);
                totalPrice = totalPrice + this.lettucePrice;
            }
            else if(addition2 == "tomato"){
                System.out.println("Addition2: tomato $" + this.tomatoPrice);
                totalPrice = totalPrice + this.tomatoPrice;
            }
            else if(addition2 == "carrot"){
                System.out.println("Addition2: carrot $" + this.carrotPrice);
                totalPrice = totalPrice + this.carrotPrice;
            }
            else if(addition2 == "pickle"){
                System.out.println("Addition2: pickle $" + this.picklePrice);
                totalPrice = totalPrice + this.picklePrice;
            }
            else if(addition2 == "onion"){
                System.out.println("Addition2: onion $" + this.onionPrice);
                totalPrice = totalPrice + this.onionPrice;
            }
            else if(addition2 == "cheese"){
                System.out.println("Addition2: cheese $" + this.cheesePrice);
                totalPrice = totalPrice + this.cheesePrice;
            }
        }
        if(addition3 != null){
            if(addition3 == "lettuce"){
                System.out.println("Addition3: lettuce $" + this.lettucePrice);
                totalPrice = totalPrice + this.lettucePrice;
            }
            else if(addition3 == "tomato"){
                System.out.println("Addition3: tomato $" + this.tomatoPrice);
                totalPrice = totalPrice + this.tomatoPrice;
            }
            else if(addition3 == "carrot"){
                System.out.println("Addition3: carrot $" + this.carrotPrice);
                totalPrice = totalPrice + this.carrotPrice;
            }
            else if(addition3 == "pickle"){
                System.out.println("Addition3: pickle $" + this.picklePrice);
                totalPrice = totalPrice + this.picklePrice;
            }
            else if(addition3 == "onion"){
                System.out.println("Addition3: onion $" + this.onionPrice);
                totalPrice = totalPrice + this.onionPrice;
            }
            else if(addition3 == "cheese"){
                System.out.println("Addition3: cheese $" + this.cheesePrice);
                totalPrice = totalPrice + this.cheesePrice;
            }
        }
        if(addition4 != null){
            if(addition4 == "lettuce"){
                System.out.println("Addition4: lettuce $" + this.lettucePrice);
                totalPrice = totalPrice + this.lettucePrice;
            }
            else if(addition4 == "tomato"){
                System.out.println("Addition4: tomato $" + this.tomatoPrice);
                totalPrice = totalPrice + this.tomatoPrice;
            }
            else if(addition4 == "carrot"){
                System.out.println("Addition4: carrot $" + this.carrotPrice);
                totalPrice = totalPrice + this.carrotPrice;
            }
            else if(addition4 == "pickle"){
                System.out.println("Addition4: pickle $" + this.picklePrice);
                totalPrice = totalPrice + this.picklePrice;
            }
            else if(addition4 == "onion"){
                System.out.println("Addition4: onion $" + this.onionPrice);
                totalPrice = totalPrice + this.onionPrice;
            }
            else if(addition4 == "cheese"){
                System.out.println("Addition4: cheese $" + this.cheesePrice);
                totalPrice = totalPrice + this.cheesePrice;
            }
        }

        return totalPrice;
    }
}
