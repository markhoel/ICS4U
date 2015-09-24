import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {
    int x = 0;
  int y = 0;
    private void blahblahblah() {
        x = x + 1;
        y = y + 1;
    }
    @Override
public void paint(Graphics g) {
        super.paint(g);
       Graphics2D g2d = (Graphics2D) g;
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
         RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame thing = new JFrame("Sample Frame");
Game game = new Game();
        thing.add(game);
      thing.setSize(300, 400);
       thing.setVisible(true);
        thing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
          game.blahblahblah();
        game.repaint();
           Thread.sleep(10);
        }
}
}
