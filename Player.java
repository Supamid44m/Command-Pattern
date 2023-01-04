// The Receiver 
public class Player {
    private String position;
    private int Score = 0;

    public Player(String position){
        this.position = position;
        this.Score = 0;
    }

    public void shoot(){
        Score++ ;
        System.out.println(position +" "+ "scored"+" "+Score);
    }

    public void defend(){
        System.out.println(position +" "+ "Defend other player");
    }
}
