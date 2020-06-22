import java.util.Scanner;//Keyboard reading.
/**
 * Write a description of class Dialema here.
 *
 * @author (Virgil)
 * @version (v2)
 * v1 added Scoreing Method 
 * v2 added Array for Com to decide what to do
 * Testing  github
 */
public class Dialema
{
    // instance variables - replace the example below with your own
    private int r;
    private int p;
    private int Com1;
    private int y;
    private int pScore;
    private int cScore;
    private int pTotal;
    private int cTotal;
    private String pChoice;
    private String cChoice;
    /**
     * Constructor for objects of class Dialema
     */
    public Dialema()//the main loop
    {
        Scanner inputStream = new Scanner(System.in);
        Scanner cInputString = new Scanner(System.in);
        
        System.out.println("press c to cooperate");
        System.out.println("press d to defect");
        String choice;
        cChoice = ("c");
        int x = 0;
        String pMoves[] = new String[4];
        for(r=0;r<4;r++){
            pChoice = inputStream.nextLine();
            if (pChoice.equals("c")){//this array stores the players moves for the com to access
                pMoves[x]=("c");
                x++;
            }  
            else if(pChoice.equals("d")){
                pMoves[x]=("d");
                x++;
            }
            System.out.println("Player Score " + pScore(pChoice,cChoice));
            System.out.println("Computer Score " + cScore(pChoice,cChoice));    
            pTotal = pTotal + pScore;
            cTotal = cTotal + cScore;
            System.out.println("Players Total Score " + pTotal);
            System.out.println("Coms Total Score " + cTotal);
        }
        r = 0;
    }
    private int pScore(String pPlayed,String cPlayed) //should change the change the players score
    {
        if(cChoice.equals("c")){
            if(pChoice.equals("c")){
                return pScore = 1;
            } 
            else{
                return pScore = 2;
            }            
        } 
        else if(cChoice.equals("d")){
            if(pChoice.equals("c")){
                return pScore = -5;
            } 
            else{
                return pScore = -3;
            }
        } 
        else{
            return 0;
        }
    }
    private int cScore(String pPlayed,String cPlayed) //should change the change the players score
    {
        if(pChoice.equals("c")){
            if(cChoice.equals("c")){
                return cScore = 1;
            } 
            else{
                return cScore = 2;
            }            
        } 
        else if(pChoice.equals("d")){
            if(cChoice.equals("c")){
                return cScore = -5;
            } 
            else{
                return cScore = -3;
            }
        } 
        else{
            return 0;
        }
    }
}
