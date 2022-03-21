import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameField extends JPanel {

   private final int SIZE = 1024;
   private final int DOT_SIZE = 64;
   private final int ALL_DOTS = 32;
   private Image yellowBlock;
   private Image brownBlock;

   public GameField(){
       setBackground(Color.orange);
       setFocusable(true);
       initGame();

   }

   public void initGame(){


   }

   public void loadImages(){
       ImageIcon ye = new ImageIcon("yellow.jpg");
       yellowBlock = ye.getImage();
       ImageIcon br = new ImageIcon("brown.jpg");
       brownBlock = br.getImage();
   }

   public void Board(){

   }



}
