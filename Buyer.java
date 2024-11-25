public class Buyer {
    
    private int HousePrice;
    private boolean IsMortgage;

    public Buyer(int HousePrice , boolean IsMortgage){
      this.HousePrice = HousePrice;
      this.IsMortgage = IsMortgage;

    }

    public void BuyingDetails(){
        System.out.println("House Price: " + HousePrice);
        System.out.println("Mortgage Appliede? : " + (IsMortgage? "Yes" : "No"));

    }
    

}
