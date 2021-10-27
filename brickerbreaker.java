import javax.swing.*;

public class brickerbreaker {
    public stati void main(String[] args){
        JFrame obj = new JFrame();
        GamePlay gamePlay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
