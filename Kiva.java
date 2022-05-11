import edu.duke.Point;
/**
 * Write a description of Kiva here.
 * 
 * @rhymenoe Noel Rhymer
 * @V1 05/11/22
 */
public class Kiva {

    private Point currentLocation;
    private FacingDirection directionFacing;
    private FloorMap map;
    private boolean carryPod;
    private boolean successfullyDropped;
    // private ? motorLifetime;
    
   
    
    //Kiva Constructor I
    public Kiva(FloorMap defaultMap){
        map = defaultMap;
    }
    //Kiva Constructor II
    public Kiva(FloorMap defaultMap, Point initLocation){
        map = defaultMap;
        currentLocation = initLocation;
    }
    
    public boolean isCarryingPod(){
        return false;
    }
     
    public boolean isSuccessfullyDropped(){
        return false;
    }
    
    public void move(KivaCommand command){
        
    }
    
    public Point getCurrentLocation(){
        return currentLocation;
    }
    
   
    
    
    
    
    
    
    
    
}
