//(Base-Class) General housing unit

public class HUnit {
    private String Address;
    private int Area;
    private int NumOBedRooms;
    private int NumOKitchens;
    private Boolean HaveGarden;
    private int NumOSkyLight;

    public HUnit(String Address , int Area , int NumOBedRooms , int NumOKitchens , Boolean HaveGarden  , int NumOSkyLight ){
        this.Address = Address;
        this.Area = Area;
        this.NumOBedRooms = NumOBedRooms;
        this.NumOKitchens = NumOKitchens;
        this.HaveGarden = HaveGarden;
        this.NumOSkyLight = NumOSkyLight;
    }

    public void DisplayDetails(){
     
       System.out.println("Address: " + Address );
       System.out.println("Area: " + Area);
       System.out.println("Number Of Rooms: " + NumOBedRooms);
       System.out.println("Number Of Kitchens: " + NumOKitchens);
       System.out.println("Garden Applied: " +(HaveGarden? "Yes" : "No"));
       System.out.println("The House Has: " + NumOSkyLight +  " SkyLights");

    }

}
