// Concrete Command
public class ShootingOrder implements Order {
    private Player player;

    public ShootingOrder(Player player){
        this.player=player;
    }
    

    @Override
    public void execute() {
        player.shoot();
        
    }
    
}
