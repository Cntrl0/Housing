public class Renter {
         
    private int MonthltyRent;
    private int LeaseTermInMonths; //مدة الايجار
    
    public Renter(int MonthltyRent , int LeaseTermInMonths){
        this.MonthltyRent = MonthltyRent;
        this.LeaseTermInMonths = LeaseTermInMonths;
        
    }

    public void RentDetails(){
      System.out.println("Monthly Rent: " + MonthltyRent);
      System.out.println("Lease Term: " + LeaseTermInMonths + "Months");

    }

    public int CalcTotalRent(){
      return MonthltyRent * LeaseTermInMonths;

    }
}
