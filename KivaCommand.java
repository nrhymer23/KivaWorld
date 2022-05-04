
/**
 * Write a description of file here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum KivaCommand {
    
    FORWARD('F'),
    TURN_RIGHT('R'), 
    TURN_LEFT('L'), 
    TAKE('T'),
    DROP('D');
    
   private char directionKey;
   
   private KivaCommand(char directionKey){
       this.directionKey = directionKey;
    }
   
    public char getDirectionKey(){
        return directionKey;
    }
    
    
    
    //public class KivaCommandTester {
   // public void testForward(){
      //  KivaCommand command = KivaCommand.FORWARD;
      //  System.out.println(command);
      //  System.out.println(command.getDirectionKey());
    //}
   
 }





