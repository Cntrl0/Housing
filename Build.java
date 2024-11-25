public class Build {
    
    private String ConstrucMaterials;
    private int ConstrucCost;

    public Build(String ConstrucMaterials , int ConstrucCost){
        this.ConstrucMaterials = ConstrucMaterials;
        this.ConstrucCost = ConstrucCost;

    }

   public void ConsturctionDetails(){
 
      System.out.println("Starting Construction Using: " + ConstrucMaterials);
      System.out.println("Which costs: " + ConstrucCost + "$");

   }


}
