import edu.duke.Point;
/**
 * Write a description of KivaConstructorTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KivaConstructorTest {
    String defaultLayout = ""
                            +"-------------\n"
                            +"        P   *\n"
                            +"    **      *\n"
                            +"    **      *\n"
                            +"  K       D *\n"
                            +" * * * * * **\n"
                            +"-------------\n";
    FloorMap defaultMap = new FloorMap(defaultLayout);
    
    public void testSingleArgumentConstructor(){
        //Given 
        //Defaultmap defined above
        
        Kiva kiva = new Kiva(defaultMap);
        
        
        //expection starting point (2,4)
        Point initialLocation = kiva.getCurrentLocation();
        Point expectedLocation = new Point(2,4);
        if (sameLocation(initialLocation, expectedLocation)== true){
            System.out.println("First Arguement test SUCCESS");

        }else{
            System.out.println(String.format("First Arguement test FAIL: %s != (2,4)!", initialLocation));
        }
    }
    private boolean sameLocation(Point a, Point b){
        return a.getX() == b.getX() && a.getY() == b.getY();
    }
}
