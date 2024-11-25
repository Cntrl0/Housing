public class HouseExe {
  
    public static void main(String[] arges){
      HUnit Housing = new HUnit("123 Elm Street", 250, 3, 2, true ,  2);
      System.out.println("House Details: " );
       Housing.DisplayDetails();
       
       Build Constuc = new Build("Brown Brick", 300000); 
        System.out.println("Building Details: ");  
         Constuc.ConsturctionDetails();
         System.out.println("\n");


        Renter Rent = new Renter(400000, 48);
        System.out.println("Renting Details: ");
          Rent.RentDetails();
          System.out.println("Total Rent Cost :");
          Rent.CalcTotalRent();          
         System.out.println("\n");


       Buyer Buy = new Buyer(400000000, true);
         System.out.println("House Details: ");
          Buy.BuyingDetails();
       
    }

}
