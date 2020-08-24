import java.util.Scanner;//Keyboard reading.
/**
 * Write a description of class Dialema here.
 *
 * @author (Virgil)
 * @version (v2)
 * 7/6/20 v1 added Scoring Method .
 * 14/6/20 v2 added Array for Com to decide what to do.
 * 17/6/20 Testing  github.
 * 29/6/20 Starting on computers method to decide it's move.
 * 20/7/20 Made Progress on Method.
 * 22/7/20 Currently computer changes to "c" on round 3 (works but not as i want it to).
 */
public class Dialema
{
    // The variables that the code uses.
    private int r;
    private int y;
    private int pScore;
    private int cScore;
    private int pTotal;
    private int cTotal;
    private int cs; 
    private int hr;
    private int x;
    private String pChoice;
    private String cChoice;
    /**
     * Constructor for objects of class Dialema
     */
    public Dialema()//the main loop
    {
        Scanner inputStream = new Scanner(System.in);
        //Scanner cInputString = new Scanner(System.in);
        System.out.println("press c to cooperate");
        System.out.println("press d to defect");
        String choice;
        cChoice = ("c");
        x = 1;
        y = 1;
        cs = 0;
        String pMoves[] = new String[10];
        String cMoves[] = new String[10];
        for(r=1;r<10;r++){
            pChoice = inputStream.nextLine();
            if(r>2){
                if(pMoves[x-1].equals("d")){
                    cChoice=("d");
                } else if (cMoves[y-1].equals("d")) {
                    cChoice=("d");
                } else if (r>5) {
                    cChoice=("d");
                } else {
                    cChoice=("c");
                }
            }
            if (pChoice.equals("c")){ //this array stores the players moves for the com to access
                pMoves[x]=("c");
                x++;
            }  
            else if(pChoice.equals("d")){
                pMoves[x]=("d");
                x++;
            }
            if (cChoice.equals("c")){ //this array stores the players moves for the com to access
                cMoves[y]=("c");
                y++;
            }  
            else if(cChoice.equals("d")){
                cMoves[y]=("d");
                y++;
            }
            System.out.println("Player Score " + pScore(pChoice,cChoice));
            System.out.println("Computer Score " + cScore(pChoice,cChoice));    
            pTotal = pTotal + pScore;
            cTotal = cTotal + cScore;
            System.out.println("Players Total Score " + pTotal);
            System.out.println("Coms Total Score " + cTotal);
        }
    }

    private int pScore(String pPlayed,String cPlayed) //manages the players score
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

    private int cScore(String pPlayed,String cPlayed) //manages the computers score
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
