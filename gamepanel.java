import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class gamepanel extends JPanel{

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyparts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
        Timer timer;
        Random random;




    gamepanel(){
    random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    this.setBackground(Color.black);
    this.setFocusable(true);

    }

    public void startgame(){

    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g){

    }

    public void move(){

    }

    public void checkApple(){

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }



    public void actionPerformed(ActionEvent e) {
        
    }

    public class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e){

        }


    }

}