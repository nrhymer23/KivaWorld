
import edu.duke.Point;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of KivaTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KivaTest1 {
    String defaultLayout = ""
        +"-------------\n"
        +"        P   *\n"
        +"    **      *\n"
        +"    **      *\n"
        +"  K       D *\n"
        +" * * * * * **\n"
        +"-------------\n";
    FloorMap defaultMap = new FloorMap(defaultLayout);

    public void kivatest1(){
        Kiva kiva = new Kiva(defaultMap);

        //expection starting point (2,4)
        Point initalLocation = kiva.getCurrentLocation();
        Point expectedLocation = new Point(2,4);

        if (sameLocation(initalLocation, expectedLocation)){
            System.out.println("First Arguement test SUCCESS");

        }else{
            System.out.println(String.format("First Arguement test FAIL: %s != (2,4)!", initalLocation));
        }

    }

    private boolean sameLocation(Point a, Point b){
        return a.getX() == b.getX() && a.getY() == b.getY();
    }

}
