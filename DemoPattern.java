public class DemoPattern {
    public static void main(String[] args) {
        Player player1 = new Player("Point Guard");
        Player player2 = new Player("Shooting Guard");
        Player player3 = new Player("Center");
        Player player4 = new Player("Small Forward");
        Player player5 = new Player("Power Forward");

        Coach coach = new Coach();
        coach.setOrder(new ShootingOrder(player1));
        coach.setOrder(new ShootingOrder(player2));
        coach.setOrder(new DefendOrder(player5));
        coach.setOrder(new DefendOrder(player3));
        coach.setOrder(new DefendOrder(player4));

        coach.giveOrders();
    }
    
}
