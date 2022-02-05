import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // pack compinents into frame
        this.setVisible(true);
        this.setLocationRelativeTo(null); // window appear middle of screen
    }
}