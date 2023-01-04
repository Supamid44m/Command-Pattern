//Concrete Command
public class DefendOrder implements Order {
    private Player player;

    public DefendOrder(Player player){
        this.player=player;
    }

    @Override
    public void execute() {
        player.defend();
        
    }
    
}
